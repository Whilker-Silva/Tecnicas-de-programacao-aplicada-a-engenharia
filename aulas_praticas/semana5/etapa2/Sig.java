package etapa2;

import java.util.Scanner;

public class Sig {

    // Atributos
    private Disciplina disciplina;

    // Construtor
    public Sig() {

    }

    ////////////// Metodos/////////////////////

    public void executar() {

        Scanner entrada = new Scanner(System.in);        
        int opcao = entrada.nextInt();
        
        do {

        } while (opcao != 4);

        entrada.close();
    }

}
