
import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		String Dados;
		int ra;
		boolean control = true;
		Scanner scan = new Scanner(System.in);
		
		while(control) 
		{
			System.out.println("Digite seu ra: ");
			Dados = scan.next();
			try 
			{
				ra =Integer.parseInt(Dados);
				System.out.println("Ra: "+ra);
				control = false;
			}
			catch(Exception e) 
			{
				System.out.println("Dados errados: " + e.getMessage());
			}
		}
			
	}

}
