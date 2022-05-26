package screen;

import java.util.*;
import javax.swing.JPanel;
import element.*;

//���� �ʵ� �г� Ŭ����
public class GameField extends JPanel {
	
	//���� �ʵ� ��ü�� �� ���� �����ȴ�
	public static final GameField gamefield = new GameField(); 
	
	/*���� �ʵ� �ʵ�*/
	final int elementNum = 24; //����� ����
	final int elementSize = 20; //����� ũ��
	static HashMap<Locate, Element> hashmap = new HashMap<Locate, Element>(); //��ǥ�� ��Ҹ� �����ϴ� �ؽø� 
	static Set<Locate> keys = hashmap.keySet(); //�·� ��ü Ű�� �����ϴ� set �÷��� 
	static Iterator<Locate> iterator = keys.iterator(); //��ǥ ��ü�� �����ϴ� ���ͷ����� 
	
	
	/*���� �ʵ� ������*/
	private GameField() {
		//��ġ ������ ����
		this.setLayout(null);
		
		//���� �ʵ��� ũ��� ��ġ
		this.setBounds(elementSize*elementNum, elementSize*elementNum, 0, 0);
	}
	
	
	/*���� �ʵ� �޼ҵ�*/
	
	//���� �ʵ� ũ�⸦ �������ִ� �޼ҵ�
	public int returnFieldSize() {
		return this.elementNum*20;
	}
	
	//�ؽø��� �ʱ�ȭ�ϴ� �޼ҵ�
	void initElement() {
		//�·� : (0~23, 0~23)
		for(int x = 0; x < elementNum; x++) {
			for(int y = 0; y < elementNum; y++) {
				//�ؽø� Ű: Locate(��ǥ) ��ü ���������� ���� �� ���� 
				//�ؽø� ��: null 
				hashmap.put(new Locate(x, y), null);
			}
		}
	}
	
	//�ش� ��ǥ�� element�� ����ִ� �� Ȯ���ϴ� �޼ҵ�
	public boolean checkLocate(int checkX, int checkY) {
		//�ش� ��ǥ�� ��ġ�ϴ� ��ǥ ���� ����ִ� element�� null�̸� true
		if (null == hashmap.get(new Locate(checkX, checkY)))
			return true;
		else
			return false;
	}
	
	//������ ��ü�� �޾Ƽ� �ش� ��ǥ�� �����ϴ� �޼ҵ�
	public void setElement(Element element) {		
		Locate locate = new Locate(element.returnX(), element.returnY());
		hashmap.replace(locate, element);
		
		//���� Ȯ��
		System.out.println("�ؽøʿ� ��� set");
	}
	
	/*
	//�ؽøʿ� ���� ���� �ʵ� ��ü�� �׸��� �޼ҵ�
	public void drawField() {
		//��ǥ Ű ���� ���������� �湮
		while(iterator.hasNext()) {
			//�湮�� ��ǥ Ű ��
			Locate indexLocate = iterator.next();
			//�湮�� ��ǥ Ű ���� �ִ� element ��ü
			Element element = hashmap.get(indexLocate);
		}
		//���� �ʵ� �ٽ� �׸���
		this.revalidate();
		this.repaint();
		
		//���� Ȯ��
		System.out.println("���� �ʵ� �׸���");
	}
	*/
}

//��ǥ Ű Ŭ����
class Locate {
	
	/*��ǥ Ŭ���� �ʵ�*/
	private int X; //X��ǥ, Y��ǥ
	private int Y;
	
	
	/*��ǥ Ŭ���� ������*/
	public Locate(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	/*��ǥ Ŭ���� �޼ҵ�*/
	public int returnX() {
		return this.X;
	}
	public int returnY() {
		return this.Y;
	}
	
	
	/*�������̵�*/
	//equals �������̵�
	@Override
	public boolean equals(Object object) {
		Locate locateObject = (Locate) object;
		if (this.X == locateObject.X && this.Y == locateObject.Y)
			return true;
		else
			return false;
	}
	
	//�ؽ��ڵ� �������̵�
	@Override
	public int hashCode() {
		return Objects.hash(X, Y);
	}
}
