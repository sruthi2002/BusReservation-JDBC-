package bus_ticket;

public class Bus {
 private int  busno;
 private int capacity;
 private boolean ac;
 Bus(int busno,int capacity,boolean ac)
 {
	 this.busno=busno;
	 this.capacity=capacity;
	 this.ac=ac;
 }
 public int getcapacity()
 {
	 return capacity;
 }
 public void setcapacity(int i)
 {
	 capacity=i;
 }

 public void setac(boolean i)
 {
	 ac=i;
 }
 public boolean getac()
 {
	 return ac;
 }
  public int getbusno()
 {
	 return busno;
 }
  public void display()
  {
	  System.out.println("Bus No="+busno+" AC/NOT="+ac+" Capacity="+capacity);
  }
}
