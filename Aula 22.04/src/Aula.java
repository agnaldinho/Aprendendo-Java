
public class Aula {

	public static void main(String[] args) {
	Professor prof = new Professor("Fabricio","Poo");
	
	
	Diretor diretor = new Diretor("Carlos", "Ensino Superior", 1000.0);
	
	prof.setSalario(5000);
	diretor.setSalario(5000);
	int meses = 10;
	
	System.out.println(prof);
	System.out.println(diretor);
	
//	System.out.println("Professor: " + prof.getNome() + " Leciona: " + prof.getDisciplina());
//	double salProfCal = prof.calcularSalario(meses);
//	double salDirCal = diretor.calcularSalario(meses);
//	
//	System.out.println("O salario do professor: " + prof.getNome() + "e " + salProfCal);
//	System.out.println("O salario do professor: " + diretor.getNome() + "e " + salDirCal);
//	System.out.println("A taxa de gremio para o professor é " + prof.taxaGremio());
//	System.out.println("A taxa de gremio para o Diretor é " + diretor.taxaGremio());
//	System.out.println("\nDiretor: " + diretor.getNome() + "\nSetor: " + diretor.getSetor() + "\nBonus: " + diretor.getBonus());
	
//		prof.setNome("Marcos");
//		prof.setSalario(5000.00);
//		prof.setMatricula(123);
//		prof.setDisciplina("Programaçao");
//		
//		System.out.println("O Professor "+ prof.getNome() + " Leciona a disciplina: " + prof.getDisciplina());
//		
//		Gestor gestor = new Gestor();
//		gestor.setNome("Carlos");
//		gestor.setSalario(5500);
//		gestor.setSetor("Ensino Superior");
//		
//		System.out.println("O gestor " + gestor.getNome() + " Trabalha no setor: "+gestor.getSetor());
//		
//		Diretor diretor = new Diretor();
//		
//		diretor.setNome("Maria");
//		diretor.setBonus(1000.00);

	}

}
