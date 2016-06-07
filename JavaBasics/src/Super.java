
public class Super {

	public Super() {
		System.out.println("hello");
		
	}
	

	public Super(double y) {
		System.out.println("value of y"+y);
	}
	
	public static class Super1 extends Super {

		
public Super1() {
			System.out.println("hi");
			
		}
		

		public Super1(double d) {
			super(d);
			
			System.out.println("value of x"+d);
		}
	}

	public static void main(String[] args) {
		
	Super1 ob=new Super1();
	Super1 ob2=new Super1(100);
	Super1 ob1=new Super1(100.23);
	
	
	}}


