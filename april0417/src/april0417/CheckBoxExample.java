package april0417;

public class CheckBoxExample {

	public static void main(String[] args) {
		CheckBox checkbox = new CheckBox();
		checkbox.setOnSelectListener(new BackgroundChangeListener());
		checkbox.select();
		
	}

}
