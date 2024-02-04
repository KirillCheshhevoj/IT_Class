package Lesson_30_sql.statement;

import Lesson_30_sql.model.Staff;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("MySQL Connect Example.");
        String url = "jdbc:mysql://localhost:3306/po_2209";
        String dbName = "temp";
        String userName = "root";
        String password = "";
        try
            //Class.forName("com.mysql.jdbc.Driver");
                (Connection conn = DriverManager.getConnection(url, userName, password);
                 Statement st = conn.createStatement()) {
            System.out.println("Connected to the database");

//            String querry = "INSERT INTO staff(name, age, department, project) VALUE ('employee11', 27, 5, 3)";
//            st.execute(querry);

            List<Staff> staff = new ArrayList<>();
            String querry = "SELECT name, age, department, project FROM staff";
            st.executeQuery(querry);
            ResultSet resultSet = st.executeQuery(querry);
            while (resultSet.next()) {
                String name = resultSet.getString(1);
                int age = resultSet.getInt("age");
                int department = resultSet.getInt(3);
                int project = resultSet.getInt("project");
                staff.add(new Staff(name, age, department, project));
            }

            staff.forEach(System.out::println);
            conn.close();
            System.out.println("Disconnected from database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



