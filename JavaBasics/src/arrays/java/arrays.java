package arrays.java;
import java.lang.*;
public class arrays {
	public static void main(String[] args) {
		int i,j;
		
		int x[][]=new int[2][2];
		x[0][0]=2;
		x[0][1]=3;
		x[1][0]=4;
		x[1][1]=9;
		
		
				
	
		
		System.out.println ("The Elements of array are: ");
				
		for(i=0;i<x.length;i++)
		
	{
			
			System.out.println("\n");
			
			for(j=0;j<x.length;j++)
			{
				
			
				System.out.println( +x[i][j]);
		
		
	}

}}
}