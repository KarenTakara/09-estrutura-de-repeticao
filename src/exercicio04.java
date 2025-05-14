import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor, contador= 0, resultado, resposta=1;

        while (resposta == 1) {

            System.out.println("Informe um número: ");
            valor = sc.nextInt();
            contador = 0;

            while (contador <= 10) {
                resultado = valor * contador;
                System.out.println(valor + " x " + contador + " = " + resultado);
                contador = contador + 1;
            }
            System.out.println("Digite 1 se quiser imprimir mais um tabuada ou " +
                    "0 para finalizar");
            resposta = sc.nextInt();
        }

    }
}
