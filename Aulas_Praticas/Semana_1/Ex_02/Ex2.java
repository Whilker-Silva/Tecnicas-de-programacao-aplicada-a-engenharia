package Ex_02;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // Criando obejto para realizar a leitura da entrada padrão
        Scanner entrada = new Scanner(System.in);

        // Declação variáveis
        double investimentoJoao;
        double investimentoPedro;

        // Realiza a intereção com o terminal para ser informado valores investidos
        System.out.print("Entre com o valor investido pelo Joao:");
        investimentoJoao = entrada.nextDouble();
        System.out.print("Entre com o valor investido pelo Pedro:");
        investimentoPedro = entrada.nextDouble();

        
        int meses = 0; // variável para contagem de meses

        /*Enquanto valor investido por joão for menor 
        que o valor investido por pedro*/
        while (investimentoJoao < investimentoPedro) {

            investimentoJoao += investimentoJoao * 0.025;
            investimentoPedro += investimentoPedro * 0.005;
            meses++;
        }

        System.out.printf("\nQuantidade de meses necessarios: %d\n", meses);

        entrada.close();
    }
}
