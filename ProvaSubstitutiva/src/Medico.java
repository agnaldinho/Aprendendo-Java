
public class Medico {
	//nome, CRM e matricula. 
	
	private String nome;
	private String CRM;
	private String matricula;
	
	public Medico(String nome) 
	{
		this.nome = nome;
	}
	
	public Medico(String nome, String CRM, String matricula) 
	{
		this.nome = nome;
		this.CRM = CRM;
		this.matricula = matricula;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getMatricula() 
	{
		return matricula;
	}

	public void setMatricula(String matricula) 
	{
		this.matricula = matricula;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String CRM) {
		this.CRM = CRM;
	}
	
}

