import java.math.BigInteger;

public class Cliente {
    private String nome;
    private BigInteger CPF;
    private double salario;
    private Conta conta = new Conta() ;

    public Cliente(String nome, BigInteger cpf, double salario) {
        this.nome = nome;
        this.CPF = cpf;
        this.salario = salario;

        //Gerando limite
        double limite = salario  * 0.1;
        conta.InserirLimite(limite);
    }
    ;
    
    public void setNome(String nome) 
   	{
   		this.nome = nome;
   	}
    public String getNome()
    {
        return this.nome;
    }

    public String CadastroCliente()
    {
        return "\nDados do Cliente: "+
                "\nNome:" + this.nome
                +"\nCPF:" + this.CPF
                +"\nSalario:" + this.salario;
    }
    
	public void setCPF(BigInteger CPF) 
	{
		this.CPF = CPF;
	}
	
	public BigInteger getCPF() 
	{
        return this.CPF;
	}
	
	public void setSalario(double salario) 
	{
		this.salario = salario;
	}
	
	public double getSalario() 
	{
		return this.salario;
	}    

}
