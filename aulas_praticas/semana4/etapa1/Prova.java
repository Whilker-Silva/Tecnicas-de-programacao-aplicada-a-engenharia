import java.util.Scanner;

public class Prova {

    // Atributos
    private Questao[] q;
    private Correcao[] c;

    // Contrutor
    public Prova() {
        q = new Questao[5];
        c = new Correcao[5];
        for (int i = 0; i < 5; i++) {
            q[i] = new Questao();
        }
    }

    public void aplicar() {

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            // variáveis locais
            int resposta;
            int erros = 0;
            int chances = 2;

            // Mostra o enunciado e solicita a 1ª resposta
            System.out.printf("Questão %d: ", q[i].getIdQuestao());
            System.out.println(q[i].getEnunciado());
            System.out.print("Insira sua resposta: ");
            resposta = entrada.nextInt();

            int tentativas = 1;
            while (tentativas <= chances) {

                /*
                 * enquantos as tentativas forem menores que que as chances oferecidas
                 * verifica a respota:
                 * --se for falsa, solicita nova resposta e icrementa as variaveis erros e
                 * tentativas
                 * --se for verdadeira incrementa apenas tentativas
                 */
                if (!q[i].getGabarito(resposta) && tentativas < chances) {
                    System.out.print("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                    resposta = entrada.nextInt();
                    erros++;
                }
                tentativas++;
            }

            // Se não teve erros
            if (erros == 0) {
                c[i] = new Correcao(q[i].getIdQuestao(), "acertou", erros + 1);
            }

            // Se teve erros mas acertou em uma nova chance
            else if (q[i].getGabarito(resposta)) {
                c[i] = new Correcao(q[i].getIdQuestao(), "acertou", erros + 1);
            }

            // Se não acertou em nenhuma chance
            else {
                c[i] = new Correcao(q[i].getIdQuestao(), "errou", erros + 1);
            }
            System.out.println();
        }

        entrada.close();
    }

    public void gerarRelatorio() {

        System.out.printf("%8s %8s %20s\n", "Questão", "Situação", "Numero de Tentativas");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%4d %12s %4d\n", c[i].getQuestao(), c[i].getSituacao(), c[i].getTentativas());
        }
    }
}
