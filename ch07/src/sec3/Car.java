package sec3;

public class Car {
	Tire frontLeftTire = new Tire(7, "앞 왼쪽");
	Tire frontRightTire = new Tire(4, "앞 오른쪽");
	Tire backLefTire = new Tire(5, "뒤 왼쪽");
	Tire backRighTire = new Tire(3, "뒤 오른쪽");
	
	public Car() { }
	
	public int run() {
		System.out.println("---- 자동차가 달립니다. ----");
		if(frontLeftTire.roll()==false) { stop(); return 1; }
		if(frontRightTire.roll()==false) { stop(); return 2; }
		if(backLefTire.roll()==false) { stop(); return 3; }
		if(backRighTire.roll()==false) {stop(); return 4; }
		return 0;
	}
	public void stop(){
		System.out.println("자동차가 멈춥니다.");
	}
}
