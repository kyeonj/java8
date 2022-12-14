package java07;

public class Television implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("*Tv 전원을 켭니다.*");
	}

	@Override
	public void turnOff() {
		System.out.println("*Tv 전원을 끕니다.*");
	}
	public int getVolume() {
		return volume;
	}
	@Override
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else{
			this.volume=volume;
		}
		System.out.println("현재 Tv 볼륨 : "+this.volume);
	}
}
