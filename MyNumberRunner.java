
public class MyNumberRunner {

	public static void main(String[] args) {
	    MyNumber number = new MyNumber(5);
	    
	    boolean isPrime = number.isPrime();
	    System.out.println("isPrime " + isPrime);
  
	    number.printNumberTriangle();
	}

}
