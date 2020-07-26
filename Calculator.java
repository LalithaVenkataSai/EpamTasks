import java.util.Scanner;
public class Calculator {

	public static void main(String[] args)
	{
	    int first,second,result;
	    char operation;
	    Operations o=new Operations();
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter First Number" );
	    first=input.nextInt();
	    System.out.println("Enter Second Number" );
	    second=input.nextInt();
	    System.out.println("Enter Operation +  -  *  /" );
	    
	    operation=input.next().charAt(0); 
	    switch(operation)
	    {
	        case '+':
	            System.out.println(o.add(first,second));
	            break;
	        case '-':
	            System.out.println(o.sub(first,second));
	            break;
	        case '*':
	            System.out.println(o.mul(first,second));
	            break;
	       case '/':
	            System.out.println(o.div(first,second));
	            break;
		default:
			System.out.println("Invalid choice..");
			
         
	    }
	   }
	    
	    
	    
	}