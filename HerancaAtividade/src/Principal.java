public class Principal {

	public static void main(String[] args) {
		
		String animal = "Camelo";
		double comprimento = 150;
		int patas = 4;
		String cor = "Amarelo";
		String ambiente = "Terra";
		double velocidadeMedia = 2.0;
		String alimento = "null";
		Mamifero camelo = new Mamifero(animal, comprimento, patas, cor, velocidadeMedia, ambiente,alimento);
		
		String animal1 ="Tubarão";
		double comprimento1 = 300;
		int patas1 = 0;
		String cor1 = "Cinzento";
		String ambiente1 = "Mar";
		double velocidadeMedia1 = 1.5;
		String caracteristicas = "barbatanas e cauda";
		Peixe tubarao = new Peixe(animal1, caracteristicas, comprimento1, patas1, cor1, velocidadeMedia1, ambiente1);
		
		String animal2 ="Urso do canadá";
		double comprimento2 = 180;
		int patas2 = 4;
		String cor2 = "Vermelho";
		String ambiente2 = "Terra";
		double velocidadeMedia2 = 0.5;
		String alimento2 = "Mel";
		Mamifero ursoCanada = new Mamifero(animal2, comprimento2, patas2, cor2, velocidadeMedia2, ambiente2,alimento2);
		
		camelo.dadosMamifero();
		tubarao.dadosPeixe();
		ursoCanada.dadosMamifero();
		
	}

}
