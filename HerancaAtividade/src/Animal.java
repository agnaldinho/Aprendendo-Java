
public class Animal {
	private String nome;
	private double comprimento;
	private int numerosPatas;
	private String cor;
	private double velocidadeMedia;
	private String ambiente;
	
	public Animal(String nome, double comprimento, int numerosPatas, String cor, double velocidadeMedia, String ambiente) 
	{
		this.setAmbiente(ambiente);
		this.nome = nome;
		this.comprimento = comprimento;
		this.numerosPatas = numerosPatas;
		this.cor = cor;
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumerosPatas() {
		return numerosPatas;
	}
	public void setNumerosPatas(int numerosPatas) {
		this.numerosPatas = numerosPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public String getAmbiente() 
	{
		return ambiente;
	}

	public void setAmbiente(String ambiente) 
	{
		this.ambiente = ambiente;
	}
	
	
	
	

}
