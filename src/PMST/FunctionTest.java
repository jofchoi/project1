package PMST;

public class FunctionTest {


	public static int sum(int n1,int n2) {
		int sum = n1 + n2;
		return sum;
	}

	public static int times(int n1, int n2) {
		int times = n1*n2;
		return times;
	}
	public static void divide(int n1, int n2) {
		if(n2 ==0) {
			System.out.println("cannot divide");
			return;
		}
		else {
			int divide = n1 / n2;
			return divide;
		}
	}
	public static int subtract(int n1, int n2) {
		int subtract = n1 - n2;
		return subtract;
	}


	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 6;


		int  num3 = subtract(num1, num2);

		System.out.println(num3);
	}

}
