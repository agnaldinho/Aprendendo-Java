
public class Professor extends Funcionario{
	private String disciplina;
	private int cargaHoraria;
	
	public Professor(String nome, String disciplina) 
	{
		super(nome);
		this.disciplina = disciplina;
	}
	
	public String getDisciplina() 
	{
		return disciplina;
	}
	public void setDisciplina(String disciplina) 
	{
		this.disciplina = disciplina;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) 
	{
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double taxaGremio() {
		return getSalario() * 0.02;
	}
	
	public String toString() 
	{
		String txt = "\nProfessor " + getNome() + "\nDisciplina: " + getDisciplina();
		return txt;
	}

}
