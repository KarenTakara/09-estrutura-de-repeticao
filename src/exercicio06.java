import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        // Escreva um programa em Java que calcule o fatorial de um número inteiro
        // e positivo. Por exemplo, fatorial do número 5 é representado por 5!
        // e seu cálculo é dado da seguinte forma: 5! = 5 * 4 * 3 * 2 * 1.
        // Por definição matemática, o fatorial de 0 é 1 e, não existe fatorial de
        // número negativo.

        Scanner sc = new Scanner(System.in);
        int numero, contador;
        double resultado=1;     //variavel que for guardar soma comeca com zero e variavel que vai multiplicar comeca com 1
                                // double para numeros maiores que um trilhao, ja que se voce colocar 21 ele vai dar errado

        System.out.println("Digite um número");
        numero = sc.nextInt();

        if ( numero == 0) {
            resultado = 1;
        }

        else if ( numero < 0) {
            System.out.println("Não existe fatorial de número negativo");
        }

        else {
            contador = 1;
            while ( contador <= numero) {
                resultado = resultado * contador;
                contador = contador + 1;
            }
        }

        System.out.println(+ resultado);


    }
}
