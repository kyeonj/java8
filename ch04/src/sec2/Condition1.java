package sec2;

import java.util.Scanner;
//컨트롤쉬프트o누르면생김. 
public class Condition1 {

	public static void main(String[] args) {
		System.out.println("점수입력:");
		Scanner sc = new Scanner(System.in);//컨트롤쉬프트o누르면생김
		int num = sc.nextInt();
//		if (조건식){
//			참일때 실행문;
//		} else {
//			거짓일때실행문;
//		}
		if(num>=80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		//명령문이 한줄이면, {}중괄호 블록이 생략가능
		if(num<60) System.out.println("재평가");
		else System.out.println("과목이수");
		
		//else없이 진행하는 경우
		String str = "탈락";
		if(num>=80) str="합격";
		System.out.println(str);
		
		//삼항 연산자
		String str2 = (num>=80) ? "합격" : "탈락";
		System.out.println(str2);
		
		sc.close();
	}

}