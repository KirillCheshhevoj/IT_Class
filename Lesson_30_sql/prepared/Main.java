package Lesson_30_sql.prepared;

import Lesson_30_sql.model.Staff;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/po_2209";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String CLASS_PATH = "com.mysql.jdbc.Driver";

    public static void main(String[] args) {

//        try {
//            Class.forName(CLASS_PATH);
//        } catch (ClassNotFoundException exception) {
//            exception.printStackTrace();
//        }

        String query = "SELECT name, age, department, project FROM staff WHERE age > ? AND department = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement ps = conn.prepareStatement(query)){

            List<Staff> staff = new ArrayList<>();
            ps.setInt(1, 15);
            ps.setInt(2, 1);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString(1);
                int age = resultSet.getInt("age");
                int department = resultSet.getInt(3);
                int project = resultSet.getInt("project");
                staff.add(new Staff(name, age, department, project));
            }

            staff.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
