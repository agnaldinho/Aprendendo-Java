import java.math.BigInteger;
import java.util.Random;

public class Conta {
    private String numero;
    private int agencia = 420;
    private int tipo;
    private double saldo;
    private double limite;
    private String senha;
    private Endereco endereco;
    private Cliente cliente;

    public void DadosCliente(String nome, BigInteger cpf, double salario)
    {
         this.cliente = new Cliente(nome,cpf,salario);
    }

    public void DadosEndereco(String CEP,int numero,String endereco, String cidade, String estado, String bairro)
    {
      this.endereco = new Endereco(CEP,numero,endereco,cidade,estado,bairro);
    }

    public void InserirLimite(double limite)
    {
        this.limite = limite;
        System.out.println("Conta criada com sucesso!");
        System.out.println("Limite: " + this.limite);
    }

    public void CriarConta (String numero,int tipo,String senha)
    {
        String tipoEscrito = "";

       this.numero = numero;
       this.tipo  = tipo;
       this.senha = senha;

       if(this.tipo == 1)
       {
           tipoEscrito = "Conta Corrente";
       }
       else if(this.tipo == 2)
       {
           tipoEscrito = "Conta Poupança";
       }
        System.out.println("Numero da conta: " + this.numero);
    }

    public boolean Login(String numero,String senha)
    {
        boolean validate = false;
        if(this.senha.equals(senha) && this.numero.equals(numero))
        {
            System.out.println("Login efetuado com sucesso!");
            System.out.println("Seja bem-vindo " + cliente.getNome());
            validate = true;
        }
        else
        {
            System.out.println("Numero ou senha incorretos!");
        }
        return validate;
    }

    public double SaldoBancario()
    {
        return this.saldo;
    }


    public void DepositoBancario(double deposito)
    {
        this.saldo += deposito;
    }

    public void SaqueBancario(double saque)
    {
        if(this.saldo < saque)
        {
            System.out.println("Saldo insulficiente!");
        }
        else
        {
            System.out.println("Saque realizado com sucesso!");
            this.saldo -= saque;
        }
    }

    public String Cadastro()
    {
        System.out.println(cliente.CadastroCliente());
        System.out.println(endereco.CadastroEndereco());
        return "\nDados bancarios:" +
                "\nAgencia: " + agencia+
                "\nConta: " + numero;
    }

    public void setSenha(String senha) 
    {
    	this.senha = senha;
    }
    public String getSenha()
    {
        return this.senha;
    }

    public void setNumero(String numero) 
    {
    	this.numero = numero;
    }
    public String getNumero()
    {
        return this.numero;
    }
    
    public String getNome()
    {
        return cliente.getNome();
    }
 
    public int getagencia() 
    {
    	return this.agencia;
    }

    public void setLimite(double limite) 
    { 
    	this.limite = limite;
    }
    public double getLimite() 
    {
    	return this.limite;
    }

    public void setTipo(int Tipo) 
    {
    	this.tipo = Tipo;
    }
    public int getTipo() 
    {
    	return this.tipo;
    }

    public void setDeposito(double valor) 
    {
    	this.saldo =+ valor;
    }
    public double getDeposito() 
    {
    	return this.saldo;
    }
    public void setSaque(double valor) 
   {
	   if(this.saldo + limite >= valor) 
	   {
		   this.saldo -= valor;
		   System.out.println("Valor sacado com sucesso!");
	   }
	   else 
	   {
		   System.out.println("Saldo insuficiente");
	   }
   }
    
   public double ValorSaldo() 
   {
	   return this.saldo;
   }
    

}
