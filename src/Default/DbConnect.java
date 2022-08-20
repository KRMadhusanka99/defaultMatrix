package Default;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3307/GpaCal";
        String username = "root";
        String password = "1234";

        try{
            Connection connection = DriverManager.getConnection(jdbcURL,"root","1234");

            String sql = "Insert into Users("

            if (connection != null){
                System.out.println("connected");
                connection.close();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        //sdf
    }
}
