package bus_ticket;
import java.sql.*;
public class DbConnection {
	   public static final String url="jdbc:mysql://localhost:3306/busreserve";
	   public static final String uname="root";
	   public static final String pw="Test";
	   public static Connection getConnection() throws SQLException{
		   
			return DriverManager.getConnection(url,uname,pw);
	
	   }
}
