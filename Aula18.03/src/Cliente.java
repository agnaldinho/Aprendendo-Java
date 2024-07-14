import java.util.ArrayList;

public class Cliente {
	private String nome;
	private ArrayList<String> CPF;
	private double salario;
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getNome() 
	{
		return this.nome;
	}
	
	public Cliente() 
	{
		this.CPF = new ArrayList<>();
	}
	
	public void setCPF(String CPF) 
	{
		this.CPF.add(CPF);
		
	}
	
	public String getCPF() 
	{
        return this.CPF.get(0);
	}
	
	public void setSalario(double salario) 
	{
		this.salario = salario;
	}
	
	public double getSalario() 
	{
		return this.salario;
	}
}
