package project1;

public class oddnumsum {

	public static void main(String[] args) {
		int num;
		int total = 0;
		
		for(num=1;num<=100;num++) {
			if(num % 2 == 0)
				continue;
			total += num;
		}
		System.out.println(total);
	}

}
