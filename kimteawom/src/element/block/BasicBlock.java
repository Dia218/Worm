package element.block;
import java.awt.Color;
import element.*;

public class BasicBlock extends Block {

	public BasicBlock(int blockX, int blockY) {
		super(blockX, blockY);
		super.color = Color.ORANGE;
		// TODO Auto-generated constructor stub
		
		//동작 확인
		System.out.println("베이직 블록 만들기");
	}

}
