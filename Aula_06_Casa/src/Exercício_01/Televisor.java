package Exercício_01;

public class Televisor {
	
	private int volume;
	
	public Televisor (int volume) {
		this.volume = volume;
	}
	
	public Televisor () {
		this.volume = 0;
	}
	
	public void aumentaVolume() {
		if(volume < 40) {
			volume++;
		}
	}
	
	public void diminuiVolume() {
		if(volume > 0) {
			volume--;
		}
	}
	
	public int retornaVolume() {
		return volume;
	}
	
	//Getter and Setter
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
