package element.block;
import java.awt.Color;
import element.Block;

public class KillBlock extends Block {

	public KillBlock(int blockX, int blockY) {
		super(blockX, blockY);
		super.color = Color.RED;
		// TODO Auto-generated constructor stub
		
		//���� Ȯ��
		System.out.println("ų ���� ������ ȣ��");
	}

	@Override
	public void executeBlock() {
		// TODO Auto-generated method stub
		
	}
	private void executeKillBlock() {
		//�����̸� ���δ� - ������ �ҹ�⸦ ���ش�
		//new GameOver();
		//IsGameOver = true;
	}
}
