//package com.tu.db;
//
//import com.tu.base.entities.Task;
//import com.tu.base.entities.User;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class DatabaseManager {
//
//    private Connection connection;
//    private final DBConfiguration config;
//
//    public DatabaseManager(String host , String port, String user, String password) {
//        config = new DBConfiguration(host, port, user, password);
//    }
//
//    public void connect(){
//        String url = String.format("jdbc:mysql://%s:%s/todo_project", config.getHost(), config.getPort());
//        String user = config.getUser();
//        String password = config.getPassword();
//
//        try {
//            this.connection = DriverManager.getConnection(url, user, password);
//        }
//        catch (SQLException e) {
//            System.err.println("Can't connect to database!");
//        }
//    }
//
//    // A very bad idea
//    public List<Task> getAllTasks() throws SQLException {
//        List<Task> tasks = new ArrayList<Task>();
//
//        Statement statement = connection.createStatement();
//        ResultSet tasksResultSet = statement.executeQuery("SELECT * FROM task;");
//
//        while (tasksResultSet.next()){
//            Integer id = tasksResultSet.getInt("id");
//            String title = tasksResultSet.getString("subject");
//            String description = tasksResultSet.getString("content");
//            String importance = tasksResultSet.getString("priority");
//            Integer userId = tasksResultSet.getInt("user_id");
//            Date dueDate = tasksResultSet.getDate("due_date");
//
//            tasks.add(new Task(id, title, description, importance,userId, dueDate));
//        }
//
//        return tasks;
//    }
//
//    // Even worse of an idea
//    public List<User> getAllUsers() throws SQLException {
//        List<User> users = new ArrayList<User>();
//
//        Statement statement = connection.createStatement();
//        ResultSet usersResultSet = statement.executeQuery("SELECT * FROM user;");
//
//        while (usersResultSet.next()){
//            Integer id = usersResultSet.getInt("id");
//            String username = usersResultSet.getString("email");
//            String password = usersResultSet.getString("password");
//
//            users.add(new User(id, username, password));
//        }
//
//        return users;
//    }
//
//    // Data loss ???
//    public void saveAllUsers(List<User> userList) throws SQLException {
//
//        Statement statement = connection.createStatement();
//        statement.executeUpdate("DROP TABLE user;");
//        statement.executeUpdate("CREATE TABLE user;");
//
//        List<String> preppedUsers = userList
//                .stream()
//                .map(u -> String.format("(%s, %s, %s);", u.getId(), u.getUsername(), u.getPassword()))
//                .collect(Collectors.toList());
//
//        for(String preppedUser : preppedUsers){
//            statement.executeUpdate("INSERT INTO user VALUES " + preppedUser);
//        }
//
//    }
//
//
//}
