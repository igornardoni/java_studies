public class Condicional {
    public static void main(String[] args) {
        int anoFilme = 2000;
        double notaDoFilme = 8.1;
        boolean incluidoNoPlano = false;
        String tipoPlano = "Normal";

        if (anoFilme >= 2022) {
            System.out.println("Lançamento!!!");
        } else {
            System.out.println("Filme retrô");
        }

        // Condicional com operadores lógicos ||, &&
        if (incluidoNoPlano == true && tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Filme não incluido para este plano especifico");
        }
    }
}
