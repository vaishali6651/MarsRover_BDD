package StepDefinations;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;

import io.cucumber.java.en.*;
import marsrover.Rover;


public class PositionOfRover {
	int x = 0;
	int y = 0;
	public static final Integer N = 1;
	public static final Integer E = 2;
    public static final Integer S = 3;
    public static final Integer W = 4;
    Integer facing = N;
    
    	Rover rover = new Rover();
    
     
    
      
     @Given("Rover1 is ready for orientation in Platue")
     public void rover1_is_ready_for_orientation_in_Platue() {
    	 
         System.out.println("Intial position of Rover 1 is 0 0 N");
     }

     @Given("Rover2 is ready for orientation in Platue")
     public void rover2_is_ready_for_orientation_in_Platue() {
    	 System.out.println("Intial position of Rover 2 is  0 0 N");
     }

     @When("I Set the X co-ordinate to {int}")
     public void i_Set_the_X_co_ordinate_to(Integer x) {
         this.x=x;
         System.out.println(x);
         
     }

     @When("I Set the Y co-ordinate to {int}")
     public void i_Set_the_Y_co_ordinate_to(Integer y) {
    	 this.y=y;
         System.out.println(y);
     }

     @When("I Set the direction to {int}")
     public void i_Set_the_direction_to(Integer n) {
    	 if (n==N)
    	 {
    	 rover.setPosition(this.x, this.y, n);
    	 }
    	 else if (n==E)
    	 {
    		 rover.setPosition(this.x, this.y, n);
    	 }
    	 else if (n==S)
    	 {
    		 rover.setPosition(this.x, this.y, n);
    	 }
    	 else
    	 {
    		 rover.setPosition(this.x, this.y, W);
    	 }
     }
    	 

	
     @When("Move the rover to specific direction {string}")
     public void move_the_rover_to_specific_direction(String s) {
         rover.process(s);
         
     }
	
	@Then("Verify the Final position of the Rover1")
	public void verify_the_Final_position_of_the_Rover1() {
		String expectedPositionRover1 = "1 3  N";
	    String actualPostionRover1=rover.printPosition();
	    assertEquals(expectedPositionRover1, actualPostionRover1);
	}

	@Then("Verify the Final position of the Rover2")
	public void verify_the_Final_position_of_the_Rover2() {
		String expectedPositionRover2 = "3 3  E";
	    String actualPostionRover2=rover.printPosition();
	    assertEquals(expectedPositionRover2, actualPostionRover2);
	}

}
