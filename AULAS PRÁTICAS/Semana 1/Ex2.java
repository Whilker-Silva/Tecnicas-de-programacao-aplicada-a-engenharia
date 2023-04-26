import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float investimentoJoao;
        float investimentoPedro;

        System.out.printf("Entre com o valor investido pelo Joao: ");
        investimentoJoao = entrada.nextFloat();

        System.out.printf("Entre com o valor investido pelo Pedro: ");
        investimentoPedro = entrada.nextFloat();

        int cont = 0;
        while(investimentoJoao < investimentoPedro){

            //calculo rendimento

            cont++;
        }

        System.out.printf("Quantidade de meses necessarios: %d\n", cont);

        entrada.close();
    }
}
