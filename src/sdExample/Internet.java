/**
 * ## ����
- ���ͳ�(Internet) Ŭ���� ���� �� ���θ޼ҵ� �߰�.
- �����Խ��ǿ� ���� �Խñ� ��ü������ ����Ѵ�.
- 5��° �Խñ��� ������ ����Ѵ�.
- �͸�Խ��ǿ� ���� �Խñ� ��ü������ ����Ѵ�.
- 10��° �Խñ��� ������ ����Ѵ�.


 */

package sdExample;

public class Internet {
	public static void main(String[] args) {
		System.out.println(FreeBoard.showInfo());
		System.out.println(FreeBoard.showInfo(5));
		System.out.println(AnonymousBoard.showInfo());
		System.out.println(AnonymousBoard.showInfo(10));
		
	}
}
