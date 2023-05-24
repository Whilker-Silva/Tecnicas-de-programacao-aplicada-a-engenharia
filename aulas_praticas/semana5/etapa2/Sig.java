package etapa2;

import java.util.Scanner;

public class Sig {

    // Atributos
    // private Disciplina disciplina;

    // Construtor

    ////////////// Metodos/////////////////////

    public void executar() {

        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        do {

            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();            
            // executa

        } while (opcao != 4);

        entrada.close();
    }

    private void exibirMenu() {
        LimparTerminal();
        System.out.println("### MENU ###");
        System.out.println("1. Cadastrar disciplina");
        System.out.println("2. Cadastrar dados de aluno em disciplina");
        System.out.println("3. Mostrar diario de disciplina");
        System.out.println("4. Sair");
    }



    

    private void LimparTerminal() {

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
