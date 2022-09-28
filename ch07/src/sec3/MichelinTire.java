package sec3;

public class MichelinTire extends Tire{
	public MichelinTire(int maxRotation, String location){
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location + "Michelin Tire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("**** "+location+" Trie 펑크 ****");
			return false;
		}
	}

}
