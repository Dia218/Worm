package item;

//아이템들의 클래스
public class ItemType {
	
	private String type; //아이템 종류
	private int point;	 //아이템 점수
	private double speedChange; //지렁이 속도 변화 수치
	
	public String returnType() {	//아이템 종류를 리턴
		return type;
	}
	public int returnPoint() {		//아이템 점수를 리턴
		return point;
	}
	public double returnSpeed() {	//지렁이 속도 변화 수치를 리턴
		return speedChange;
	}
}
