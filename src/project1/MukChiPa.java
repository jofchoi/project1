package project1;
import java.util.Random;
public class MukChiPa {

	public static void main(String[] args) {
		int 바위 = 0;
		int 보 = 1;
		int 가위 = 2;
		double result;
		int player = 2; 
		Random r = new Random();
		int computer = r.nextInt(3);
		int playCount = 9;
		int total = 0;
		int i;
		int finalScore = 0;


		for(i =0; i <= playCount; i++) {

			computer = r.nextInt(3);
			if(player == 바위) {
				System.out.println("바위");
			}
			if(player == 보) {
				System.out.println("보");
			}
			if(player == 가위) {
				System.out.println("가위");									
			}

			if(computer == 바위) {
				System.out.println("바위");
			}
			if(computer == 보) {
				System.out.println("보");
			}
			if(computer == 가위) {
				System.out.println("가위");									
			}
			result = player - computer;
			if(result == 0) {
				System.out.println("비김");									
			}
			if(result == 1) {
				System.out.println("이김");		
				finalScore += 1;
			}
			if(result == -1) {
				System.out.println("졋음");									
			}
			if(result == 2) {
				System.out.println("졋음");															
			}
			if(result == -2) {
				System.out.println("이김");	
				finalScore += 1;
			}					
			total += i;

			System.out.println( );
		}
		System.out.println(finalScore);
	}

}
