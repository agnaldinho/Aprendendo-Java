
public class Polimorfismo {

	public static void main(String[] args) {
		
		Pessoa fisica = new PessoaFisica();
		
		fisica.setNome("Nolberto Nobrega");
		
		System.out.println(fisica.getNome());
		
		PessoaFisica pFisica = new PessoaFisica();
		PessoaJuridica pJuridica = new PessoaJuridica();
		
		pFisica.setNome("Robson pereira");
		pFisica.setCpf(12345678910L);
		pJuridica.setNome("Jadson");
		pJuridica.setCnpj(339292202020349L);
		
		Pessoa[] pessoas = new Pessoa[2];
		pessoas[0] = pFisica;
		pessoas[1] = pJuridica;
		
		for (Pessoa pessoa: pessoas) 
		{
			System.out.println(pessoa.getNome());
		}
		
		Pessoa pfisica = new PessoaFisica();
		
		PessoaFisica pfisica2 = (PessoaFisica) pfisica;
		pfisica2.setCpf(12345);
	}

}
