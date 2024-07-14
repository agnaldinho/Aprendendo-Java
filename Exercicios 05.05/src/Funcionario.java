
public class Funcionario extends ClasseImutavel{
	private String nome;
	private double salario;
	private final int RA;
	
	public Funcionario(int RA, int valor)
	{
		super(valor);
		this.RA = RA;
	}
	

}
