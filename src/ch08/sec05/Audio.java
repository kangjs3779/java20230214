package ch08.sec05;

public class Audio implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUM) {
			this.volume = RemoteControl.MIN_VOLUM;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 Audio 볼륨 : " + volume);
	}
	
	private int memoryVoulume;
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVoulume = this.volume;
			System.out.println("무음처리합니다");
			setVolume(RemoteControl.MIN_VOLUM);			
		} else {
			System.out.println("무음 해제합니다");
			setVolume(this.memoryVoulume);
		}
	}
}
