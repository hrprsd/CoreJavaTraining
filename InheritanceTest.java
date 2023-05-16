
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle("Yellow","Honda");
		System.out.println("v1 : "+v1);
		
		FourWheeler f1 = new FourWheeler("Blue", "Toyota", "Automatic", 0);
		System.out.println("f1 : "+f1);
		
		Bus b1 = new Bus("Red", "Tata", "Manual", 6, "Multi-axle", 60);
		System.out.println("b1 : "+b1);
		
	}

}
class Vehicle
{
	private String color;
	private String manufacturer;
	public Vehicle(String color, String manufacturer) {
		super();
		this.color = color;
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", manufacturer=" + manufacturer + "]";
	}
	
	
}

class FourWheeler extends Vehicle
{
	private String transmissionMode;
	private int numberOfGears;
	public FourWheeler(String color, String manufacturer, String transmissionMode, int numberOfGears) {
		super(color, manufacturer);
		this.transmissionMode = transmissionMode;
		this.numberOfGears = numberOfGears;
	}
	@Override
	public String toString() {
		return "FourWheeler [toString()=" + super.toString() + ", transmissionMode=" + transmissionMode
				+ ", numberOfGears=" + numberOfGears + "]";
	}
	
	
}

class Bus extends FourWheeler
{
	private String axleType;
	private int passengerCapacity;
	public Bus(String color, String manufacturer, String transmissionMode, int numberOfGears, String axleType,
			int passengerCapacity) {
		super(color, manufacturer, transmissionMode, numberOfGears);
		this.axleType = axleType;
		this.passengerCapacity = passengerCapacity;
	}
	@Override
	public String toString() {
		return "Bus [toString()=" + super.toString() + ", axleType=" + axleType + ", passengerCapacity="
				+ passengerCapacity + "]";
	}
	
	
}