package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
         */

        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        System.out.print("Digite a senha: ");
        int informeSenha = sc.nextInt();

        while (informeSenha != senha ) {
            System.out.println("Senha inválida\n");
            System.out.print("Digite novamente a senha: ");
            informeSenha = sc.nextInt();
        }
        System.out.println("Acesso permitido");
        
        sc.close();

        //Gabarito
        //https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java
    }

}
