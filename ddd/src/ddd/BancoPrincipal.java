package ddd;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoPrincipal {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList [] lista = new ArrayList[10];
		//lista[1] --> null 
		//então quando você tenta acessar essa primeira posição você vai obter o NullPointerException , o que você precisa fazer agora.

		lista[1] = new ArrayList();
		//Agora você poderá inserir valores na lista 1

		lista[1].add("Valor");
	
}
}
