package bus_ticket;
import java.sql.*;
public class BusDAO {
 public void display() throws SQLException{
	 String query="select * from bus";
	 Connection con=DbConnection.getConnection();
	 Statement st=con.createStatement();
	 ResultSet rs=st.executeQuery(query);
	 while(rs.next())
	 {
		 int a=rs.getInt(1);
		 System.out.print(a+" ");
		 int capacity=rs.getInt(2);
		 System.out.print(capacity+" ");
		 int ac1=rs.getInt(3);
		 if(ac1==0)
		 {
			 System.out.print("AC");
		 }
		 else {
			 System.out.print("NON-AC"); 
		 }
		 System.out.println();
		 
	 }
 }

public int getCapacity(int b_no) throws SQLException{
	// TODO Auto-generated method stub
	String query="select capacity from bus where busno="+b_no;
	Connection con=DbConnection.getConnection();
	 Statement st=con.createStatement();
	 ResultSet rs=st.executeQuery(query);
	 rs.next();
	 return rs.getInt(1);
	
}
}
