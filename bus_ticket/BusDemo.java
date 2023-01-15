package bus_ticket;

import java.util.*;
import java.sql.*;
public class BusDemo {
 public static void main(String args[]) 
 {
	 
	 Scanner sc=new Scanner(System.in);
	 BusDAO b=new BusDAO();
	 try 
	 {
	 b.display();
	   int u_opt=1;
		 while(u_opt==1)
		 {
			 System.out.println("Press 1 to book");
			 u_opt=sc.nextInt();
			 System.out.println("ur choice is "+u_opt);
			 if(u_opt==1)
			 {
			 Booking book=new Booking();
			 if(book.isAvailable())
			 {
				 BookingDAO dao=new BookingDAO();
				 dao.addBooking(book);
				 System.out.println("UR BOOKING IS CONFIRMED!!");
			 }
			 else {
				 System.out.println("NOT AVAILABLE!!");
				 //break;
			 }
			 }
			 
		 }
		
	 }
	 catch(Exception e)
	 {
		 return;
	 }
	 sc.close();
 }
}
