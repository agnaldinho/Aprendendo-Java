import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Funcionario> func = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int resposta = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos funcionarios? "));
		
		for(int i = 0; i < resposta; i++) 
		{
			String nome = JOptionPane.showInputDialog("Nome do funcionario");

			String cpf = JOptionPane.showInputDialog("CPF");
			
			Funcionario func2 = new Funcionario(nome , cpf);
			func.add(func2);
		}
		
		for(Funcionario funcionario : func) 
		{
			JOptionPane.showConfirmDialog(null,"Confirmando dados");
			JOptionPane.showMessageDialog(null, "Seu nome é: " + funcionario.getNome() + "\nSeu cpf é: " + funcionario.getCPF());
		}
		

	}

}
