
public class PessoaJuridica extends Pessoa {
	private long cnpj;

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String getNome() 
	{
		return "Pessoa Juridica: " + super.getNome() + " - CNPJ: " + this.getCnpj();
	}
}
