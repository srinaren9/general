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
	 * This code defines if an number is prime or not
	 * This code also prints an number triangle
	 */
   public boolean isPrime() {
	   
	   
	   for(int i = 2; i<= number-1; i++) {
	      if (number % i == 0) {
	    	  return false;
	         
	      }
	   }
 
     return true;
   }
    public void printNumberTriangle() {
	//1
	//1 2
	//1 2 3
	//1 2 3 4
	//1 2 3 4 5
    for(int i=1;i<=number;  i++) {
        for(int j =1; j<=i; j++) {
    	System.out.print(j + " ");
        }
        System.out.println();
    
    }

    } 
} 

 
   
   
