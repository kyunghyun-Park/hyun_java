import java.sql.Connection;
import java.sql.DriverManager;

public class ManageStudent {
    public static void main(String[] args) {
        Connection con = null;
        String dbname="test";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost/"+dbname+"?serverTimezone=UTC&useSSL=false";

            con= DriverManager.getConnection(url,"root","0506");
            System.out.println("연결 성공!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
