

public class IfStatementRunner {
	
	public static void main(String[] args) {
        int i = 100;
        //i is 25
        //i is 24
        ////i is neither 25 or 24
        
        if(i==25) {
            System.out.println("i = 25");
        } else if (i == 24) {
        	System.out.println("i = 24");
        } else {
        	System.out.println("i is neither 24 nor 25");
        }
	
	}
}
