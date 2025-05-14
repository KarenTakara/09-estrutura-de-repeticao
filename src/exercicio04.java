import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor, contador= 0, resultado;

        System.out.println("Informe um número: ");
        valor = sc.nextInt();

        while (contador <= 10) {
            resultado = valor * contador;
            System.out.println(valor + " x " + contador + " = " + resultado);
            contador = contador + 1;
        }


    }
}
