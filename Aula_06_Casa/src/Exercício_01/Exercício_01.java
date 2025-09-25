package Exercício_01;

public class Exercício_01 {

	public static void main(String[] args) {
		
		Televisor tv = new Televisor ();
		
		tv.aumentaVolume();
		tv.aumentaVolume();
		System.out.println("Volume atual: " + tv.retornaVolume());	
		
		tv.setVolume(39);
		tv.aumentaVolume();
		tv.aumentaVolume(); // Chegará apenas em 40, testando a validação.
		System.out.println("Volume atual: " + tv.retornaVolume());	
		
		tv.setVolume(0);
		tv.diminuiVolume(); // Não diminuirá o volume, pois está zerado.
		System.out.println("Volume atual: " + tv.retornaVolume());	
	}
}
