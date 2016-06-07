
public class methodoverloading {
	
	void sum(int x,int y)
	{
		int z;
		
	z=x+y;
	
		System.out.println(+z);
		
				}
	void sum(double x,double y)
	{
		double z;
		
	z=x+y;
	
		System.out.println("sum is" +z);
		
				}

	public static void main(String[] args) {
		
		methodoverloading ob= new methodoverloading();
		
		
	ob.sum(10,20);
		ob.sum(10.05,20.55);		
				}


	}




