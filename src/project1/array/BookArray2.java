package array;

public class BookArray2 {
	public static void main(String[] args) {
		Book[] library = new Book[5];

		library[0] = new Book("tae", "jo");
		library[1] = new Book("dae", "her");
		library[2] = new Book("how", "you");
		library[3] = new Book("land", "park");
		library[4] = new Book("young", "saeng");

		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}

		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
	}
}
