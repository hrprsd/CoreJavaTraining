import jungle.cave.Tiger;

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger = new Tiger();
		tiger.jump();
		
		A a = new A();
		a.fun();
		
		WhiteTiger wh = new WhiteTiger();
	}

}


class A
{
	void fun() {
		System.out.println("Having fun...");
	}
}


class WhiteTiger extends Tiger
{
	void fun() {
		WhiteTiger t = new WhiteTiger();
		System.out.println("defaultA   : "+t.defaultA);
		//System.out.println("privateB   : "+t.privateB);
		System.out.println("protectedC : "+t.protectedC);
		System.out.println("publicD    : "+t.publicD);
	}
	void foo() {
		System.out.println("defaultA   : "+defaultA);
		//System.out.println("privateB   : "+privateB);
		System.out.println("protectedC : "+protectedC);
		System.out.println("publicD    : "+publicD);
	}
}
