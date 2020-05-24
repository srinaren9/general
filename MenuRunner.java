import java.util.Scanner;

/****
 * 
 * @author SriNaren Ayinala
 * This class is aimed at providing calculator functions to the user for any
 * 2 numbers entered as input
 */
public class MenuRunner {

	public static void main(String[] args) {
	   
	    //Type obj  = new Type(argument);
	    Scanner scanner = new Scanner(System.in);
		
	     System.out.println("Enter Number1: ");
	     int number1  = scanner.nextInt();
	     
	     System.out.println("Enter Number2: "); 
	     int number2 = scanner.nextInt();
	     
	     System.out.println("Choices Available are  ");
	     System.out.println(" 1 - Add");
         System.out.println(" 2 - Subtract");
	     System.out.println(" 3 - Multiply ");
	     System.out.println(" 4 - Divide");
	     
	     System.out.println("Enter  Choice: ");
	     int choice = scanner.nextInt();

	     System.out.println(" Your Choices are");
	     System.out.println(" Number1 = " + number1);
	     System.out.println(" Number2 = " + number2);
	     System.out.println(" Choice =  " + choice);
	     


         switchOption(number1, number2, choice);
}
/***
 * 
 * @param number1 is the input 1 from user
 * @param number2 is the input 2 from user
 * @param choice is the calculator choice to be chosen by user. 4 options allowed
 */
	private static void switchOption(int number1, int number2, int choice) {
		switch(choice ) {
		case 1 : 
			System.out.println("Results " + (number1 + number2));
		    break;
		case 2 : 
			System.out.println("Results " + (number1 - number2));
		    break;
		case 3 : 
			System.out.println("Results " + (number1 * number2));
		    break;
		case 4 : 
			System.out.println("Results " + (number1 / number2));
		    break;
		
		    
		
		
		}
 }
}
