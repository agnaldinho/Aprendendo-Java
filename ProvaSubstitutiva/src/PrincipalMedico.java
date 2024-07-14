import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PrincipalMedico {

	public static void main(String[] args) {
		int Escolhas, Escolhas2, Escolhas3;
		int Escolha;
		String Escolhas4 = "s";
		
		ArrayList<Medico> medicos = new ArrayList<>();
		ArrayList<Agendamento> agendamentos = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		Escolhas = Integer.parseInt(JOptionPane.showInputDialog("Quantos M�dicos deseja cadastrar?"));
		
		JOptionPane.showMessageDialog(null, "Cadastro de M�dicos");
		Escolhas2 = Integer.parseInt(JOptionPane.showInputDialog("fazer o cadastro de m�dicos simplificado? (1-sim, 2-n�o)"));
		
		if(Escolhas2 == 1) 
		{
			for(int i = 0; i < Escolhas; i++) 
			{
				String nome = JOptionPane.showInputDialog("Informe o nome do " + i + "� Medico: ");
				Medico medico1 = new Medico(nome);
				medicos.add(medico1);
			}

		}
		if(Escolhas2 == 2) 
		{
			for(int i = 0; i < Escolhas; i++) 
			{
				String nome = JOptionPane.showInputDialog("Informe o nome do " + i + "� M�dico: ");
				String CRM = JOptionPane.showInputDialog("Informe o CRM do " + i + "� M�dico: ");
				String matricula = JOptionPane.showInputDialog("Informe a matr�cula do " + i + "� M�dico");
				String CEP = JOptionPane.showInputDialog("Informe o CEP do " + i + "� M�dico");
				String numero = JOptionPane.showInputDialog("Informe o n�mero da casa do " + i + "� M�dico");
				
				Medico medico2 = new Medico(nome, CRM, matricula);
				medicos.add(medico2);
					
			}
		}
		
		
		System.out.println("Deseja realizar um agendamento? (s/n)");
		String EscolhaAgendamento = scan.next();
		
		while(EscolhaAgendamento.equals("s")) 
		{
			System.out.println("REALIZA��O DE AGENDAMENTOS\nEscolha um m�dico:");
			ExibirMedico(medicos);
			
			System.out.println("Digite a especialidade: ");
			String especialidade = scan.next();
			
			System.out.println("Digite o dia: ");
			String dia = scan.next();
			
			System.out.println("Digite o m�s: ");
			String mes = scan.next();
			
			Agendamento agendamento = new Agendamento(especialidade, dia, mes);
			agendamentos.add(agendamento);
			
			System.out.println("Deseja realizar um agendamento? (s/n)");
			EscolhaAgendamento = scan.next();
		}
		
		System.out.println("Agendamento realizada com sucesso!!!");
		
		for(int i = 0; i <= agendamentos.size(); i++)
		{
			try
			{
				System.out.println("Medico: " + medicos.get(i).getNome());
				System.out.println("CRM: " + medicos.get(i).getCRM());
				
				System.out.println("Especialidade: " + agendamentos.get(i).getEspecialidade()); 
				System.out.println("Data da consulta: " + agendamentos.get(i).getDia() + " / " + agendamentos.get(i).getMes() + " / 2021");
				
				System.out.println("\n\n");	
			}
			catch(Exception e)
			{

			}
				
		}
	}
	
	static void ExibirMedico(ArrayList<Medico> medicos) 
	{
		int Escolha;
		
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<medicos.size(); i++)
		{
			System.out.println(i + "� - " + medicos.get(i).getNome());
		}
			Escolha = scan.nextInt();
	}
	
}
