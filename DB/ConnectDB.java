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


    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws SQLException {

        String databaseName = "";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
        String name = "root";
        String password = "MaryamAqeel123";
        String query = " insert into StudentsDB.Student (studentID, firstName, lastName, passportNo, course)"
        		+" values (?,?, ?, ?, ?);";

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
        	ps.setInt(1, 3);
        	ps.setString(2, "Abdul");
        	ps.setString(3, "Rehman");
        	ps.setInt(4, 23442124);
        	ps.setString(5, "Physics");
        	
        	
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
