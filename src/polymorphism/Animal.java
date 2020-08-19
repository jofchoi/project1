package polymorphism;

public class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
}

public class AnimalTest1{
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest1();
			aTest.moveAnimal(new Human());
			aTest.moveAnimal(new Tiger());
			aTest.moveAnimal(new Eagle());
		}

		public void moveAnimal(Animal animal) {
			animal.move();
		}
	}