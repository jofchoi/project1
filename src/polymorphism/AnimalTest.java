package polymorphism;
import java.util.ArrayList;

public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
 public static void main(String[] args) {
	AnimalTest aTest = new AnimalTest();
	aTest.addAnimal();
	System.out.println("downcasting");
	aTest.testCasting();
}
 	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger T = (Tiger)ani;
				T.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else {
				System.out.println("Áö¿ø¾ÈµÊ");
			}
		}
	}
}
