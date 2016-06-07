
public class overriding {
	
	static double z;
	
	void mul(double x, double y)
	{
		z=x*y;

		System.out.println(+z);

		}
	void sum(int x,int y)
{

	z=x+y;

System.out.println(+z);

}
static class aa extends overriding
{
	void sum(int x,int y)
	{
		z=x-y;

System.out.println(+z);
}
}
	
public static void main(String[] args) {
		
overriding ob=new overriding();

ob.sum(10,20);
ob.mul(10.00, 10.00);


	}
}

