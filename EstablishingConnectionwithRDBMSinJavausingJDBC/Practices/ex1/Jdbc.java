package ex1;
import java.sql.*;
public class Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // JDBC Drivers
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create a connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesrep", "root", "segate");

        Statement statement = connection.createStatement();

        String qry = "SELECT * FROM SalesRep";
        ResultSet resultSet = statement.executeQuery(qry);
        ResultSetMetaData metaData = resultSet.getMetaData();

        int columnCount = metaData.getColumnCount();

        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                String columnValue = resultSet.getString(i);
                System.out.println(columnName + ": " + columnValue);
            }
            System.out.println();
        }

        // Close the connection
        connection.close();
    }
}
