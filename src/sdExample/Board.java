/**# �̷�
- �޼ҵ� �������̵��� �޼ҵ� �����ε��� ���� �����Ͻÿ�.
 �������̵��� ��Ӱ��� �����ε� �θ𿡼� ������ �żҵ带 �ڼտ��� �����Ͽ� ��밡���ϰ� ����°� 
 �����ε��� ���� �żҵ带 �ٸ� �Ű躯���� ������ �ְ� ������ �����ϴ°�   

# �ǽ�
## ����
- �Խ���(Board) Ŭ���� ����.
- �Խ��� �޼���� �� 2���� �Խñ���ü��������(getBoardList), Ư���Խñ� ��������(getBoard)
- �� �Խ��� ������ ���̰� 10�� ������ �迭�� �����ϰ� �ȿ� ������ ���ڷ� �ʱ�ȭ�Ѵ�.


## ç����
- �Խ��� Ŭ������ ���ĵȰԽñ� ��������(getSortedBoardList) �޼ҵ带 �߰��Ͽ� �����ϰ� ���ͳ� Ŭ�������� ���ĵ� �Խñ��� ��ȸ�Ѵ�.
- �Խ��� ������ �迭��� ArrayList �� �ٲ㼭 �����غ���.
 */

package sdExample;
import java.util.ArrayList;
import java.util.Random;

public class Board {

	public static void main(String[] args) {

		public void getBoardList(int listNum) {
			Random random = new Random();
			ArrayList<Long> number = new ArrayList<Long>();
			for(int i = 0; i < listNum; i++) {
				number.add(random.nextInt((int) 10000000000L));
			}
		}

		public void getBoard(int boardNum) {
			Random random1 = new Random();
			ArrayList<Long> number1 = new ArrayList<Long>();
			for(int i = 0; i < boardNum; i++) {
				number1.add(random1.nextInt((int) 10000000000L));			
		}
	}
}
}