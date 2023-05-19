
public class DivisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator mc = new MyCalculator();
		System.out.println("MAIN started.....");
		mc.divide(15, 2);
		mc.divide(364, 8);
		mc.divide(87, 0);
		mc.divide(951, 6);
		System.out.println("MAIN completed.....");
	}

}

class MyCalculator
{
	void divide(int num, int deno) {
		System.out.println("Division started...");
		System.out.println("Trying to divide "+num+" by "+deno);
		try {
		System.out.println("Division result "+(float)num/deno);
		}
		catch (ArithmeticException e){
			System.out.println("Some arithmatic error: "+e);
		}
		System.out.println("Division completed.");
		System.out.println("----------------------");
	}
}
