package sec1;

public class MemberEx {

	public static void main(String[] args) {
		//클래스명 인스턴스명 = new 생성자함수();
		Member mem1 = new Member();
		mem1.setId("kyj");
		System.out.println("아이디 : "+mem1.getId());
		mem1.setPassword("1004");
		System.out.println("비밀번호 : "+mem1.getPassword());
		mem1.setName("연정");
		System.out.println("이름: "+mem1.getName());
		mem1.setAddress("백석동");
		System.out.println("주소 : "+mem1.getAddress());
		
		Member mem2 = new Member("KYJ","1515");
		mem2.setId("KYJ");
		System.out.println("멤버2의 아이디 : "+mem2.getId());
		
		Member mem3 = new Member("kyj","공부해","열심히");
		Member mem4 = new Member("kyk","열심히","공부하자","미래를위해");
		System.out.println("당신의 아이디 : "+mem4.getId());
		System.out.println("당신의 사는곳 : "+mem4.getAddress());

		MemberController mc = new MemberController();
		mc.join("kyj", "1004", "연정");
		mc.info();
		mc.login("kyj", "1004");
		mc.info();	
	}
}
