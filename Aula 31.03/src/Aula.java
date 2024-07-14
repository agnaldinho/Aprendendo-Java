import javax.swing.JOptionPane;

public class Aula {

	public static void main(String[] args) {
		
//		JOptionPane.showMessageDialog(null, "Sejam Bem vindos!");
//		
//		//JOptionPane.showMessageDialog(null, "Fique esperto\nAgnaldo", "Atenção!",JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Serio mesmo?", "Duvida",JOptionPane.QUESTION_MESSAGE);
//		
//		OptionPane.PLAIN_MESSAGE
//		JOptionPane.ERROR_MESSAGE
//		JOptionPane.INFORMATION_MESSAGE
//		JOptionPane.WARNING_MESSAGE
//		JOptionPane.QUESTION_MESSAGE
		
//		int soma = 8+7;
//		
//		JOptionPane.showMessageDialog(null, "A soma é: " + soma);
		
//		String nome;
//		
//		nome = JOptionPane.showInputDialog("Qual seu nome?");
//		JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) "+nome);
		
		double num1, num2;
		
		Float.parseFloat(JOptionPane.showInputDialog("Entre com o 1º número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2º número: "));
		
		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2));
		
//		int resposta;
//		String nome;
//		nome = JOptionPane.showInputDialog("Qual seu nome?");
//		resposta = JOptionPane.showConfirmDialog(null, "O seu nome é realmente "+nome+"?");
//		
//		if(resposta == JOptionPane.YES_OPTION) 
//		{
//			JOptionPane.showMessageDialog(null,"Confirmado!\nSeja Bem-vindo "+nome+"!");
//		}
//		else 
//		{
//			JOptionPane.showMessageDialog(null, "Seu nome não é " + nome + "!");
//		}
	}

}
