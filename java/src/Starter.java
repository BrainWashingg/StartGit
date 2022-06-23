import javax.xml.crypto.Data;
import java.sql.*;

public class Starter {
    public static void main(String[] args) throws SQLException {


       Connection conn;

            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "12345");
            System.out.println("подключились успешно");
            
            
            String zapros = "INSERT INTO product (name,price,description) VALUES ('мяч', '600', 'воллейбольный мяч')" ;
           Statement statement = conn.createStatement();
            statement.executeUpdate(zapros);


            String query = "SELECT * FROM product";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while ((rs.next())) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getInt("price") + ", " + rs.getString("description"));
            }

    }
}


 