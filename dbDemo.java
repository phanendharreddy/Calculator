import java.util.*;
import java.sql.*;
public class dbDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/phanendhar";
        String uname = "root";
        String pwd = "3256";
        // String query = "select * from alist";
        int userid = 5;
        String username = "Raja";
        String query = "insert into alist values (?,?)";
        // Class.forName("com.mysql.jdbc.Driver");
        // Connection con = DriverManager.getConnection(url, uname,pwd);
        // Statement st = con.createStatement();
        // ResultSet rs = st.executeQuery(query);
        // String nam = " ";
        // while(rs.next()) {
        // nam = rs.getInt(1)+":" +rs.getString(2);
        // System.out.println(nam);
        // }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pwd);
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,userid);
            st.setString(2,username);
            int count = st.executeUpdate(); // ddl , dml , dql
            System.out.println(count +"row/s affected");
            String query1 = "select * from alist";
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery(query1);
            String ab1 = " ";
            rs1.next(); rs1.next(); rs1.next(); rs1.next(); rs1.next(); rs1.next();
            ab1 = rs1.getInt(1)+":"+rs1.getString(2);
            System.out.println(ab1);
            st1.close();
        st.close();
        con.close();
    }
}
