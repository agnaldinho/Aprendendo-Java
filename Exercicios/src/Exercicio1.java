
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
//		Faça um programa que peça as notas de um aluno de acordo com a quantidade informada e 
//		ao final apresente a média, as notas digitadas, a maior nota e se o aluno foi aprovado
//		ou não.
		
		int QuantidadesNotas;
		double media, notas[], somatoria = 0, maior = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas: ");
		QuantidadesNotas = scan.nextInt();
		
		notas = new double[QuantidadesNotas];
				
		for(int i = 0; i < notas.length; i++) 
		{
			System.out.println("digite a nota: ");
			notas[i] = scan.nextDouble();
			somatoria += notas[i];
			
			if(maior < notas[i])
			{
				maior = notas[i];
			}
		}
		
		media = somatoria / notas.length;
		System.out.println("A sua média: " +media);
		System.out.println("A sua maior nota: "+maior);
		
		for(int j = 0; j < notas.length; j++)
		{
			System.out.println("Notas apresentadas: " + notas[j]);
		}
		
		if(media >= 6)
		{
			System.out.println("Aluno aprovado!!!");
		}
		else 
		{
			System.out.println("Aluno reprovado!!!");
		}
		
		
		


	}

}
