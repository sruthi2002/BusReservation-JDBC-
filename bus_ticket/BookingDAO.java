package bus_ticket;

import java.sql.*;

public class BookingDAO {
public int getbookedcount(int b_no,java.util.Date date) throws SQLException
{
	String query="select count(p_name) from booking where b_no=? and travel_date=?;";
	Connection con=DbConnection.getConnection();
	PreparedStatement ps=con.prepareStatement(query);
	java.sql.Date sqldate=new java.sql.Date(date.getTime());
	ps.setInt(1, b_no);
	ps.setDate(2, sqldate);
	ResultSet rs=ps.executeQuery();
	rs.next();
	return rs.getInt(1);
}
public void addBooking(Booking b) throws SQLException
{
	String query="insert into booking values(?,?,?);";
	Connection con=DbConnection.getConnection();
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1, b.p_name);
	ps.setInt(2, b.b_no);
	java.sql.Date sqldate=new java.sql.Date(b.date.getTime());
	ps.setDate(3,sqldate);
	ps.executeUpdate();
}
}
