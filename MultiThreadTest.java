import javax.swing.JFrame;
import javax.swing.JTextField;

public class MultiThreadTest {
	public static void main(String[] args) {
		Car car = new Car("Car",900,200,250,80); //3
		Bike bike = new Bike("Bike",900,300,250,80); //3
		Train train = new Train("Train",900,400,250,80); //3
		
		Thread t1 = new Thread(car); //pass object to Runnable
		Thread t2 = new Thread(bike); //pass object to Runnable
		Thread t3 = new Thread(train); //pass object to Runnable
		
		t1.start(); //4 invoke Thread's start
		t2.start(); //4 invoke Thread's start
		t3.start(); //4 invoke Thread's start
		
	}
}
/*
 * 1. write a class that extends java.lang.Thread
 * 2. override the public void run()
 * 3. create the object of this class
 * 4. invoke its start() method, which invokes your run() 
 */
class Vehicle
{
	
}
class Car extends JFrame implements Runnable { //1
	JTextField t = new JTextField();
	
	Car(String title, int x, int y, int c1,int c2) {
		setTitle(title);
		setLocation(x,y);
		setSize(c1,c2);
		add(t);
		setVisible(true);
	}
	public void run() { //2
		for(int i=1;i<=1200000;i++ ) {
			t.setText("Car is running...."+i);
		}
	}
}

class Bike extends JFrame implements Runnable  {
	JTextField t = new JTextField();
	
	Bike(String title, int x, int y, int c1,int c2) {
		setTitle(title);
		setLocation(x,y);
		setSize(c1,c2);
		add(t);
		setVisible(true);
	}
	public void run() { //2
		for(int i=1;i<=1200000;i++ ) {
			t.setText("Bike is running...."+i);
		}
	}
}
class Train extends JFrame  implements Runnable {
	JTextField t = new JTextField();
	
	Train(String title, int x, int y, int c1,int c2) {
		setTitle(title);
		setLocation(x,y);
		setSize(c1,c2);
		add(t);
		setVisible(true);
	}
	public void run() { //2
		for(int i=1;i<=1200000;i++ ) {
			t.setText("Train is running...."+i);
		}
	}
}
