import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ConnectDB {
    // DB Connection variables

    static Connection connection = null;
    static String databaseName = "StudentsDB";


    public static void main(String[] args) throws SQLException {

        String databaseName = "";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
        String name = "root";
        String password = "######";
        String query = " insert into StudentsDB.Student (studentID, firstName, lastName)"
        		+" values (?,?, ?);";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e )
        {
        	e.printStackTrace();
        }
        
        try 
        {
        	Connection con = DriverManager.getConnection(url, name, password);
        	PreparedStatement ps = con.prepareStatement(query);
        	ps.setInt(1, 1);
        	ps.setString(2, "Omer");
        	ps.setString(3, "Aqeel");
        	
        	
        	ps.execute();
        	
        	con.close();
        	System.out.println("Record added successfully!");
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        }

    }
}
