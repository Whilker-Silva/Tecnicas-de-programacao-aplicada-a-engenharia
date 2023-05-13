import java.util.Scanner;

public class Prova {

    // Atributos
    private Questao q1;

    // Contrutor
    public Prova() {
        q1 = new Questao(); // intancia obj questão
    }

    public void aplicar() {

        Scanner entrada = new Scanner(System.in);

        // variáveis locais
        int resposta;
        int erros = 0;
        int chances = 2;

        // Mostra o enunciado e solicita a 1ª resposta
        System.out.println(q1.getEnunciado());
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
            if (!q1.getGabarito(resposta) && tentativas < chances) {
                System.out.print("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                resposta = entrada.nextInt();
                erros++;
            }
            tentativas++;
        }

        // Se não teve erros
        if (erros == 0) {
            System.out.println("Você tentou 1 vez e acertou a questão!");
        }

        // Se teve erros mas acertou em uma nova chance
        else if (q1.getGabarito(resposta)) {
            System.out.printf("Você tentou %d vezes e acertou a questão!\n", erros + 1);
        }

        // Se não acertou em nenhuma chance
        else {
            System.out.printf("Você tentou %d vezes e errou a questão!\n", erros + 1);
        }

        entrada.close();
    }
}
