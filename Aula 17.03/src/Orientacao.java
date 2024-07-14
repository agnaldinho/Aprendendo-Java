
public class Orientacao {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		
		conta1.depositar(200.0);
		conta2.depositar(100.0);
		
		conta1.transferir(conta2,80.00);
		
		System.out.println("Saldo na conta1: "+conta1.getSaldo());
		System.out.println("Saldo na conta1: " + conta2.getSaldo());
	}

}
