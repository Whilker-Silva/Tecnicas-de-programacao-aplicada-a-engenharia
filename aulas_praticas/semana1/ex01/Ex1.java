package semana1.ex01;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigo;
        int qtd;
        double valorUnitario;
        double valorBruto;
        double desconto;
        double valorFinal;

        System.out.print("Entre com o codigo: ");
        codigo = entrada.nextInt();
        System.out.print("Entre com a quantidade: ");
        qtd = entrada.nextInt();

        if (codigo <= 10) {
            valorUnitario = 10.0;
        } else if (codigo <= 20) {
            valorUnitario = 15.0;
        } else if (codigo <= 30) {
            valorUnitario = 20.0;
        } else {
            valorUnitario = 30.0;
        }

        valorBruto = valorUnitario * qtd;

        if (valorBruto < 250) {
            desconto = 0.05f;
        } else if (valorBruto <= 500) {
            desconto = 0.1f;
        } else {
            desconto = 0.15f;
        }

        valorFinal = valorBruto + valorBruto * desconto;

        System.out.printf("Preco unitario: %.2f\nValor Bruto: %.2f\nValor do desconto %.2f\nPreco final: %.2f\n",
                valorUnitario, valorBruto, desconto, valorFinal);
        entrada.close();
    }
}
