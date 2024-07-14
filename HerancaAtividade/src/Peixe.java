
public class Peixe extends Animal{
	private String caracteristicas;
	
	public Peixe(String nome, String caracteristicas, double comprimento, int numerosPatas, String cor, double velocidadeMedia, String ambiente) 
	{
		super(nome, comprimento, numerosPatas, cor, velocidadeMedia, ambiente);
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public void dadosPeixe() 
	{
		System.out.println("\n\nNome: " + getNome() + "\nNumeros de patas: " + getNumerosPatas() + "\nComprimento: " + getComprimento() + " Cm" 
		+ "\nCor: " + getCor() + "\nVelocidade media: " + getVelocidadeMedia() + " m/s" + "\nAmbiente: " + getAmbiente() + "\nCaracteristicas: " + getCaracteristicas());
	}
}
