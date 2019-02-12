package lesson2;

public class TransformerBook

{
	private int transformerDisplayDiagonal;
	private boolean touchScreen;
	public int getTransformerDisplayDiagonal() {
		return transformerDisplayDiagonal;
	}
	public void setTransformerDisplayDiagonal(int transformerDisplayDiagonal) {
		this.transformerDisplayDiagonal = transformerDisplayDiagonal;
	}
	public boolean isTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}
	
	public TransformerBook(int transformerDisplayDiagonal, boolean touchScreen) {
		this.setTransformerDisplayDiagonal(transformerDisplayDiagonal);
		this.setTouchScreen(touchScreen);	
	}
	
	public static void main(String[] args) {
		TransformerBook Samsung = new TransformerBook(10, true);
		Samsung.tabletMode();
		TransformerBook Asus = new TransformerBook(11, true);
		Asus.tabletMode();
		TransformerBook Aser = new TransformerBook(12, true);
		Aser.tabletMode();
		
	}	
		
	public void tabletMode() {
		setTouchScreen(true);
	}
}
