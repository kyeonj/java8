package sec3;
//Tire의 모든 내용을 상속받되, roll() 메소드에서 타이어 이름을 부여
public class KumhoTire extends Tire {
	public KumhoTire(int maxRotation, String location){
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location + "KumhoTire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("**** "+location+" Trie 펑크 ****");
			return false;
		}
	}
}
