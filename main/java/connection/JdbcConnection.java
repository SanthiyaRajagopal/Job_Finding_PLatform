package connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/job_find?useSSL=false&serverTimezone=UTC",
                "root", "Sandy*26");
            System.out.println("Connected!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
