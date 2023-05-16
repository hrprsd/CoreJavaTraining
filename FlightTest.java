
public class FlightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Flight fl1 = new Flight(2457, "Air India", 250,"Mumbai", "Kolkata");
		System.out.println("fl1 : "+fl1);
	}

}

class Flight
{
	private int flightNumber;
	private String operator;
	private int capacity;
	private String source;
	private String destination;
	
	
	public Flight(int flightNumber, String operator, int capacity, String source, String destination) {
		super();
		this.flightNumber = flightNumber;
		this.operator = operator;
		this.capacity = capacity;
		this.source = source;
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operator=" + operator + ", capacity=" + capacity
				+ ", source=" + source + ", destination=" + destination + "]";
	}
	
	
	
}