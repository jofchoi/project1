package array;

public class AlphabetTwoDimension {
	public static void main(String[] args) {
		char[][] alpha = new char[13][2];
		char ch = 'A';
		
		for(int i = 0; i < alpha.length; i++, ch++) {
			alpha[i] = ch;
			for(int j = 0; j < alpha[i].length; j++) {
				System.out.println(alpha[i][j]);
			}
			System.out.println( );
		}
	}
}
