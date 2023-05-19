
public class PassingObjectReturningObjectTest {
	public static void main(String[] args) {
		Curd curd = new Curd("A2Curd","thick",100);
	//	Sugar sugar = new Sugar("Madhur",100);
	//	MangoPulp pulp = new MangoPulp("Alphanso", 150);
		Water water = new Water("Mineral",500);
		Salt salt = new Salt(5);
		Jaljeera jaljeera = new Jaljeera(10);

		System.out.println("Curd  : "+curd);
	//	System.out.println("Sugar : "+sugar);
		System.out.println("Water : "+water);
		System.out.println("Salt : "+salt);
		System.out.println("Jaljeera : "+jaljeera);
		
		Kitchen myKitchen = null;
		
		myKitchen = new Kitchen();
		
	//	Lassi theLassi = myKitchen.prepareColdDrink(curd, sugar, water);
		ButterMilk butterMilk = myKitchen.prepareColdDrink(curd, water, salt, jaljeera);
		
		
		//System.out.println("Lassi : "+theLassi);
		System.out.println("ButterMilk : "+butterMilk);
		
		
		
	}
}
class Lassi
{
	String type;
	String density;
	float sweetnessLevel;
	int quantity;
	public Lassi(String type, String density, float sweetnessLevel, int quantity) {
		super();
		this.type = type;
		this.density = density;
		this.sweetnessLevel = sweetnessLevel;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Lassi [type=" + type + ", density=" + density + ", sweetnessLevel=" + sweetnessLevel + ", quantity="
				+ quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public float getSweetnessLevel() {
		return sweetnessLevel;
	}
	public void setSweetnessLevel(float sweetnessLevel) {
		this.sweetnessLevel = sweetnessLevel;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
		
}

class Kitchen
{
		Lassi prepareColdDrink(Curd curd, Sugar sugar, Water water) {
			System.out.println("Preparing lassi.....");
			float level = (sugar.getQuantity()*100/(curd.getQuantity()+water.getQuantity()))/10.0f; //BODMAS
			Lassi lassi = new Lassi(curd.getType(),"thick",level,curd.getQuantity()+sugar.getQuantity()+water.getQuantity());
			return lassi;
		}
		
		Lassi prepareColdDrink(Curd curd, MangoPulp pulp, Water water) {
			System.out.println("Preparing lassi.....");
			float level = (pulp.getQuantity()*100/(curd.getQuantity()+water.getQuantity()))/10.0f; //BODMAS
			Lassi lassi = new Lassi(curd.getType(),"thick",level,curd.getQuantity()+pulp.getQuantity()+water.getQuantity());
			return lassi;
		}

		
		ButterMilk prepareColdDrink(Curd curd, Water water, Salt salt, Jaljeera jaljeera) {
			System.out.println("Preparing Buttermilk now....");
			ButterMilk bMilk = new ButterMilk(curd.getQuantity()+water.getQuantity()+salt.getQuantity()+jaljeera.getQuantity(), "Thin") ;
			return bMilk;
		}
}


class Jaljeera
{
	int quantity;

	@Override
	public String toString() {
		return "Jaljeera [quantity=" + quantity + "]";
	}

	public Jaljeera(int quantity) {
		super();
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
class Salt
{
	int quantity;

	@Override
	public String toString() {
		return "Salt [quantity=" + quantity + "]";
	}

	public Salt(int quantity) {
		super();
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

class ButterMilk
{
	int quantity;
	String thickness;
	
	
	
	public ButterMilk(int quantity, String thickness) {
		super();
		this.quantity = quantity;
		this.thickness = thickness;
	}
	@Override
	public String toString() {
		return "ButterMilk [quantity=" + quantity + ", thickness=" + thickness + "]";
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getThickness() {
		return thickness;
	}
	public void setThickness(String thickness) {
		this.thickness = thickness;
	}
	
}
class MangoPulp {
	String mangoType;
	int quantity;
	public MangoPulp(String mangoType, int quantity) {
		super();
		this.mangoType = mangoType;
		this.quantity = quantity;
	}
	public String getMangoType() {
		return mangoType;
	}
	public void setMangoType(String mangoType) {
		this.mangoType = mangoType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "MangoPulp [mangoType=" + mangoType + ", quantity=" + quantity + "]";
	}
	
	
	
}
class Sugar
{
	String type;
	int quantity;
	public Sugar(String type, int quantity) {
		super();
		this.type = type;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Sugar [type=" + type + ", quantity=" + quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
class Curd
{
	String type;
	String density;
	int quantity;
	public Curd(String type, String density, int quantity) {
		super();
		this.type = type;
		this.density = density;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Curd [type=" + type + ", density=" + density + ", quantity=" + quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
class Water
{
	String type;
	int quantity;
	public Water(String type, int quantity) {
		super();
		this.type = type;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

