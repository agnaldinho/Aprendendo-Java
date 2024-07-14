public class Endereco {
    private String CEP;
    private int numero;
    private String endereco;
    private String cidade;
    private String estado;
    private String bairro;

    public  Endereco(String CEP,int numero,String endereco, String cidade, String estado, String bairro)
    {
        this.CEP = CEP;
        this.numero = numero;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
    }

    public String CadastroEndereco()
    {
        return "\nEndereço cadastrado: " +
                "\nCEP:" + this.CEP
                +"\nEndereço: " + this.endereco
                +"\nNumero: " + this.numero
                +"\nCidade: " + this.cidade
                +"\nEstado: " + this.estado
                +"\nBairro: " + this.bairro;
    }
    public void setCEP(String CEP) 
	{
		this.CEP = CEP;
	}
	public String getCEP() 
	{
		return this.CEP;
	}
	
	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	public String getEndereco() 
	{
		return this.endereco;
	}
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	public int getNumero() 
	{
		return this.numero;
	}
	
	public void setBairro(String bairro) 
	{
		this.bairro = bairro;
	}
	public String getBairro() 
	{
		return this.bairro;
	}
	
	public void setCidade(String cidade) 
	{
		this.cidade = cidade;
	}
	public String getCidade() 
	{
		return this.cidade;
	}
	
	public void setEstado(String estado) 
	{
		this.estado = estado;
	}
	public String getEstado() 
	{
		return this.estado;
	}
    
}
