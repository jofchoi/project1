package project1;
import java.util.Random;
public class Gawibawibo1 {

	public static void main(String[] args) {
		int gawi = 1;
		int bawi = 2;
		int bo = 3;
		Random r = new Random();
		int player = 1;
		int computer = r.nextInt(3)+1;
		int result = 0;
		int playRound = 3;
		int i;
		int sum = 0;

		for(i = 0; sum < playRound; i++) {
			computer = r.nextInt(3)+1;

			if(player == gawi) {
				System.out.println("gawi");
			}
			else if(player == bawi) {
				System.out.println("bawi");
			}
			else if(player == bo){
				System.out.println("bo");
			}

			if(computer == gawi) {
				System.out.println("gawi");
			}
			else if(computer == bawi) {
				System.out.println("bawi");
			}
			else if(computer == bo){
				System.out.println("bo");
			}
			
			if(player - computer ==1 ) {
				result += 1;}
			else if(player - computer == -2) {
				result += 1;
			}
			sum += i;
		}

		System.out.println(result);
	}


}



