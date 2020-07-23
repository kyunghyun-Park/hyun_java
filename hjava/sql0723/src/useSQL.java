import java.sql.*;

public class useSQL {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String dbName = "test";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost/" + dbName +
                    "?serverTimezone=UTC&useSSL=false";

            con = DriverManager.getConnection(url, "root", "0506");
            System.out.println("연결 완료!");

            stmt = con.createStatement();
            String sql = "select * from " + dbName + ".major";
            rs = stmt.executeQuery(sql);
            rs.next();

            Major mj = new Major(rs.getString(1), rs.getString(2));
            System.out.println(mj);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}
