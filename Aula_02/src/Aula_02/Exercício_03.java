/* Leia a idade de uma pessoa e informe se a pessoa é:
1. Criança (idade < 12)
2. Adolescente (12 <= idade <= 18)
3. Jovem (18 < idade < 30)
4. Adulto (30 <= idade <= 60)
5. Idoso (idade > 60) */

package Aula_02;
import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe sua idade:");
		idade = scan.nextInt();
		
		if(idade < 12) {
			System.out.println("Você é uma criança.");
		}else if( idade >= 12 && idade <= 18) {
			System.out.println("Você é um adolescente.");
		}else if(idade > 18 && idade < 30) {
			System.out.println("Você é jovem.");
		}else if(idade >= 30 && idade <= 60) {
			System.out.println("Você é adulto.");
		}else {
			System.out.println("Você é idoso kkk");
		}

		scan.close();
	}
}
