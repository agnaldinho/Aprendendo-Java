import java.util.ArrayList;

public class aulass {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Agnaldo");
		nomes.add("Carlos");
		nomes.add("Samuel");
		nomes.add("Willian");
		nomes.add("Thayla");
		
		printList(nomes);
		nomes.remove(1);
		
		nomes.set(0, "pos 1");
		nomes.set(1, "Primeiro");
//		nomes.clear();
		
		printList(nomes);
		
//		System.out.println(nomes.contains("Agnaldo"));
		
//		double salario = 1000;
//		double bonus = salario * (salario > 1000 ? 0.10 : 0.15);
//		
//		System.out.println(bonus);
		printList(nomes);
//		
		String elemento = "Willian";
		String possui = (nomes.contains(elemento) ? "Possui" : "Não possui");
		System.out.println("A lista " + possui + "O elemento "+elemento);

	}
	
	static void printList(ArrayList<String> nomes) 
	{
		System.out.println("\nImprimindo a lista: ");
		for(int i = 0; i < nomes.size(); i++) 
		{
			System.out.println(nomes.get(i));
		}
		System.out.println("----------------\n");
	}
	
}
