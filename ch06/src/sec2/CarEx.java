package sec2;

public class CarEx {

	public static void main(String[] args) {
		Car car1=new Car("롤스로이스","가솔린", 4000);
		car1.bootUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		System.out.println("현재속도 : "+car1.speedInfo() );
		car1.speedPrint();
		car1.speedDown();
		for(int i=0;i<100;i++){
			car1.speedDown();
		}
		System.out.println("현재 속도: "+car1.speedInfo());
		car1.bootOff();
		System.out.println("최고속도: "+Car.MAX_SPEED); //ca1.이 아닌 클래스명입력(Car)
		System.out.println("최저속도: "+Car.MIN_SPEED); //ca1.이 아닌 클래스명입력(Car)
		
		Car car2;	//인스턴스 선언
		car2= new Car();	//인스턴스의 속성에 값지정
		car2.setName("코닉세크 아제라s");		//인스턴스의 속성에 값 지정(저장)
		System.out.println();
	}

}
