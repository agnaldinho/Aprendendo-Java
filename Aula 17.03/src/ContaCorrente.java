
public class ContaCorrente {
	int numero;
	int agencia;
	double saldo;

	void transferir(ContaCorrente conta, double valor) 
	{
		conta.saldo += valor;
		saldo -= valor;
		
	}
	
	void depositar(double deposito) 
	{
		saldo += deposito;
	}
	
	void sacar(double valor) 
	{
		if(saldo >= valor) 
		{
			saldo -= valor;
		}
		else 
		{
			System.out.println("Você não tem saldo suficiente!");
		}
	}
	
	double getSaldo() 
	{
		return saldo;
	}
}
