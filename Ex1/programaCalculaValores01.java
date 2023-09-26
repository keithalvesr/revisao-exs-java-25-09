import java.util.ArrayList;
import java.util.Scanner;

public class programaCalculaValores01 {

   public static void main(String[] args) {
        ArrayList <Double> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("INSTRUÇÃO: Digite -1 quando finalizar)");
        System.out.println("Digite as notas :");

        double nota;

        while (true) {
            nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            notas.add(nota);
        }

        scanner.close();

        int quantidadeNotas = notas.size();
        double soma = 0;
        for (Double n : notas) {
            soma += n;
        }
        double media = soma / quantidadeNotas;

        System.out.println("Quantidade valores lidos: " + quantidadeNotas);
        System.out.print("Valores informados: ");
        for (Double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);

        int acimaDaMedia = 0;
        for (Double n : notas) {
            if (n > media) {
                acimaDaMedia++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);

        System.out.println ();

        System.out.println("Programa encerrado.");
    }
}

  
