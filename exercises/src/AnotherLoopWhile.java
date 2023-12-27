// Este código já fornece uma mensagem pronta, caso o usuário escolha não inserir notas (-1)

import java.util.Scanner;

public class AnotherLoopWhile {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        System.out.println("Coloque as notas para o filme. Após, digite -1 para sair");
        nota = leitura.nextDouble();

        // Verificar se o usuário digitou -1 logo de cara
        if (nota == -1) {
            System.out.println("Nenhuma nota foi inserida.");
        } else {
            while (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++; // A cada nota inserida, o valor será incrementado

                System.out.println("Coloque as notas para o filme. Após, digite -1 para sair");
                nota = leitura.nextDouble();
            }

            double mediaFinal = mediaAvaliacao / totalDeNotas;
            System.out.printf("Média de avaliações: %.2f", mediaFinal);
        }
    }
}
