


public class inh1 {

 int x=10;
 
 void show()
 {
	 System.out.println("value of x"+x);
	 
 }
 
 static class H extends inh1
 {
	 int y=100;
	 int z;
	 
	 void display()
	 {
		 z=x+y;
		 
		 
		 System.out.println("value of z"+z);
 
	 }}
 

 
public static void main(String[] args) {
	H ob=new H();
	ob.display();
	ob.show();
	
		}}