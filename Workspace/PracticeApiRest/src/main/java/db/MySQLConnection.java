package db;

import dto.Course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection {

    private Connection connection;

    public MySQLConnection() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException a) {
            a.printStackTrace();
        }
    }

    public void connect(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://200.3.193.22:3306/P09728_1_11", "P09728_1_11", "ZCSaQGZU");
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void disconnect(){
        try{
            connection.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void insertCourse(Course course) {
        try {
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO materias(id,nombre,NRC) values ('$ID','$NOMBRE','$NRC')"
                    .replace("$ID", course.getId())
                    .replace("$NOMBRE", course.getName())
                    .replace("$NRC", course.getNRC());
            statement.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void createDatabase(){
        try {
            connect();
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS teachers(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), faculty varchar (100))");
            statement.execute("CREATE TABLE IF NOT EXISTS  courses(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), program varchar (100), teacherID INT, FOREIGN KEY (teacherID) REFERENCES teachers(id))");
            statement.execute("CREATE TABLE IF NOT EXISTS  students(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), code varchar (100))");
            statement.execute("CREATE TABLE IF NOT EXISTS  students_courses(id INT PRIMARY KEY AUTO_INCREMENT, studentID INT, courseID INT, FOREIGN key (studentID) REFERENCES students(id), FOREIGN KEY (courseID) REFERENCES courses(id))");
            statement.execute("CREATE TABLE IF NOT EXISTS  trials(id INT PRIMARY KEY AUTO_INCREMENT)");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            disconnect();
        }

    }
    public void executeSQL(String sql){
        try {
            connect();
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            disconnect();
        }

    }

}
