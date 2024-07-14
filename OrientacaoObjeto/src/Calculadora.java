
public class Calculadora {
	int num1;
	int num2;
	int vetor[];
	
	int somar() 
	{
		int resultado = num1 + num2;
		return resultado;
	}
	int multiplicar() 
	{
		int resultado = num1 * num2;
		return resultado;
	}
	
	int somarVetor()
	{
		int resultado = 0;
		for(int i = 0; i < vetor.length; i++)
		{
			resultado += vetor[i];
		}
		return resultado;
	}
	int multiplicarVetor() 
	{
		int resultado = 1;
		for(int i = 0; i < vetor.length; i++)
		{
			resultado *= vetor[i];
		}
		return resultado;
	}
}
