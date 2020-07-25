package calcus;
import java.util.Scanner;		
public class Calcus 
{
	private static Scanner s = new Scanner(System.in);	
	private static int x, y, z, u;
	public static void main(String[] args) 
	{	
	    takeInput();			
		askOperation();			
		performOperation();		
		printResult();			
		s.close();				
	}
	private static void printResult()
	{
		System.out.println("Output = " + u);
	}
	private static void performOperation()
	{
		switch(z) 
		{
			case 1:
				u = x + y;
				break;
			case 2:
				u = x - y;
				break;
			case 3:
				u = x * y;
				break;
			case 4:					
				if( y==0 ) 
				{
					u = 0;
				} else {
					u = x / y;
				}
				break;
			default:
				System.out.println("Error");
		}
	}
	private static void askOperation() 
	{
		System.out.println("Select operation: ");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		y = s.nextInt();
	}
	private static void takeInput() 
	{	
		System.out.println();
		x = s.nextInt();
		
		System.out.println();
		y = s.nextInt();
	}
}

