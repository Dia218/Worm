package element.worm;

import java.awt.Color;
import element.Worm;

public class WormHead extends Worm{
	public WormHead(int WormX, int WormY) {
		super(WormX,WormY);
		super.color = Color.RED;
		System.out.print(super.bodyXY[1][super.size-1]);
		// TODO Auto-generated constructor stub
		//���� �߰�
	
		
		//���� Ȯ��
		System.out.println("��������� �����");
	}
}