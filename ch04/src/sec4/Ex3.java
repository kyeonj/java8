package sec4;

public class Ex3 {

	public static void main(String[] args) {
		//1번
		//조건문: (if), (switch)
		//반복문: (for), (while), (do-while)
		
		//2번
		//2) duuble 타입은 변수타입으로 사용할수없다.
		//1.6 이하는 byte, char, short, int, iong 기준변수의 타입이 가능
		//1.7 이상에서는 String 기준변수의 타입이 추가됨.
		
		int res=0;
		for(int i=0;i<=100;i+=3){
			res+=i;
		}
		System.out.println("3의 배수의 합: "+res);
		
	}

}
