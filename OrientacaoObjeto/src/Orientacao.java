
public class Orientacao {

	public static void main(String[] args) {
//		Carro carro1 = new Carro();
//		Carro carro2= new Carro();
//		
//		carro1.ano = 2000;
//		carro1.cor = "Preto";
//		carro1.marca = "Fiat";
//		carro1.velocidade = 0;
//		
//		carro2.ano = 2020;
//		carro2.cor = "vermelho";
//		carro2.marca = "Tesla";
//		carro2.velocidade = 100;
//		
//		carro1.acelerar(20);
//		carro1.estadoAtual();
//		carro2.estadoAtual();
		
		Calculadora calc = new Calculadora();
		
		calc.num1 = 5;
		calc.num2 = 4;
		int vetor[] = {4,8,7,3};
		calc.vetor = vetor;
		
//		System.out.println(calc.somar());
//		System.out.println(calc.multiplicar());
		
		System.out.println(calc.somarVetor());
		System.out.println(calc.multiplicarVetor());
				
	}

}
