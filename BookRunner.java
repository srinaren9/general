/***
 * This code will help you store the no.of books you have at your center
 * if your an delivery or books store or at your home. 
 * 
 * @author Srinaren V Ayinala
 *
 */
public class BookRunner {

	public static void main(String[] args) {
	     // Create a new class called Book
		// Create three instances
		Book artOfComputerProgramming = new Book();
		Book aviationIsGreat = new Book();
		Book cookingAdventures = new Book();
	
		
		System.out.println("No Of Copies of artOfComputerProgramming: ");
		artOfComputerProgramming.setNoOfCopies(100);
	    System.out.println( artOfComputerProgramming.getNoOfCopies());
	    
	    
	    System.out.println("No Of Copies of aviationIsGreat: ");
	    aviationIsGreat.setNoOfCopies(50);
	    int noOfAviationCopies = aviationIsGreat.getNoOfCopies();
	    System.out.println(noOfAviationCopies);
	   
	    

		System.out.println("No Of Copies of cookingAdventure: ");
		cookingAdventures.setNoOfCopies(40);
	    int noOfCookingCopies = cookingAdventures.getNoOfCopies();
		System.out.println(noOfCookingCopies);
	
	} 

}
