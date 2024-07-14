package introducao;

import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		
		float nota1, nota2, media;
		Scanner teste = new Scanner(System.in); 
		
		System.out.println("Digite a primeira nota: ");
		nota1 = teste.nextFloat(); 
		
		System.out.println("Digite a segunda nota: ");
		nota2 = teste.nextFloat(); 
		
		media = (nota1+ nota2) / 2;
		
		System.out.println("A media é " + media);
		
		if (media < 4)
			System.out.println("Reprovado!!!");
		
		else if(media < 6)
			System.out.println("Recuperaçãoo!");
		
		else
			System.out.println("Aprovado!");
		
		
		
			
		
	}
}
