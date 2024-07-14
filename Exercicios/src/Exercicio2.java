import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Random rand = new Random();

        int valor = rand.nextInt(100) + 1124;
        int valor2 = rand.nextInt(10);

        String numero = valor + "-" + valor2;

        System.out.println(numero);

		
	}

}
