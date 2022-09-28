package sec2;

public class DmbphoneEx {

	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		CellPhone p2 = new Dmbphone();
		//DmbPhone p3 = new CellPhone();
		Dmbphone p4 = new Dmbphone();
		System.out.println(p1.COMPANY);
		System.out.println(p2.COMPANY);
		System.out.println(p4.COMPANY);
		p1.powerOn();
		p1.powerOn();
		p1.powerOn();
		//부모클래스로 부터 유도된 객체는 자식클래스로 부터 유도된 객체의 내용으로 변환될수 있음.
		p1 = p4;	//자동 형변환
		//자식클래스로 부터 유도된 객체는 부모클래스로 부터 유도된 객체의 내용으로 자동 변환되지 않음
		Dmbphone p6;
		p6=(Dmbphone) p2; //강제 형변환
	}

}
