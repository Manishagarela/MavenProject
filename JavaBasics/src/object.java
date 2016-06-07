
public class object {
	
int empid;
String name;
 int x=10;
static int y=15;
int z=200;


object(int s)
{
	System.out.println("value of s " +s);
}
object(String st)
{
	System.out.println("value of s " +st);
}
object()
{
	System.out.println("hello");
}
void show()

{
	int z= 100;
	
	
	
	System.out.println("value of x is=" +x);
	System.out.println("value of y is=" +y);
	
	System.out.println("value of local z is=" +z);
	System.out.println("value of z is=" +this.z);
}


static class hello {
public static void main(String[] args)
{
	int y=2000;
	
		object ob= new object(100);
		object ob1= new object("manisha");
		object ob2= new object();
	
		ob.show();
		ob1.show();
		ob.x=ob.x+12;
		
	ob.y=ob.y+100;
	
	y=y+1000;

	ob.show();
	ob1.show();
	
	System.out.println("static y="+object.y);
	
	System.out.println(" y="+y);
	
		
		
	}

}
}