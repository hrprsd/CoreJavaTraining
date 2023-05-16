
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Person person = new Person('M',32,"Jack");
		//System.out.println("person : "+person);
		
		Writer w1 = new Writer("Romance");
		Writer w2 = new Writer("Drama");
		Writer w3 = new Writer("Action");
		
		BrainStorm brn1 = new BrainStorm();
		Screenplay s1 = brn1.createMovie(w1, w2, w3);
		
		System.out.println("Screenplay is : "+s1);
		
		
	}

}



class Writer
{
	private String story;

	public Writer(String story) {
		super();
		this.story = story;
	}

	@Override
	public String toString() {
		return "Writer [story=" + story + "]";
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}
	
	
	
}

class BrainStorm
{
	
	Screenplay createMovie(Writer a, Writer b, Writer c) {
		System.out.println("Working with story types: "+a.getStory()+", "+b.getStory()+" and "+c.getStory());
		Screenplay scr1 = new Screenplay("Karan Arjun Remake",3,"Family Drama"); 
		return scr1;
	}
}

class Screenplay
{
	private String plot;
	private int length;
	private String genre;
	public Screenplay(String plot, int length, String genre) {
		super();
		this.plot = plot;
		this.length = length;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Screenplay [plot=" + plot + ", length=" + length + ", genre=" + genre + "]";
	}
	
	
}


class Person
{
	private char gender;
	private int age;
	private String name;
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}