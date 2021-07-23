//package com.tu.db;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.net.URL;
//import java.util.Arrays;
//import java.util.HashMap;
//
//public class DBConfiguration {
//    private String host;
//    private String port;
//    private String user;
//    private String password;
//
//    public static DBConfiguration fromFile(URL url) {
//        HashMap<String, String> config = new HashMap<>();
//
//        try (BufferedReader br = new BufferedReader(new FileReader(url.getPath()))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] parts  = Arrays.stream(line.split("=")).map(String::trim).toArray(String[]::new);
//                config.put(parts[0], parts[1]);
//            }
//        } catch (FileNotFoundException e) {
//            System.err.println("Configuration file was not found!");
//            return null;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return new DBConfiguration(config.get("host"), config.get("port"), config.get("user"), config.get("password"));
//    }
//
//    public DBConfiguration(String host, String port, String user, String password) {
//        this.host = host;
//        this.port = port;
//        this.user = user;
//        this.password = password;
//    }
//
//    public String getHost() {
//        return host;
//    }
//
//    public String getPort() {
//        return port;
//    }
//
//    public String getUser() {
//        return user;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//}
