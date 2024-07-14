import java.util.Scanner;
import java.util.Random;

public class Aulas2 {

	public static void main(String[] args) {
		
//		for (int i=0; i<4; i++) 
//		{
//			System.out.println("Mensagem "+i);
//		}
		
//		int maior = 0;
		Scanner numeros = new Scanner(System.in); 
//		
//		for(int i=0; i<5; i++) 
//		{
//			System.out.println("Digite um número: ");
//			maior = numeros.nextInt();
//			
//			if(numeros > maior)
//		}
//		
//		System.out.println("O maior numero é: "+maior);
		
//		String nome = "Agnaldo Junior";
//		//System.out.println("Tamanho da string: "+ nome.length());
//		
//		for(int i=0; i<nome.length(); i++) 
//		{
//			System.out.println(nome.charAt(i));
//			
//		}
		
//		int cont = 0;
//		while(cont<nome.length()) 
//		{
//			System.out.println(nome.charAt(cont));
//			cont++;
//		}
		
//		int soma=0, num=0;
//		while(num != -1) 
//		{
//			System.out.println("Digite um número para somar(-1 para sair): ");
//			num = numeros.nextInt();
//			
//			if (num > 0) 
//			{
//				soma+=num;
//			}
//			else 
//			{
//				System.out.println("Numero invalido!!");
//			}
//		}
//		
//		System.out.println("A soma dos numeros é: " +soma);
		
		Random rd = new Random();
		
		int sorteio;
		
		sorteio = rd.nextInt(20);
		
		System.out.println(sorteio);
		
	}
}
