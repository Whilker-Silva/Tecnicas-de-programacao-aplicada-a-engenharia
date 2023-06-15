package semana1.ex02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor investido pelo Joao: ");
        double investimentoJoao = entrada.nextDouble();
        System.out.print("Entre com o valor investido pelo Pedro: ");
        double investimentoPedro = entrada.nextDouble();

        Investidor joao = new Investidor(investimentoJoao, 2.5);
        Investidor pedro = new Investidor(investimentoPedro, 0.5);

        int contadorMeses = 0;
        while (joao.getValorInvestido() < pedro.getValorInvestido()) {
            joao.renderJuros();
            pedro.renderJuros();
            contadorMeses++;
        }

        System.out.printf("Quantidade de meses necessarios: %d\n", contadorMeses);
        entrada.close();
    }
}
