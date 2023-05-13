import java.util.Scanner;

public class Prova {

    private Questao q1;

    public Prova() {
        q1 = new Questao();
    }

    public void aplicar() {

        Scanner entrada = new Scanner(System.in);

        int resposta;
        int erros = 0;
        int chances = 2;

        System.out.println(q1.getEnunciado());
        System.out.print("Insira sua resposta: ");
        resposta = entrada.nextInt();

        int tentativas = 1;
        while (tentativas <= chances) {

            if (!q1.getGabarito(resposta) && tentativas < chances) {
                System.out.print("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                resposta = entrada.nextInt();
                erros++;
            }

            tentativas++;
        }

        if (erros == 0) {
            System.out.println("Você tentou 1 vez e acertou a questão!");
        }

        else if (q1.getGabarito(resposta)) {
            System.out.printf("Você tentou %d vezes e acertou a questão!\n", erros + 1);
        }

        else {
            System.out.printf("Você tentou %d vezes e errou a questão!\n", erros + 1);
        }

        entrada.close();
    }
}
