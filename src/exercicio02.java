import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        /*
            programa para ler dois números inteiros (o segundo valor deve
            ser obrigatoriamente maior que o primeiro). O programa deve
            imprimir todos os números dentro do intervalo (inclusive os extremos).
         */


        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Informe o primeiro número inteiro");
        n1 = sc.nextInt();
        System.out.println("Informe o segundo número inteiro");
        n2 = sc.nextInt();

        if (n2 > n1) {
            while (n1 < n2) {
                System.out.println(n1 + " ");
                n1 = n1 + 1;
            }
        }
            else{
                System.out.println("o segundo valor deve ser maior que o primeiro");
        }



    }
}
