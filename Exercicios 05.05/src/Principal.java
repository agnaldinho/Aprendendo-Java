
public class Principal {

	public static void main(String[] args) {
		String frase = "Este é somente um exemplo!";
		
		String [] arr = frase.split("m");
		int  [] inteiros = {1,2,3,4,5,6,7};
		
		for(String str: arr)
		{
			System.out.println(str);
		}
		for(int itn: inteiros) 
		{
			System.out.println(itn);
		}
	}

}
