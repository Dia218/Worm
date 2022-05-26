package element;

import java.awt.*;
import screen.*;

public abstract class Element {
		
	/*요소 클래스 필드*/
	protected int elementX;
	protected int elementY;
	protected Color color;
	
	/*요소 클래스 생성자*/
	public Element(int elementX, int elementY) {
		this.elementX = elementX;
		this.elementY = elementY;
		
		//요소의 패널 객체 생성
		ElementPanel elementPanel = new ElementPanel(this);
		
		//동작 확인
		System.out.println("요소 만들기");
	}
	
	/*요소 클래스 메소드*/
	public int returnX() {
		return this.elementX;
	}
	public int returnY() {
		return this.elementY;
	}
	public Color returnColor() {
		return this.color;
	}
}
