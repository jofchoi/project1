package starshine;

public class Starshine {

	public static void main(String[] args) {
		int starCount = 3;
		String star = "*";
		int i;

		for(i = 1; i <= starCount*2; i++) {
			if(i % 2 == 0)
				continue;
			System.out.println(star.repeat(i));
		}
		for(i = starCount*2-2; i >= 1; i--) {
			if(i % 2 == 0)
				continue;
			System.out.println(star.repeat(i));
		}
	}

}
