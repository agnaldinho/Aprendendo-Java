
public class Cliente implements Pessoa {
	private String TipoCliente;
	public String nome;
	public String CPF;
	public String nascimento;
	public String endereco;
	
	public Cliente(String TipoCliente, String nome, String CPF, String nascimento, String endereco) 
	{
		this.TipoCliente = TipoCliente;
		this.nome = nome;
		this.CPF = CPF;
		this.nascimento = nascimento;
		this.endereco = endereco;
	}
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void setCPF(String cpf) {
		this.CPF = cpf;
	}

	@Override
	public void setDataNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getCPF() {
		return this.CPF;
	}

	@Override
	public String getNascimento() {
		return this.nascimento;
	}

	@Override
	public String getEndereco() {
		return this.endereco;
	}

	public String getTipoCliente() {
		return this.TipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.TipoCliente = tipoCliente;
	}
	
	@Override
	public String toString()
	{
		return "\n\nCliente " +
                "\nNome = " + this.nome + 
                "\nCPF = " + this.CPF + 
                "\nNascimento = " + this.nascimento +
                "\nEndereço = " + this.endereco + 
                "\nTipo Cliente = " + this.TipoCliente;
	}
	

}
