import java.sql.*;

public class MAIN_DATABASE {
   static final String pan = "jdbc:mysql://localhost/TUTORIALSPOINT";
   static final String siza = "guest";
   static final String pizza = "guest123";
   static final String requst_user = "SELECT id, first, last, age FROM Employees";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(pan,siza, pizza);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(siza);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("Pan " + rs.getString("pan"));
            System.out.print(", size : " + rs.getString("Size"));
            System.out.print(", CALORIES: " + rs.getInt("Calories"));
            System.out.println(",reuset : " + rs.getString("request"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}