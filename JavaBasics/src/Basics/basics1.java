package Basics;
public class basics1 {
	
	public void factorial(int n)
	{
		int fact=1;
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println("JI");
		}
		
		
		
		System.out.println(fact);

		System.out.println("SECCESS");
	}
	
public static void main(String[] args) {
	
	new basics1().factorial(5);
		
}
}


