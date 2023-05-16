
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone();
		myPhone.dial();
		byte intcom = 123;
		myPhone.dial(intcom);
		myPhone.dial("Newton");
		byte countryCode=91;
		myPhone.dial(countryCode, 9820443464L);
		myPhone.dial(9920333484L,countryCode);
	}

}
class Phone
{
	void dial() {
		System.out.println("dial() nowhere...");
	}
	void dial(byte intercom) {
		System.out.println("dial(byte) "+intercom);
	}
	void dial(String name) {
		System.out.println("dial(String) "+name);
	}
	void dial(byte code, long number) { 
		System.out.println("dial(byte,long) where ...+"+code+"-"+number);
	}
	void dial(long number,byte code) { 
		System.out.println("dial(long,byte) where ...+"+code+"-"+number);
	}
}
