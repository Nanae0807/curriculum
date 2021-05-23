package check;

import constants.Constants;

public class Check {
		
	public static void main(String[] args) { 
		String firstName = "白川";
		String lastName = "七愛";
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		
		printName(firstName,lastName);
		
		pet.introduce();
		robotpet.introduce();
	}
	
	private static void printName(String firstname,String lastname) {
		 System.out.println(firstname + lastname);
	}
}
