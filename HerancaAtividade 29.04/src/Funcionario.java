
public abstract class Funcionario implements Pessoa {
	public String Matricula;
	public double Salario;
	public String Setor;
	public String Nome;
	public String CPF;
	public String Nascimento;
	public String Endereco;
	
	public Funcionario() 
	{
		
	}
	public Funcionario(String matricula, double salario, String Setor, String nome, String CPF, String Nascimento, String Endereco) 
	{
		this.Matricula = matricula;
		this.Salario = salario;
		this.Setor = Setor;
		this.Nome = nome;
		this.CPF = CPF;
		this.Nascimento = Nascimento;
		this.Endereco = Endereco;
	}
}
