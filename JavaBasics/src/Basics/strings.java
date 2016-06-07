package Basics;

public class strings {

	public static void main(String[] args) {
		
		String s1= "manisha";
		String s2= new String("divya");
		

		System.out.println("the first name is:" +s1);
				
		System.out.println("the seecond name is:" +s2);

if(s1.equals(s2))
{
	System.out.println("they are equal");
}
	else
	{
		System.out.println("they are not equal");
		
}

if(s1.equalsIgnoreCase(s2))
{
	System.out.println("they are equal");}
	
	
else{
	System.out.println("they are not equal");
}

if(s1.endsWith("java"))
{
	System.out.println("java");
}

else
{
	System.out.println("not java");
}

	}
}
		