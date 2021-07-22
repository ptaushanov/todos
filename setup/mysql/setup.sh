#! /bin/sh.
echo MySQL DB creation script
echo Before we proceed please be sure that MySQL is running
read -p "Is it running? " -n 1 -r
echo
if [[ $REPLY =~ ^[Yy]$ ]]
then
    echo "* Host *"
    read hostname
    echo "* Port *"
    read port
    echo "* User *"
    read user

    echo Creating database
    mysql -h "$hostname" -u "$user" -P "$port" -p -e "CREATE DATABASE IF NOT EXISTS todo_project;"
    echo Running setup.sql ...
    mysql -h "$hostname" -u "$user" -P "$port" -p todo_project < setup.sql

    read -p "Do you want to add the example data from data.sql? " -n 1 -r
    echo

    if [[ $REPLY =~ ^[Yy]$ ]]
    then
      echo Running data.sql ...
      mysql -h "$hostname" -u "$user" -P "$port" -p todo_project < data.sql
    fi
fi

