package java06;

public class Car {
	Tire frontLeftTire = new Tire(7, "왼쪽앞");
	Tire frontRightTire = new Tire(4, "오른쪽앞");
	Tire backLeftTire = new Tire(5, "왼쪽뒤");
	Tire backRightTire = new Tire(3, "오른쪽뒤");
	
	public Car() {}
	
	public int run() {
		System.out.println("---- 자동차가 달립니다. ----");
		if(frontLeftTire.roll()==false) { stop(); return 1; }
		if(frontRightTire.roll()==false) { stop(); return 2; }
		if(backLeftTire.roll()==false) { stop(); return 3; }
		if(backRightTire.roll()==false) { stop(); return 4; }
		return 0;
	}
	public void stop(){
		System.out.println("자동차가 멈춥니다.");
	}
}
