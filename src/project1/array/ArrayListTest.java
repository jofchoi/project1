package array;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
				
		library.add(new Book("Tae","Jo"));
		library.add(new Book("Dae","Her"));
		library.add(new Book("how","You"));
		library.add(new Book("land","Park"));
		library.add(new Book("young","Saeng"));
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println( );
		
		System.out.println("==Ç×¼§µÈ for ¹®==");
		for(Book book : library) {
			book.showBookInfo();
		}
	}
}
