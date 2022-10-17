package java06;

public class Car2 {
	Tire[] tires = { new Tire(7, "왼쪽 앞"),
	new Tire(4, "오른쪽 앞"),
	new Tire(5, "왼쪽 뒤"),
	new Tire(3, "오른쪽 뒤")};
	
	public Car2() {}
	
	public int run() {
		System.out.println("---- 자동차가 달립니다. ----");
		for(int i=0;i<tires.length;i++){
			if(tires[i].roll()==false) { stop(); return i+1; }
		}
		return 0;
	}
	public void stop(){
		System.out.println("자동차가 멈춥니다.");
	}
}
