
public class PessoaFisica extends Pessoa {
	private long cpf;

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String getNome() 
	{
		return "Pessoa Fisica: " + super.getNome() + " - CPF: " + this.getCpf();
	}
}
