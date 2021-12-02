import java.sql.*;

public class jdbc_example01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // oracle.jdbc.oracledriver
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit_kumar","root","");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from stu09");
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
        con.close();
    }
}
