package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe:" +
                         "\n1 para álcool" +
                         "\n2 para gasolina" +
                         "\n3 para diesel" +
                         "\n4 para finalizar");
        int tipoCombustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (tipoCombustivel > 0 && tipoCombustivel <4){
            if (tipoCombustivel == 1) {
                alcool += 1;
            } else if (tipoCombustivel == 2) {
                gasolina +=1;
            } else if (tipoCombustivel == 3) {
                diesel +=1;
            }
            tipoCombustivel = sc.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

        //Gabarito
        //https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java
    }
}
