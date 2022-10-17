package java07;

public class RemoteEx1 {

	public static void main(String[] args) {
		RemoteControl rc1;
		RemoteControl rc2;
		rc1 = new Television();
		rc2 = new Audio();
		
		rc1.turnOn();
		rc1.setVolume(8);
		rc1.setMute(true);
		rc1.turnOff();
		
		rc1 = rc2;
		
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.setMute(true);
		rc1.turnOff();
		
		RemoteControl rc3=new RemoteControl() {
			public void turnOn() {System.out.println("전원 ON");}
			public void turnOff() {System.out.println("전원 OFF");}
			public void setVolume(int volume) {
				System.out.println("볼륨 값 : " +volume);
			} 
		};
		
		//rc3.turnOn();
		//rc3.setVolume(6);
		//rc3.turnOff();
		
		//System.out.println("rc1은 Television의 객체? "+(rc1 instanceof Television));
		//System.out.println("rc1은 Audio의 객체? "+(rc1 instanceof Audio));
		//System.out.println("rc1은 RemoteControl의 객체? "+(rc1 instanceof RemoteControl));
		
		RemoteControl[] rc = null;
	}
}
