package project1;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		double num3 = 10;
		double num4 = 20;

		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "�Դϴ�.");
		int times = times(num1, num2);
		System.out.println(num1 + " X " + num2 + " = " + times + "�Դϴ�.");
		double divide = divide(num3, num4);
		System.out.println(num1 + " / " + num2 + " = " + divide + "�Դϴ�.");
		double subtract = subtract(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + subtract + "�Դϴ�.");
	}

	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static double subtract(double n1, double n2) {
		double result = n1 - n2;
		return result;
	}
	public static int times(int n1, int n2) {	
		int result = n1 * n2;
		return result;
	}
	public static double divide(double n1, double n2) {
		double result = n1 / n2;
		return result;
	}
}

