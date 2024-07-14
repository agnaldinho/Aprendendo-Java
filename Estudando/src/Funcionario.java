
public class Funcionario {
	private String nome;
	private String CPF;
	
	public Funcionario(String nome, String CPF) 
	{
		this.setNome(nome);
		this.setCPF(CPF);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String toString() {
		return getNome() + " : " + getCPF();
	}
}
