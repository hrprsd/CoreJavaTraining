package com.sbi;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing Functions new");
		myFunction myFun = new myFunction();
		myFun.clearScreen();
		myFun.gotoLocation(20.5f, 30.2f);
		float avg = myFun.findAverage(15, 24, 65);
		System.out.println("The average is "+avg);
		double dist = myFun.findTheDistanceBetweenSunAndEarth();
		System.out.println("Distance between Sun and Earth is "+dist);
		
		System.out.println("Starting my Own Functions.....");
		myOwnFunctions fun2 = new myOwnFunctions();
		fun2.waterThePlants();
		fun2.addTheseNumbers(54, 75);
		String fullName = fun2.fullName("Mr", "Hara", "Prasad", "Mohanta");
		System.out.println("Full name is: "+fullName);
		String greetings = fun2.whatsUp();
		System.out.println(greetings);
	}

}

class myOwnFunctions
{
	void waterThePlants() {
		System.out.println("Watering the plants now....");
	}
	void addTheseNumbers(int num1, int num2) {
		int tot = num1+num2;
		System.out.println("Total value is "+tot);
	}
	String fullName(String title, String firstName, String middleName, String lastName ) {
		return title +" " + firstName + " " + middleName + " " + lastName;
	}
	String whatsUp() {
		return "All good. You Say...";
	}
}

class myFunction
{
	void clearScreen() {
		System.out.println("Clearing the screen....");
	}
	void gotoLocation(float longitude, float lattitude) {
		System.out.println("Going to a locaton with longitude "+longitude+" and lattitude "+lattitude);
	}
	float findAverage(int x, int y, int z) {
		return (x+y+z)/3.0f;
	}
	double findTheDistanceBetweenSunAndEarth() {
		return 186000.519 * 480 * 1.69;
	}
}

