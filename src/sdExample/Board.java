/**# 이론
- 메소드 오버라이딩과 메소드 오버로딩을 각각 설명하시오.
 오버라이딩은 상속관련 개념인데 부모에서 설정한 매소드를 자손에서 수정하여 사용가능하게 만드는거 
 오버로딩은 같은 매소드를 다른 매계변수를 받을수 있게 여러개 설정하는거   

# 실습
## 구성
- 게시판(Board) 클래스 생성.
- 게시판 메서드는 총 2개로 게시글전체가져오기(getBoardList), 특정게시글 가져오기(getBoard)
- 각 게시판 생성시 길이가 10인 숫자형 배열을 선언하고 안에 임의의 숫자로 초기화한다.


## 챌린지
- 게시판 클래스에 정렬된게시글 가져오기(getSortedBoardList) 메소드를 추가하여 구현하고 인터넷 클래스에서 정렬된 게시글을 조회한다.
- 게시판 생성시 배열대신 ArrayList 로 바꿔서 구현해보자.
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