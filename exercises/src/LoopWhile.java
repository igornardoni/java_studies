import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Coloque as notas para o filme. Após, digite -1 para sair");
            nota = leitura.nextDouble();

            // Sem o if, o -1 também será somado
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++; // A cada nota inserida, o valor será incrementado
            }

        }

        double mediaFinal = mediaAvaliacao / totalDeNotas;
        System.out.printf("Média de avaliações: %.2f", mediaFinal);

    }
}


