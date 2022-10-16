import java.util.*;
import java.sql.*;
public class dbDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/phanendhar";
        String uname = "phanendhar";
        String pwd = "";
        String query = "select nname from alist where sno=3";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname,pwd);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String nam = rs.getString("nname");
        System.out.println(nam);
        st.close();
        con.close();
    }
}
