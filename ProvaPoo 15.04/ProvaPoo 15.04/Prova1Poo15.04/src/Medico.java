
public class Medico {
	public String nome;
	public String CRM;
	public String especialidade;

	
	public Medico() 
	{
		
	}
	public Medico(String nome, String CRM, String especialidade) 
	{
		this.nome = nome;
		this.CRM = CRM;
		this.especialidade = especialidade;
	}
	public Medico(String nome) 
	{
		this.nome = nome;
	}
	public void Setnome(String nome) 
	{
		this.nome = nome;
	}
	public String getnome() 
	{
		return this.nome;
	}
	public void SetCRM(String CRM) 
	{
		this.CRM = CRM;
	}
	public String getCRM() 
	{
		return this.CRM;
	}
	public void SetEspecialidade(String Especialidade) 
	{
		this.especialidade = Especialidade;
	}
	public String getEspecialidade() 
	{
		return this.especialidade;
	}
	public void criarMedico(String nome2, String crm2, String especialidade2) {
		this.nome = nome;
		this.CRM = CRM;
		this.especialidade = especialidade;
		// TODO Auto-generated method stub
		
	}
}
