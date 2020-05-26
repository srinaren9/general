/**
 * 
 * @author Srinaren V Ayinala
 * This code defines if an number is prime or not. /
 */

public class MyNumber {

	public MyNumber(int i) {
	 this.number = i;	
	}

	private int number;
	/*
	 * For any even numbers
     * the if condition divides it using 2. And for odd numbers it divides
     * using the for loop. (The for loop cosists  of intialisator,condition 
     * operator) The initiliser starts at 2 but not 1 because every
     * number is divisable by 1.
	 */
   public boolean isPrime() {
	   
	   
	   for(int i = 2; i<= number-1; i++) {
	      if (number % 2 == 0) {
	    	  return false;
	         
	      }
	   }
 
     return true;
   }
}  
   
   
