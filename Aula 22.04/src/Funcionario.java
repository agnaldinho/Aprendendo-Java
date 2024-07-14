
public abstract class Funcionario {
	private String nome;
	private String CPF;
	private int matricula;
	private double salario;
	
	public Funcionario(String nome) 
	{
		this.nome = nome;
	}
	
	public abstract double taxaGremio();
	
	public double calcularSalario(int meses) 
	{
		double salario = this.salario * meses;
		return salario;
	}
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getCPF() 
	{
		return CPF;
	}
	public void setCPF(String cPF) 
	{
		CPF = cPF;
	}
	public int getMatricula() 
	{
		return matricula;
	}
	public void setMatricula(int matricula) 
	{
		this.matricula = matricula;
	}
	public double getSalario() 
	{
		return salario;
	}
	public void setSalario(double salario) 
	{
		this.salario = salario;
	}
	
	

}
