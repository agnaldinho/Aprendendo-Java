
public class Pao implements item {
	
	private double preco;
	private String nomeItem;
	private String departamento;
	
	public Pao(String nomeItem, String departamento) 
	{
		this.nomeItem = nomeItem;
		this.departamento = departamento;
	}
	
	public void setNomeItem(String nomeItem) 
	{
		this.nomeItem = nomeItem;
	}
	
	@Override
	public String getNomeItem() {
		return nomeItem;
	}

	@Override
	public double getPreco() {
		return preco;
	}

	@Override
	public void setPreco(double preco) 
	{
		this.preco = preco;	
	}

	@Override
	public String getDepartamento() {
		String texto = " Departamento: ";
		return texto + departamento;
	}

}
