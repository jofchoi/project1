package project1;

public class starShine1 {

	public static void main(String[] args) {
		int starCount = 5;
		String star = "*";

		for(int i = 1; i <= starCount; i++) {

			System.out.println(star.repeat(i* 2 - 1));
		}

		for(int i = starCount -1; i > 0; i--) {

			System.out.println(star.repeat(i* 2 -1 ));
		}
	}
}
