package sec4;

public class Ex8 {

	public static void main(String[] args) {
		
		for(int a=1;a<10;a++){
			for(int b=2;b<10;b++){
				System.out.print(b+"*"+a+"="+(a*b)+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		System.out.println("수열- 팩토리얼의 합계 출력");
		// 결과 : 1!+2!+3!+4!+5!+6!+7!+8!+9!+10!
		
		int mul=1;
		long res=0;
		for(int a=1;a<11;a++){
			mul*=a;
			res+=mul;
		}
		System.out.println("10! = "+res);
	}

}

