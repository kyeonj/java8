package sec1;

public class Oper5 {
	
	public static void main(String[] args) {
		//2진수(0,1) 1의보수 (complement=not) 
		//10진수(0~9) 37-12(-안됨. 12>9의보수로변경. 음수(-)처리를위해.
		
		//비트(2진) 연산
		//10>n진수, n으로나눔:정수 
		//21 변환(16, 8, 4, 2, 1 -> 10101(2진수)
		//256(10진수) 10의0승, 10의1승, 10의2승. 200+50+6
		
		int a=10, b=20, c=30, d=40, e, f, g, h;
		e = c & d;
		f = c | d;
		g = ~(c & d);
		h = c ^ d;
		System.out.println("c&d => "+e);	//2진수 and -> 8
		System.out.println("c|d => "+f);	//2진수 or -> 62
		System.out.println("~(c & d) => "+g);	//2진수 보수(보충수) ->-9
		System.out.println("c ^ d; => "+h);	//배타적 OR( eXclusi OR) 입력이 서로 다를때 1 -> 54
		System.out.println("d >> 2 => "+(d >> 2));	//오른쪽쉬프트2번자리를떨굼(%2.<<(*2) ->10
		System.out.println("d >> 2 => "+(d << 2));	//왼쪽2번째자리를떨굼 ->160
		System.out.println("d >>> 2 => "+(d >>> 2));	// 오른쪽 이중시프트 ->10
		System.out.println("d <<< 2는 존재하지않음" );		// 왼쪽 이중시프트는 연산자가 없음.
		
		//연산시 부정과 불능 그리고 예외처리
		//System.out.println(a / 0);	//Not a Number => NaN(부정)
		//System.out.println('k' / 4);
		//System.out.println("k" / 4);
		//System.out.println(a % 0);	// Infinity(불능)
		try {
			int k = 20;
			System.out.println(k / 0);	//실행해야할 구문
		} catch(ArithmeticException e1){	
			System.out.println("산술연산에 오류가 존재함");	//실행해야할 구문이 오류 발생시 처리해야할 내용
		//e1.printStackTrace();
		}
		
	}

}
