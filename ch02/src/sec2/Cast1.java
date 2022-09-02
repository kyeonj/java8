package sec2;

public class Cast1 {

	public static void main(String[] args) {
		// = 대입연산자
		int a=1004, b;	//4
		short c, d;		//2
		long e, f;		//1
		b=65538;
		//c=a; -> a는 int 이므로 shotr인 c에 데이터 전달이 안됨.
		c=500;
		a=c; //short -> int= 자동형 변환(auto casting)
		d=(short) b;  // 형 변환 연산자에 의한 형 변환(force casting)
		System.out.println("d="+d);
		System.out.println("b="+b);
		/* e는 100*/
		e=b;
		/*e는 65538*/
		f= a+c;
		a=(int) (f+a);
		
	}

}
