package ddd;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoPrincipal {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList [] lista = new ArrayList[10];
		//lista[1] --> null 
		//ent�o quando voc� tenta acessar essa primeira posi��o voc� vai obter o NullPointerException , o que voc� precisa fazer agora.

		lista[1] = new ArrayList();
		//Agora voc� poder� inserir valores na lista 1

		lista[1].add("Valor");
	
}
}
