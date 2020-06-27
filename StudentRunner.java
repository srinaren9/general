/***
 * 
 * 
 * @author Srinaren V Ayinala
 *
 */

package general;

public class StudentRunner {
	
	public static void main(String[] args) {
		int[] marks = {99,98,100};
		
		Student student  = new Student("Naren", marks );
		int number       = student.getNumberOfMarks();
		System.out.println("number of marks " + number);
		
		
		
		
		
	}

}
