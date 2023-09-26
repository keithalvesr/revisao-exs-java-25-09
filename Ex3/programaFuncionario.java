import java.util.ArrayList;
import java.util.Scanner;

public class programaFuncionario {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("[1] Inserir Funcionario");
            System.out.println("[2] Listar Funcionarios");
            System.out.println("[3] Aumentar salario de um Funcionario");
            System.out.println("[4] Aniversario do Funcionario");
            System.out.println("[5] Promover Funcionario");
            System.out.println("[6] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Salário: R$");
                    double salario = scanner.nextDouble();
                    Funcionario novoFuncionario = new Funcionario(id, nome, idade, salario);
                    funcionarios.add(novoFuncionario);
                    System.out.println("Funcionário inserido com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de Funcionarios:");
                    for (Funcionario funcionario : funcionarios) {
                        funcionario.mostrarDetalhes();
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do funcionário: ");
                    int idAumento = scanner.nextInt();
                    System.out.print("Digite o percentual de aumento: ");
                    double percentualAumento = scanner.nextDouble();
                    for (Funcionario funcionario : funcionarios) {
                        if (funcionario.getId() == idAumento) {
                            funcionario.aumentarSalario(percentualAumento);
                            System.out.println("Salário aumentado com sucesso!");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite o ID do funcionário: ");
                    int idAniversario = scanner.nextInt();
                    for (Funcionario funcionario : funcionarios) {
                        if (funcionario.getId() == idAniversario) {
                            funcionario.fazerAniversario();
                            System.out.println("Aniversário realizado com sucesso!");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.print("Digite o ID do funcionário: ");
                    int idPromocao = scanner.nextInt();
                    for (Funcionario funcionario : funcionarios) {
                        if (funcionario.getId() == idPromocao) {
                            funcionario.promover();
                            System.out.println("Promoção realizada com sucesso!");
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 6);

        scanner.close();
    }
}
