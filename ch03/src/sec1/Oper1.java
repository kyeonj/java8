package sec1;
//프로그램(Operation)의 모든 명령은 Op-code(연산자)와 Operand(피연산자)로 이루어지며,
//주소(기억장소의 개수)에 따라 0주소 명령어 형식 ~ 3주소 명령어 형식
//a = a + b ;
//+ : 연산(명령) Op-code
//a(저장된), b -> Operand 

//입력항에 따라 단항(unary) 연산과 이항(binay) 연산으로 분류됨
//boolean a=true;
//boolean b=!(not)a; !a 1개의 피연산자 a값을 반대로바꾼다.
//int c=a*b; 피연산자2 연산자1

//연산의 종류에 따라 산술, 논리, 비교, 비트(2진수), 증감, 대입 연산 등이있음.
//a=20, b=30; (=대입, a,b에 대입한다)


public class Oper1 {

	public static void main(String[] args) {
		int a=20, b=30, c;
		System.out.println(a);
		c = a + b ;
		//운용방식1 : +ab  -> per(fix) order(전위)
		//운용방식2 : ab+  -> post(fix) order(후위)
		//운용방식3 : a+b  -> in(fix) order(중위)
	}
	public static void prt() {
		System.out.println("data");
		
	}
}
