import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        //  Criar um programa em Java que imprima no vídeo os termos da série
        //  de Fibonacci. A série eh dada por: 1 1 2 3 5 8 ...
        //  A quantidade de termos deverá ser informada pelo usuário do
        //  programa.

        Scanner sc = new Scanner(System.in);
        int termos, contador, x=1, y=1, z;

        System.out.println("Quantos termos você quer??");
        termos = sc.nextInt();

        if ( termos == 1) {
            System.out.println(x);
        }

        else if (termos == 2) {
            System.out.print(x + " " + y);
        }

        else {
            System.out.print(x + " " + y + " ");
            contador = 3;

            while ( contador <= termos) {
                z = x + y;

                System.out.print(z + " ");
                x = y;
                y = z;

                contador = contador + 1;
            }


        }






    }
}
