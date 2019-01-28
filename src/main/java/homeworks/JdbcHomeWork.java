package homeworks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcHomeWork {

  public static void main(String[] args) {
    try {


      Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (Exception ex) {

    }

    Connection conn = null;
    Statement st = null;
    try {
      conn = DriverManager
          .getConnection("jdbc:mysql://s3.thehost.ua/itea2?" + "user=helen&password=123456");



    } catch (SQLException ex) {

      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }

    System.out.println("connection is OK");


    try {
      st = conn.createStatement();

    } catch (SQLException e) {
      e.printStackTrace();
    }

    String sql = "SHOW TABLES";
    try {
      ResultSet rs = st.executeQuery(sql);
      while (rs.next()) {

        System.out.println(rs.getString(1));
      }
      rs.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    try {
      st.close();
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

}
