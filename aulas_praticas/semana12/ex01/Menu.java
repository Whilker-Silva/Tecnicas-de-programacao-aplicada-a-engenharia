package semana12.ex01;

import java.util.Scanner;

public class Menu {

    private Veiculo veiculo;
    private Locacao locacao;
    private Scanner entrada;
    private double valorDiaria;
    private int qtdDiarias;

    private static Menu instanciaUnica;

    private Menu() {
        entrada = new Scanner(System.in);
    }

    public static Menu getInstace() {
        if (instanciaUnica == null) {
            instanciaUnica = new Menu();
        }
        return instanciaUnica;
    }

    public void executar() {
        int opcao;
        do {
            exebirMenu();
            opcao = lerOpcao();
            executarOpacao(opcao);
        } while (opcao != 4);

        entrada.close();
    }

    private void exebirMenu() {
        System.out.println("#### LOCADORA DE VEICULOS ####");
        System.out.println("1 - Gerar nota para veículo de passeio");
        System.out.println("2 - Gerar nota para veículo de carga ");
        System.out.println("3 - Gerar nota para veículo de passageiros ");
        System.out.println("4 - Sair");
        System.out.println();
    }

    private void executarOpacao(int opcao) {
        switch (opcao) {
            case 1:

                valorDiaria = lerValorDiaria();
                qtdDiarias = lerQtdDiarias();
                veiculo = new VeiculoPasseio();
                locacao = new Locacao(veiculo);

                gerarNota();

                break;

            case 2:
                valorDiaria = lerValorDiaria();
                qtdDiarias = lerQtdDiarias();
                String tipoCarroceiria = lerCarroceria();
                veiculo = new VeiculoCarga(tipoCarroceiria);
                locacao = new Locacao(veiculo);
                gerarNota();
                break;

            case 3:
                valorDiaria = lerValorDiaria();
                qtdDiarias = lerQtdDiarias();
                int capacidade = lerCapacidade();
                veiculo = new VeiculoPassageiro(capacidade);
                locacao = new Locacao(veiculo);
                gerarNota();
                break;

            case 4:
                System.out.println("SAINDO");
                break;

            default:
                System.out.println("Opcao invalida");
        }
    }

    private int lerOpcao() {
        System.out.print("Escolha uma opcao: ");
        return Integer.parseInt(entrada.nextLine());
    }

    private double lerValorDiaria() {
        System.out.print("Entre com o valor da diaria: ");
        return Double.parseDouble(entrada.nextLine());
    }

    private int lerQtdDiarias() {
        System.out.print("Entre com a quantidade de diarias: ");
        return Integer.parseInt(entrada.nextLine());
    }

    private String lerCarroceria() {
        System.out.print("Entre com o tipo de carroceria: ");
        return entrada.nextLine();
    }

    private int lerCapacidade() {
        System.out.print("Entre a quantidade de passageiros: ");
        return Integer.parseInt(entrada.nextLine());
    }

    private void gerarNota() {
        System.out.println();
        System.out.println("===================== Nota Fiscal =============================");
        System.out.printf("Valor a ser pago: R$%.2f\n", locacao.getValorAluguel(valorDiaria, qtdDiarias));
        System.out.println("===============================================================");
        System.out.println();
    }

}
