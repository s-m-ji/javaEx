package april0417;

/* 내가 생각한 정답
import april0417.CheckBox.OnSelectListener;

public class BackgroundChangeListener implements OnSelectListener {

	@Override
	public void onSelect() {
		System.out.println("배경을 변경합네당");
	}
}
*/

// 교재 정답 : 인터페이스가 속한 클래스명을 명시해주었음.   
public class BackgroundChangeListener implements CheckBox.OnSelectListener {

	@Override
	public void onSelect() {
		System.out.println("배경을 변경합네당");
	}
}
