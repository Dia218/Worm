package element.item;

import java.awt.Color;

import element.Item;
import element.Worm;
import screen.GameField;

public class ConfuseItem extends Item {

	public ConfuseItem(int elementX, int elementY) {
		super(elementX, elementY);
		super.color = Color.YELLOW;
		// TODO Auto-generated constructor stub
		
		//동작 확인
		System.out.println("혼란 아이템 생성자 호출");
	}
	
	public static void conpuseEat() {	
		//어떻게 할까요?
		Worm.wormMove();
	}

}
