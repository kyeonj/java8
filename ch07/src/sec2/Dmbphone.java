package sec2;

public class Dmbphone extends CellPhone {
	int ch;
	
	final static String COMPANY="애플";
	
	/* 부모 클래스인 CellPhone에서 final static으로 정희하였으므로 오버라이딩 할수없음
	final static public void powerOn() {System.out.println("폰의 전원을 켭니다");}
	final static public void powerOff() {System.out.println("폰의 전원을 끕니다");}
	*/
	public int channelDisplay(){ return ch; }
	public void channeDown(){	ch--; }
	public void channeup(){	ch++; }
}
