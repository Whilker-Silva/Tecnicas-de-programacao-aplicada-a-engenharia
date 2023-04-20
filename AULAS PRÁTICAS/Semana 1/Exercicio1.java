import java.util.Scanner;

public class Exercicio1{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigo;
        int qtd;
        float valorUnitario;
        float valorBruto;
        float desconto;
        float valorFinal;

        System.out.print("Entre com o codigo: ");
        codigo = entrada.nextInt();

        System.out.print("Entre com a quantidade: ");
        qtd = entrada.nextInt();

        if(codigo <= 10){
            valorUnitario = 10;
        }
        else if(codigo <= 20){
            valorUnitario = 15;
        }
        else if(codigo <= 30){
            valorUnitario = 20;
        }
        else{
            valorUnitario = 30;
        }

        valorBruto = valorUnitario * qtd;

        if(valorBruto < 250){
            desconto = 0.05f * valorBruto;
        }
        else if(valorBruto <= 500){
            desconto = 0.1f * valorBruto;
        }
        else{
            desconto = 0.15f * valorBruto;
        }

        valorFinal = valorBruto - desconto;

        System.out.printf("Preco unitario: %.2f\n", valorUnitario);
        System.out.printf("Valor bruto: %.2f\n", valorBruto);
        System.out.printf("Valor do desconto: %.2f\n", desconto);
        System.out.printf("Preco final: %.2f\n", valorFinal);

        entrada.close();        
    }
}
