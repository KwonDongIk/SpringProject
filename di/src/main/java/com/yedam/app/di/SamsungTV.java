package com.yedam.app.di;

public class SamsungTV implements TV{
	
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public SamsungTV() {
		System.out.println("===> SamsungTV");
	}

	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}

	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
