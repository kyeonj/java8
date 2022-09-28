package sec3;

public class SingletoneEx {
	public static void main(String[] args) {
		//Singletone single1 = new Singletone();
		Singletone single1 = Singletone.getInstance();//static은 singletone네임을 적어서 불러와야됨.
		Singletone single2 = Singletone.getInstance();
		Singletone single3 = Singletone.getInstance();
		System.out.println(single1);
		System.out.println(single2);
		System.out.println(single3);
		if(single1==single3){
			System.out.println("single은 single2입니다.");
		} else {
			System.out.println("single과 single2는 다른 객체 입니다.");
			//공유객체는 변수명앞에 static이 꼭 붙어야함.
			//접근제한자는 디폴트 또는 퍼블릭?으로 설정되어야지 쓸수있음.
			
		}
	}

}
