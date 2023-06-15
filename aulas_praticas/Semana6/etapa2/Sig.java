package Semana6.etapa2;

import java.util.Scanner;
import java.util.HashMap;

public class Sig {

    // Atributos
    private HashMap<String, Disciplina> disciplina;
    private Scanner entrada;

    // CONSTRUTOR
    public Sig() {
        disciplina = new HashMap<>();
        entrada = new Scanner(System.in);
    }

    public void executar() {
        int opcao = 0;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(entrada.nextLine());
            executarOpcao(opcao);
        } while (opcao != 5);
        entrada.close();
    }

    private void exibirMenu() {
        limparTerminal();
        System.out.println("### MENU ###");
        System.out.println("1. Cadastrar disciplina");
        System.out.println("2. Mostrar código das disciplinas cadastradas");
        System.out.println("3. Cadastrar dados de aluno em disciplina");
        System.out.println("4. Mostrar diario de disciplina");
        System.out.println("5. Sair");
        System.out.println();
    }

    private void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastarDisciplina();
                break;

            case 2:
                getListaDisciplinas();
                break;

            case 3:
                cadastarAluno();
                break;

            case 4:
                gerarRelatorio();
                break;

            case 5:
                break;

            default:
                System.out.println("Opção inválida!");
                voltarMenu();
        }
    }

    private void cadastarDisciplina() {

        limparTerminal();
        System.out.print("Informe o código da disciplina: ");
        String nomeDisciplina = entrada.nextLine();
        if (!veficaDisciplinasCadastrada(nomeDisciplina)) {
            disciplina.put(nomeDisciplina, new Disciplina(nomeDisciplina));
        }

        else {
            System.out.print("Disciplina já cadastrada!");
            voltarMenu();
        }
    }

    private void getListaDisciplinas() {
        limparTerminal();

        if (disciplina.size() == 0) {
            System.out.println("Nenhuma discilpina cadastrada!");
        }

        for(Disciplina x : disciplina.values() ){
            System.out.println(x.getCodigo());
        }
        voltarMenu();
    }

    private void cadastarAluno() {
        limparTerminal();

        Disciplina disciplinaProcurada = buscarDisciplina(lerCodigo());

        if (disciplinaProcurada != null) {
            disciplinaProcurada.adicionarAluno(new Aluno(lerNomeAluno(), lerNotaAluno(), lerFaltasAluno()));
        }

        else {
            System.out.print("Disciplina não encontrada!");
            voltarMenu();
        }
    }

    private void gerarRelatorio() {

        limparTerminal();
        String codigo = lerCodigo();
        Disciplina displinaRelatorio = buscarDisciplina(codigo);

        if (displinaRelatorio != null && displinaRelatorio.qtdAlunos() > 0) {
            limparTerminal();
            displinaRelatorio.ordenarDiario();
            System.out.println("\nDisciplina: " + displinaRelatorio.getCodigo());
            System.out.printf("%-10s %-12s %-8s %-10s %n", "Nome", "Nota", "Faltas", "Situacao");
            for (Aluno a : displinaRelatorio.getListaAlunos()) {
                System.out.printf("%-10s %-12s %-8s %-10s %n", a.getNome(), a.getNota(), a.getFaltas(),
                        a.getSituacao());
            }
        }

        else if (displinaRelatorio == null) {
            System.out.print("Disciplina não encontrada!");
        }

        else {
            System.out.print("Nenhum aluno cadastrado!");
        }
        voltarMenu();
    }

    private Disciplina buscarDisciplina(String nome) {
        return disciplina.get(nome);
    }

    private boolean veficaDisciplinasCadastrada(String nome) {
        return buscarDisciplina(nome) != null;
    }

    private String lerCodigo() {
        System.out.print("Informe o código da displina do aluno: ");
        return entrada.nextLine();
    }

    private String lerNomeAluno() {
        System.out.print("Informe o nome do aluno: ");
        return entrada.nextLine();
    }

    private int lerNotaAluno() {
        System.out.print("Informe a nota do aluno: ");
        return Integer.parseInt(entrada.nextLine());
    }

    private int lerFaltasAluno() {
        System.out.print("Informe a quantidade de faltas do aluno: ");
        return Integer.parseInt(entrada.nextLine());
    }

    private void voltarMenu() {
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
                // Se for outro sistema operacional, utiliza o comando "clear" para limpar o
                // terminal
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
