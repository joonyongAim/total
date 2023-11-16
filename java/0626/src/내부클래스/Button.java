package 내부클래스;

public class Button {
	
	OnClick listener;
	
	public void setListener(OnClick listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.click();
	}
	
	interface OnClick {
		public void click();
	}

}
