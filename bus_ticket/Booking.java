package bus_ticket;
import java.util.*;
import java.sql.SQLException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
 String p_name;
 int b_no;
 Date date;
 Booking()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter passenger name");
	 p_name=sc.next();
	 System.out.println("Enter bus no");
	 b_no=sc.nextInt();
	 System.out.println("Enter passenger date");
	 String str=sc.next();
	 SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
	 try {
		date=df.parse(str);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 sc.close();
	 
	 
	 
 }
 public boolean isAvailable() throws SQLException
 {
	 
	 BusDAO bs=new BusDAO();
	 BookingDAO bd=new BookingDAO();
	 
	 int capacity=bs.getCapacity(b_no);
	 int count=bd.getbookedcount(b_no,date);
	 
	 return (count<capacity)?true:false;
 }

}
