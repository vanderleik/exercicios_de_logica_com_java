package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
              |
              |
           Q2 | Q1
        ------+------
           Q3 | Q4
              |
              |
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor da coordenada X: ");
        int x = sc.nextInt();
        System.out.print("Informe o valor da coordenada Y: ");
        int y = sc.nextInt();

        while (x != 0 || y !=0){
            if (x > 0 && y > 0){
                System.out.println("Quadrante 1");
            } else if (x < 0 && y > 0){
                System.out.println("Quadrante 2");
            } else if (x < 0 && y < 0){
                System.out.println("Quadrante 3");
            } else if (x > 0 && y < 0){
                System.out.println("Quadrante 4");
            }
            System.out.print("Informe novamente o valor da coordenada X: ");
            x = sc.nextInt();
            System.out.print("Informe novamente o valor da coordenada Y: ");
            y = sc.nextInt();

        }

        sc.close();

        //Gabarito
        //https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java
    }
}
