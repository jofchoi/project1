package project1;
import java.util.Random;
public class MukChiPa {

	public static void main(String[] args) {
		int ���� = 0;
		int �� = 1;
		int ���� = 2;
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
			if(player == ����) {
				System.out.println("����");
			}
			if(player == ��) {
				System.out.println("��");
			}
			if(player == ����) {
				System.out.println("����");									
			}

			if(computer == ����) {
				System.out.println("����");
			}
			if(computer == ��) {
				System.out.println("��");
			}
			if(computer == ����) {
				System.out.println("����");									
			}
			result = player - computer;
			if(result == 0) {
				System.out.println("���");									
			}
			if(result == 1) {
				System.out.println("�̱�");		
				finalScore += 1;
			}
			if(result == -1) {
				System.out.println("����");									
			}
			if(result == 2) {
				System.out.println("����");															
			}
			if(result == -2) {
				System.out.println("�̱�");	
				finalScore += 1;
			}					
			total += i;

			System.out.println( );
		}
		System.out.println(finalScore);
	}

}
