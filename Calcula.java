
// Classe "Calcula, onde o programa "roda"
import java.util.Scanner; //  Para recolher dados do usuário.

public class Calcula {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Historico historico = new Historico();

        int opcao = -1;
        // Menu de opçoes
        while (opcao != 0) {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Cadastrar Atleta");
            System.out.println("3 - Mostrar Histórico");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1: {

                    System.out.print("Nome: ");
                    String nome = entrada.next();

                    System.out.print("Peso: ");
                    double peso = entrada.nextDouble();

                    System.out.print("Altura: ");
                    double altura = entrada.nextDouble();

                    Pessoa pessoa = new PessoaComum(nome, peso, altura);

                    pessoa.mostrarDados();

                    double imc = pessoa.calcularIMC();

                    System.out.println("IMC: " + imc);
                    System.out.println(pessoa.classificarIMC());

                    historico.adicionar(
                            nome + " - IMC: " + imc + " - " + pessoa.classificarIMC());

                    break;
                }

                case 2: {

                    System.out.print("Nome: ");
                    String nome = entrada.next();

                    System.out.print("Peso: ");
                    double peso = entrada.nextDouble();

                    System.out.print("Altura: ");
                    double altura = entrada.nextDouble();

                    Pessoa atleta = new Atleta(nome, peso, altura);

                    atleta.mostrarDados();

                    double imc = atleta.calcularIMC();

                    System.out.println("IMC: " + imc);
                    System.out.println(atleta.classificarIMC());

                    historico.adicionar(
                            nome + " - IMC: " + imc + " - " + atleta.classificarIMC());

                    break;
                }

                case 3:

                    historico.mostrarHistorico();
                    break;

                case 0:

                    System.out.println("Programa encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        }

        entrada.close();
    }
}