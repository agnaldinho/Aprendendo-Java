import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int resposta = 0;
                int quantidaMedicos = 0;
                ArrayList<Medico> medicos = new ArrayList<>();
                String nome;
                String crm;
                String especialidade;
                Medico medico = new Medico();


                System.out.println("Quantos m�dicos deseja cadastrar?");
                quantidaMedicos = scan.nextInt();


                System.out.println("Cadastro de M�dico");
                for (int i = 1; i <= quantidaMedicos; i++) {

                        System.out.println("Deseja fazer o cadastro de m�dicos simplificado?\n" +
                                "[1] Sim [2] N�o");
                        resposta = scan.nextInt();

                        if (resposta == 1) {
                                System.out.println("Informe o nome do " + i + " m�dico:");
                                nome = scan.next();

                                medico.Setnome(nome);

                                medicos.add(medico);
                        } else if (resposta == 2) {
                                System.out.println("Informe o nome do " + i + " m�dico:");
                                nome = scan.next();

                                System.out.println("Informe o CRM do " + i + " m�dico:");
                                crm = scan.next();

                                System.out.println("Informe a especialidade do " + i + " m�dico:");
                                especialidade = scan.next();

                                medico.criarMedico(nome, crm, especialidade);

                                medicos.add(medico);

                        }

                }
                System.out.println("REALIZA��O DE AGENDAMENTOS");

                System.out.println("Escolha um m�dico");

                for(int u = 0 ; u < quantidaMedicos; u++)
                {
                        System.out.println("Digite "+u+" para " + medico.getnome());
                }

                int escolhaMedico = scan.nextInt();

                System.out.println("Digite a especialidade:");
                String especialidade1 = scan.next();

                System.out.println("Digite o dia: ");
                int dia = scan.nextInt();

                System.out.println("Digite o mes:" );
                int mes = scan.nextInt();

                Agendamento agendamento = new Agendamento(medico,dia,mes);

                System.out.println(agendamento.relatorio());

        }
}