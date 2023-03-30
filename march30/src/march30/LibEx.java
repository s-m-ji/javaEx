package march30;

public class LibEx {
	
	public static void main(String[] args) {
		LibMainEx lib = new LibMainEx();
//		lib.b
		System.out.println(lib.toString());
	}
	
	private BookEx[] bookArr = new BookEx[3];
	public void bookList() {
		bookArr[0] = new BookEx("스누피1", "찰리1");
		bookArr[1] = new BookEx("스누피2", "찰리2");
		bookArr[2] = new BookEx("스누피3", "찰리3");
	}
	
	@Override
	public String toString() {
		String str = "";
		for(BookEx b : bookArr) {
//			str += b.getTitle() +"/"+ b.getAuthor() +"\n";
			str += b.toString() + "\n";
		}
		return str;
	}
}
