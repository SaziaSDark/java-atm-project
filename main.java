import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://127.0.0.1/atm2";
        String user="root";
        String password="";
        
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection= (Connection)DriverManager.getConnection(url, user, password);
       String query=("select name from customers where username='44'");
      
       Statement statement= connection.createStatement(); 
      
  
      
      ResultSet result;
      result=statement.executeQuery(query);
      result.next(); 
      String name= result.getString("name");
      System.out.println(name);
      connection.close();
      statement.close();    
    
    
    
}}
