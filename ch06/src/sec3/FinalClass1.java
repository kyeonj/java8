package sec3;

public class FinalClass1 {
	final static double PI = 3.14;
	static final byte MIN_VALUE = 0;	//상수는 대문자, 기억장소를줄이기위해 바이트를사용
	static final byte MAX_VALUE = 100;
	final static double CIRCLE_LENGTH(){	//항상 같은결과를 얻는 메소드
		return PI *100;
	}
}
