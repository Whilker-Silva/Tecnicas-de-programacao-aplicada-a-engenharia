package etapa2;

import java.util.Scanner;

public class Sig {

    // Atributos
    private Disciplina disciplina;

    private Scanner entrada; // perguntar professor

    // CONSTRUTOR
    Sig() {
        entrada = new Scanner(System.in);
    }

    public void executar() {
        int opcao = 0;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            executarOpcao(opcao);
        } while (opcao != 4);
    }

    private void exibirMenu() {
        limparTerminal();
        System.out.println("### MENU ###");
        System.out.println("1. Cadastrar disciplina");
        System.out.println("2. Cadastrar dados de aluno em disciplina");
        System.out.println("3. Mostrar diario de disciplina");
        System.out.println("4. Sair");
        System.out.println();
    }

    private void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastarDisciplina();
                break;

            case 2:

                cadastarAluno();
                break;

            case 3:
                gerarRelatorio();
                break;
        }
    }

    private void cadastarDisciplina() {
        limparTerminal();
        System.out.print("Informe o nome código da disciplina: ");
        String nomeDisciplina = entrada.nextLine();
        disciplina = new Disciplina(nomeDisciplina);
    }

    private void cadastarAluno() {
        limparTerminal();
        System.out.print("Informe o nome do aluno: ");
        String nome = entrada.nextLine();
        System.out.print("Informe a nota do aluno: ");
        int nota = entrada.nextInt();
        System.out.print("Informe a quantidade de faltas do aluno: ");
        int faltas = entrada.nextInt();
        entrada.nextLine();
        disciplina.adicionarAluno(new Aluno(nome, nota, faltas));
    }

    private void gerarRelatorio() {
        limparTerminal();
        disciplina.ordenarDiario();
        System.out.println("\nDisciplina: " + disciplina.getCodigo());
        System.out.printf("%-10s %-12s %-8s %-10s %n", "Nome", "Nota", "Faltas", "Situacao");

        for (Aluno a : disciplina.getListaAlunos()) {
            System.out.printf("%-10s %-12s %-8s %-10s %n", a.getNome(), a.getNota(), a.getFaltas(), a.getSituacao());
        }

        System.out.printf("\n\nPressione ENTER para voltar ao menu");
        entrada.nextLine();
    }

    private void limparTerminal() {
        // Verifica se o sistema operacional é Windows
        boolean windows = System.getProperty("os.name").toLowerCase().startsWith("windows");
        try {
            if (windows) {
                // Se for Windows, utiliza o comando "cls" para limpar o terminal
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Se for outro sistema operacional, utiliza o comando "clear" para limpar o terminal
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
