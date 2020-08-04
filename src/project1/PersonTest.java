package project1;

public class PersonTest {

	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.height = 180.0F;
		personKim.weight = 85.5F;
		
		Person personLee = new Person("이순신", 175F, 75F);
		
		System.out.println(personKim.name);
		System.out.println(personKim.height);
		System.out.println(personKim.weight);
		System.out.println(personLee.name);
		System.out.println(personLee.height);
		System.out.println(personLee.weight);
	}

}
