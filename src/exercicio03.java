import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maior=0, valor=0, contador = 1;



        while (contador <= 15) {
            System.out.println("Digite um valor:");
            valor = sc.nextInt();

            if ( contador == 1 || valor > maior) {       //(contador == 1) por que se voce colocar os 15 numeros negativos, ele vai falar que o maior eh 0
                maior = valor;
            }
            contador = contador +1;

        }
        System.out.println("seu maior número é: " +maior);


    }
}
