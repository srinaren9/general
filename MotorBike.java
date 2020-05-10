
public class MotorBike {
	
     //state
	 private int speed; //member variable
	 
	 //behaviour
	 //method
	 //inputs - int speed
	 //outputs - void
	 //name - setSpeed
	 void setSpeed(int speed) { //local variable
		 this.speed = speed;
	
	 }
	 int getSpeed() {
		 return this.speed;
		
		
	}
	void start () {
     System.out.println("Bike Started");
    }
}