public class JavaOperators {
    public static void main(String[] args) {

        // Operadores de atribuição:

        int valor =  5;  // Atribui o valor 5 à variável valor
        int valor2 =  10;
        valor2 += 15;  //Equivalente a valor = valor + 15, atribui o valor 25 à variável valor

        // Operadores aritméticos:
        //    "+" (adição)
        //    "-" (subtração)
        //    "*" (multiplicação)
        //    "/" (divisão)
        //    "%" (resto da divisão)

        int a = 10 + 5; // Atribui o valor 15 à variável a
        int b = 10 - 5; // Atribui o valor 5 à variável b
        int c = 10 * 5; // Atribui o valor 50 à variável c
        int d = 10 / 5; // Atribui o valor 2 à variável d
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)

        // Operadores relacionais:
        //     "==" (igual a)
        //    "!=" (diferente de)
        //    ">" (maior que)
        //    ">=" (maior ou igual a)
        //    "<" (menor que)
        //    "<=" (menor ou igual a)

        int a = 10; // Atribui o valor 10 à variável a
        int b = 5; // Atribui o valor 5 à variável b
        int c = 30; // Atribui o valor 30 à variável c

        boolean igual = (b == a); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (b != c); //A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
        boolean maior = (b > a); //A variável maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
        boolean menorIgual = (b <= c); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor que o valor de c.

        // Operadores lógicos:
        boolean a = true;
        boolean b = false;
        if (a && b) {
            // Este código não será executado, já que a é verdadeiro e b é falso.
        }




    }
}

