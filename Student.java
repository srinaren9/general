/***
 * author@ Srinaren V Ayinala
 */

package general;

public class Student {

	private int[] marks;
	private String name;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
		
	}


	public int getNumberOfMarks() {
		return marks.length;
	}
	
	

}
