
public class Diretor extends Gestor{
	private double bonus;
	
	public Diretor(String nome, String setor, double bonus) 
	{
		super(nome,setor);
		this.bonus = bonus;
	}
	@Override
	public double calcularSalario(int meses) 
	{
		return this.getSalario() * meses + bonus;
	}

	public double getBonus() 
	{
		return bonus;
	}

	public void setBonus(double bonus) 
	{
		this.bonus = bonus;
	}
	
	public String toString() 
	{
		String txt = "\nDiretor " + getNome() + "\nSetor: " + getSetor();
		return txt;
	}

}
