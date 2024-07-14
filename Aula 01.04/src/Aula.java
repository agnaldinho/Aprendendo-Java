
public class Aula {
	String nome;
	String CPF;
	double salario;
	
	public Aula(String nome, String CPF, double salario) 
	{
		this.nome = nome;
		this.CPF = CPF;
		this.salario = salario;
	}
	public double calcularSalario(int meses)
	{
		double SalarioFinal = this.salario * meses;
		return SalarioFinal;
	}
	public double calcularSalario(int meses, double bonus) 
	{
		double SalarioFinal = this.salario * meses + bonus;
		return SalarioFinal;
	}
}
