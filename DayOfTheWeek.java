import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println(" Enter your favourite day ");
		 System.out.println(" 1 - Sunday");
		 System.out.println(" 2 - Monday");
         System.out.println(" 3 - Tuesday");
	     System.out.println(" 4 - Wednesday ");
	     System.out.println(" 5 - Thursday");
	     System.out.println(" 6 - Friday ");
	     System.out.println(" 7 - Saturday ");
	     	     
	     System.out.println("Enter your favourite day: ");
	     int weekChoice = scanner.nextInt();
	     
	     System.out.println(" Enter your favourite Month ");
	     System.out.println("  1 - January   ");
	     System.out.println("  2 - Febuary   ");
	     System.out.println("  3 - March     ");
	     System.out.println("  4 - April     ");
	     System.out.println("  5 - May       ");
	     System.out.println("  6 - June      ");
	     System.out.println("  7 - July      ");
	     System.out.println("  8 - Aughast   ");
	     System.out.println("  9 - September ");
	     System.out.println(" 10 - October   ");
	     System.out.println(" 11 - November  ");
	     System.out.println(" 12 - December  ");
 
	     System.out.println("Enter your favourite Month : ");
	     int monthChoice = scanner.nextInt();
	
	     System.out.println("  Your choices are ");
	     
	     
	     if (weekChoice == 1) { 
	    	 System.out.println(" Sunday");
	     } else if  (weekChoice == 2) {
	    	 System.out.println(" Monday");
	     } else if  (weekChoice == 3) {
	    	 System.out.println(" Tuesday");
	     } else if  (weekChoice == 4) {
	    	 System.out.println(" Wednesday");
	     } else if  (weekChoice == 5) {
	    	 System.out.println(" Thursday");
	     } else if  (weekChoice == 6) {
	    	 System.out.println(" Friday");	     
  	     } else if  (weekChoice == 7) {
  	    	 System.out.println(" Saturday");
  	     }else {
  	    		System.out.println(" Invalid Choice");
  	    	 }
  	    	 
  	     if (monthChoice == 1) { 
	    	 System.out.println(" January");
	     } else if  (monthChoice == 2) {
	    	 System.out.println(" Febuary");
	     } else if  (monthChoice == 3) {
	    	 System.out.println(" March");
	     } else if  (monthChoice == 4) {
	    	 System.out.println(" April");
	     } else if  (monthChoice == 5) {
	    	 System.out.println(" May");
	     } else if  (monthChoice == 6) {
	    	 System.out.println(" June");	     
  	     } else if  (monthChoice == 7) {
  	    	 System.out.println(" July");
  	     } else if  (monthChoice ==  8){
  	    	 System.out.println(" Aughast");
  	     } else if  (monthChoice == 9) {
  	    	 System.out.println(" September");
  	     } else if  (monthChoice == 10){
  	    	 System.out.println(" October");
  	     } else if (monthChoice == 11) {
  	    	 System.out.println(" November");
  	     } else if (monthChoice == 12) {
  	    	 System.out.println(" December");
  	     } else {
  	    	System.out.println(" Invalid Choice");
  	     }
  	    	 
	    	 
	     
	  }

	}
	

	
