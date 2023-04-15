package april0415;

public class Button {
	OnClickListener listenr; 	// 인터페이스 타입 필드

	void setListenr(OnClickListener listenr) {
		this.listenr = listenr;
	}
	
	void touch() {
		listenr.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
}
