public class Vendedor extends Funcionario {
	public int vendas;
	public double comissao;
	
	public Vendedor() 
	{
		super();
	}
	
	public Vendedor(String matricula, double salario, String Setor, String nome, String CPF, String Nascimento, String Endereco, int vendas, double comissao) 
	{
		super(matricula, salario, Setor, nome, CPF, Nascimento, Endereco);
		this.vendas = vendas;
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

	public double getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
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
		return "\n\nVendedor " +
                "\nNome = " + Nome + 
                "\nCPF = " + CPF + 
                "\nNascimento = " + Nascimento +
                "\nEndereço = " + Endereco + 
                "\nvendas = " + vendas +
                "\nComissao = " + comissao;

	}

}
