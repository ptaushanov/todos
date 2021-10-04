# ToDo App  
  
### An app for managing basic tasks  
  
A basic app for tracking tasks of individual users.  
Tasks can be created, updated, and deleted.  
Tasks can expire or persist.  
  
## Built With:  
  
* [IntelliJ Idea](https://www.jetbrains.com/idea/) - *The IDE used*  
  
## Created using:  
  
* [Connector/J 8.0.26](https://dev.mysql.com/downloads/connector/j/) - *MySQL JDBC Connector*  
* [Swing](https://dev.mysql.com/downloads/connector/j/) - *Swing GUI*  
* [MySQL](https://www.mysql.com/) - *MySQL DB*  
  
## Contributors:  
  
* **Boyana Maksimova** - [Boyyana](https://github.com/Boyyana)  
* **Petar Taushanov** - [ptaushanov](https://github.com/ptaushanov)  
* **Silviyan Martinov** - [Silviyan](https://github.com/Silviyan)  
  
## Setting up the project  
  
Install Java SE Development Kit 11 (if not installed) https://www.oracle.com/java/technologies/javase-jdk11-downloads.html  
  
* Clone the GitHub repository:    
  `` git clone https://github.com/ptaushanov/todos.git ``  
* Add JDK 11 as the project's current JDK in your IDE (if asked)  
  
* Add the MySQL JDBC connector as a project library in your IDE:    
  (Path: `lib/mysql-connector-java-8.0.26.jar`)  
  
  
## Setting up the database 
  
Install MySQL (if not installed) from here:  
https://dev.mysql.com/downloads/installer
  
* Run the queries from the setup file  
  (Path: setup/mysql/setup.sql) OR run the `setup.sh` script from `./setup/mysql/setup.sh`
  
* Configure the host, port, username and password in the **config** file   
  * Open file `db.config`  (Path: `./setup/mysql/db.config`)  
  * Add/Replace the **host** after the `=` sign  
  * Add/Replace the **port** after the `=` sign  
  * Add/Replace the **username** after the `=` sign    
  * Add/Replace the **password** after the `=` sign  
  * Save the changes  
  
## Running the project  

Main entry point: `src/com/tu/base/Main.java`

## License  
  
This project is licensed under the MIT License - *see  
the* [LICENSE.md](https://github.com/ptaushanov/todos/blob/development/LICENSE) *file for details.*