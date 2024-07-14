
public class Dialogos {

	public static void main(String[] args) {
		String nome, CPF;
		double salario;
		
		nome = "Agnaldo";
		CPF = "55555555-5";
		salario = 5000;
		double bonus = 500;
		int meses = 10;
		
		Aula func = new Aula(nome, CPF, salario);
		
		System.out.println("Salario do funcionario: " + func.calcularSalario(meses));
		System.out.println("Salario do funcionario: " + func.calcularSalario(meses, bonus));

	}

}
