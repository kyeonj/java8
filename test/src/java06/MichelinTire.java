package java06;

public class MichelinTire extends Tire {
	public MichelinTire(String location, int maxRotation){
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " 미쉐린타이어 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("**** "+location+" 미쉐린타이어 펑크 ****");
			return false;
		}
	}
}
