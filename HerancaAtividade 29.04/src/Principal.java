
public class Principal {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("123-4",1567,"1","Gerson","66666-66","19/07/2002","Rua: treze",500,100);
		Vendedor vendedor = new Vendedor("256-1",1100,"1","Robson","55555-55","07/04/1961","Rua: Quatorze",10,50);
		Cliente cliente = new Cliente("Fisico", "Agnaldo", "77777-77","19/08/1955","Rua: quinze");
		
		
		
		System.out.println(gerente.toString());
		System.out.println(vendedor.toString());
		System.out.println(cliente.toString());

	}

}
