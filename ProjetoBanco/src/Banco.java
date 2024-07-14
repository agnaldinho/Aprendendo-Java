import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Conta conta = new Conta();
        ArrayList<Conta> contaBancaria = new ArrayList<>();
        String vet_contas[] = new String[10];


        int continuar =0;


            System.out.println("Já, possui uma conta no nosso banco?");
            System.out.println("[1] Sim " + "[2] Não ");
            int option = scan.nextInt();
        do{
            while (option < 1 || option > 2) {
                System.out.println("Digite o nÃºmero valido!!");
                System.out.println("Ja, possui uma conta no nosso banco?");
                System.out.println("[1] Sim " + "[2] Não ");
                option = scan.nextInt();
            }

            if (option == 1) {
                // Entrar na conta do usuario

            } else if (option == 2) {
                // Criando a conta do cliente
                for (int i = 0; i < 50; ++i) System.out.println();
                System.out.println("Cadastro de novo cliente");
                System.out.println("Primeiramente nos informe o seu nome completo: ");
                scan.nextLine();
                String nome = scan.nextLine();
                String apelido[] = nome.trim().split(" ");

                System.out.println(" Digite seu CPF: ");
                BigInteger CPF = scan.nextBigInteger();

                System.out.println("Digite seu salario: ");
                double salario = scan.nextDouble();

                for (int i = 0; i < 50; ++i) System.out.println();

                System.out.printf("Muito bom %s, seu cadastro como cliente foi realizado com sucesso!", apelido[0]);
                System.out.printf("\n\nCADASTRO DE ENDEREÇO!");

                System.out.println("Digite seu CEP:");
                String CEP = scan.next();

                System.out.println("Numero:");
                int numero = scan.nextInt();

                System.out.println("Endereço:");
                scan.nextLine();
                String endereco = scan.nextLine();

                System.out.println("Estado:");
                String estado = scan.nextLine();

                System.out.println("Cidade:");
                String cidade = scan.nextLine();

                System.out.println("Bairro:");
                String bairro = scan.nextLine();

                for (int i = 0; i < 50; ++i) System.out.println();

                System.out.println("Cadastro realizado com sucesso! Que tipo de conta deseja criar?");
                System.out.println("[1] = Conta Corrente [2] = Conta Poupança");
                int tipo = scan.nextInt();

                while (tipo < 1 || tipo > 2) {
                    System.out.println("Erro! Digite 1 ou 2 para escolher a opção correta.");
                    tipo = scan.nextInt();
                }

                System.out.println("Digite uma senha de 06 digitos: ");
                String senha = scan.next();

                while (senha.length() != 6) {
                    System.out.println("ERRO! Digite uma senha de 06 digitos: ");
                    senha = scan.next();
                }


                //Gerando nÃºmero aleatorio da conta.
                Random rand = new Random();
                int valor = rand.nextInt(100) + 1124;
                int valor2 = rand.nextInt(10);
                String numeroConta = valor + "-" + valor2;


                conta.DadosCliente(nome, CPF, salario);
                conta.DadosEndereco(CEP, numero, endereco, cidade, estado, bairro);
                conta.CriarConta(numeroConta, tipo, senha);

                contaBancaria.add(conta);


            }

            System.out.println("[1] Efetuar Login");
            System.out.println("[2] Cancela");
            option = scan.nextInt();

            if (option == 1)
            {
                System.out.println("Número da conta: ");
                String contaLogin = scan.next();
                System.out.println("Senha: ");
                String senhaLogin = scan.next();

                boolean validate = conta.Login(contaLogin, senhaLogin);

                while (validate != true) {
                    System.out.println("Número da conta: ");
                    contaLogin = scan.next();
                    System.out.println("Senha: ");
                    senhaLogin = scan.next();

                    validate = conta.Login(contaLogin, senhaLogin);
                }

                for (int i = 0; i < 50; ++i) System.out.println();

                int continar = 0;
                if (validate == true)
                {

                    do {
                        System.out.println("OPÇÕES: ");
                        System.out.println("[1] Saldo \n[2] Depositar \n[3] Sacar \n[4]Cadastro ");
                        option = scan.nextInt();

                        if (option == 1) {
                            System.out.println(conta.SaldoBancario());
                        } else if (option == 2) {
                            System.out.println("Digite o valor para deposito:");
                            conta.DepositoBancario(scan.nextDouble());
                        } else if (option == 3) {
                            System.out.println("Digite o valor para saque:");
                            conta.SaqueBancario(scan.nextDouble());
                        } else if (option == 4) {
                            System.out.println(" Cadasto atual:");
                            System.out.println(conta.Cadastro());
                        }

                        System.out.println("\n[1] Continuar \n[2] Sair da Conta ");
                        continar = scan.nextInt();
                    } while (continar == 1);
                }
            }
            System.out.println("JÃ¡ possui uma conta no nosso banco?");
            System.out.println("[1] Sim " + "[2] Não ");
            option = scan.nextInt();

        }while (option == 1 || option == 2);
    }
}