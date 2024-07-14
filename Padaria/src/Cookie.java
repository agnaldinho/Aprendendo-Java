
public class Cookie implements item {
	private String nomeItem;
	private double preco;
	private String departamento;
	
	public Cookie(String nomeItem, String departamento) 
	{
		this.nomeItem = nomeItem;
		this.departamento = departamento;
	}
	
	public void setNomeItem(String nomeItem) 
	{
		this.nomeItem = nomeItem;
	}
	
	public String getNomeItem() 
	{
		String cookie = "Nome do cookie: ";
		return cookie + nomeItem;
	}

	@Override
	public double getPreco() 
	{
		return preco;
	}

	@Override
	public void setPreco(double preco) 
	{
		this.preco = preco;	
	}

	@Override
	public String getDepartamento() 
	{
		String texto = " Departamento: ";
		return texto + departamento;
	}

}
