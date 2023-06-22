package ex2;
import java.sql.*;
import java.util.Scanner;

public class Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // JDBC Drivers
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create a connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesrep", "root", "segate");

        // Prepare the SQL statement with placeholders
        String sql = "INSERT INTO SalesRep(Rep_ID, Name, City, Commission) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Rep_ID: ");
        String Rep_ID = scanner.nextLine();
        System.out.print("Enter Name: ");
        String Name = scanner.nextLine();
        System.out.print("Enter City: ");
        String City = scanner.nextLine();
        System.out.print("Enter Commission: ");
        String Commission = scanner.nextLine();

        // Set the values for the placeholders
        preparedStatement.setString(1, Rep_ID);
        preparedStatement.setString(2, Name);
        preparedStatement.setString(3, City);
        preparedStatement.setString(4, Commission);

        // Execute the query
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Data inserted successfully!");
        } else {
            System.out.println("Failed to insert data!");
        }

        // Close the resources
        preparedStatement.close();
        connection.close();
        scanner.close();
    }
}

