package element;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Block extends Element {
	
	/*블록 클래스 생성자*/
	public Block(int blockX, int blockY) {
		super(blockX, blockY);
		
		//동작 확인
		System.out.println("블록 생성자 호출");
	}
	
}