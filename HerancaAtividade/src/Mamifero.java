
public class Mamifero extends Animal {
	private String alimento;
	
	public Mamifero(String nome, double comprimento, int numerosPatas, String cor, double velocidadeMedia,String ambiente, String alimento) {
		super(nome, comprimento, numerosPatas, cor, velocidadeMedia, ambiente);
		this.alimento = alimento;
	}

	public String getAlimento() 
	{
		return alimento;
	}

	public void setAlimento(String alimento) 
	{
		this.alimento = alimento;
	}
	
	public void dadosMamifero() 
	{
		System.out.println("\n\nNome: " + getNome() + "\nNumeros de patas: " + getNumerosPatas() + "\nComprimento: " + getComprimento() + " Cm" 
		+ "\nCor: " + getCor() + "\nVelocidade media: " + getVelocidadeMedia() + " m/s" + "\nAmbiente: " + getAmbiente()  + "\nAlimento: " + getAlimento());
	}

	
	

}
