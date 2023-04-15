package april0415;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setListenr(new CallListener());
		btn.touch();
		
		btn.setListenr(new MessageListener());
		btn.touch();
	}
}
