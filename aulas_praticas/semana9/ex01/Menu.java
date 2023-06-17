package semana9.ex01;

import java.util.Scanner;

public class Menu {

    private Agenda agenda;
    private Scanner entrada;

    public Menu() {
        agenda = new Agenda();
        entrada = new Scanner(System.in);
    }

    public void executar() {

        int opçao = 0;

        while (opçao != 5) {
            exebirMenu();
            opçao = lerOpcao();
            executarOpçao(opçao);
        }
        entrada.close();
    }

    private void exebirMenu() {
        System.out.println();
        System.out.println("=======Menu de opções=======");
        System.out.println("1 - Cadastrar uma pessoa física");
        System.out.println("2 - Cadastrar uma pessoa jurídica");
        System.out.println("3 - Remover um contato");
        System.out.println("4 - Imprimir dados da agenda");
        System.out.println("5 - Sair");
    }

    private void executarOpçao(int opcao) {

        switch (opcao) {
            case 1:
                cadastrarPF();
                break;

            case 2:
                cadastrarPJ();
                break;

            case 3:
                remover();
                break;

            case 4:
                imprimir();
                break;

            case 5:
                break;

            default:
                System.out.println("Opção invalida");

        }

    }

    private void cadastrarPF() {
        agenda.cadastrar(lerNome(), lerEndereco(), lerEmail(), lerCpf(), lerEstadoCivil());
    }

    private void cadastrarPJ() {
        agenda.cadastrar(lerNome(), lerEndereco(), lerEmail(), lerCnpj(), lerInscricaoEstadual());
    }

    private void remover() {

        System.out.print("Informe o CPF ou CNPJ do contato que dejesa remover: ");
        if (agenda.remover(entrada.nextLine())) {
            System.out.println("Contato removido com sucesso!");
        }

        else {
            System.out.println("Contato não encontrado!");
        }
    }

    private void imprimir() {
        for(Contato c : agenda.getListaContatos()){
            System.out.println(c.toString());
        }


    }

    private int lerOpcao() {
        System.out.print("Informe a opção desejada: ");
        return Integer.parseInt(entrada.nextLine());
    }

    private String lerNome() {
        System.out.print("Informe o nome do contato: ");
        return entrada.nextLine();
    }

    private String lerEndereco() {
        System.out.print("Informe o endereço: ");
        return entrada.nextLine();
    }

    private String lerEmail() {
        System.out.print("Informe o email: ");
        return entrada.nextLine();
    }

    private String lerCpf() {
        System.out.print("Informe o CPF: ");
        return entrada.nextLine();
    }

    private String lerCnpj() {
        System.out.print("Informe o CNPJ: ");
        return entrada.nextLine();
    }

    private String lerEstadoCivil() {
        System.out.print("Informe o estado civel: ");
        return entrada.nextLine();
    }

    private int lerInscricaoEstadual() {
        System.out.print("Informe a inscrição estadual: ");
        return Integer.parseInt(entrada.nextLine());
    }

}
