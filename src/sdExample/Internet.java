/**
 * ## 실행
- 인터넷(Internet) 클래스 생성 후 메인메소드 추가.
- 자유게시판에 들어가서 게시글 전체가져와 출력한다.
- 5번째 게시글을 가져와 출력한다.
- 익명게시판에 들어가서 게시글 전체가져와 출력한다.
- 10번째 게시글을 가져와 출력한다.


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
