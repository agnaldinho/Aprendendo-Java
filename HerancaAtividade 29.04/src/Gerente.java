public class Gerente extends Funcionario {
	public double bonus;
	public double comissao;
	
	public Gerente()
	{
		super();
	}
	
	public Gerente(String matricula, double salario, String Setor, String nome, String CPF, String Nascimento, String Endereco, double bonus, double comissao) 
	{
		super(matricula, salario, Setor, nome, CPF, Nascimento, Endereco);
		this.bonus = bonus;
		this.comissao = comissao;
	}
	
	@Override
	public void setNome(String nome) {
		Nome = nome;
	}
	@Override
	public void setCPF(String cpf) {
		CPF = cpf;
		
	}
	@Override
	public void setDataNascimento(String nascimento) {
		Nascimento = nascimento;
	}
	@Override
	public void setEndereco(String endereco) {
		Endereco = endereco;		
	}
	@Override
	public String getNome() {
		return Nome;
	}
	@Override
	public String getCPF() {
		return CPF;
	}
	@Override
	public String getNascimento() {
		return Nascimento;
	}
	@Override
	public String getEndereco() {
		return Endereco;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public String toString()
	{
		return "Gerente " +
                "\nNome = " + Nome + 
                "\nCPF = " + CPF + 
                "\nNascimento = " + Nascimento +
                "\nEndereço = " + Endereco + 
                "\nBonus = " + bonus +
                "\nComissao = " + comissao ;

	}

}
