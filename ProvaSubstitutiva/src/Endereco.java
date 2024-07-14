
public class Endereco {
	//CEP e numero
	private String CEP;
	private String numero;
	
	public Endereco(String CEP, String numero) 
	{
		this.CEP = CEP;
		this.numero = numero;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String CEP) {
		this.CEP = CEP;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
