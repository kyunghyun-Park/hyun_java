import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ManageStudent {
    public static void main(String[] args) {
        Connection con = null;
        String dbname="test";
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost/"+dbname+"?serverTimezone=UTC&useSSL=false";

            con= DriverManager.getConnection(url,"root","0506");
            System.out.println("연결 성공!");

            stmt = con.createStatement();
            String sql = "select * from student";
            rs=stmt.executeQuery(sql);

            while (rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2));
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
