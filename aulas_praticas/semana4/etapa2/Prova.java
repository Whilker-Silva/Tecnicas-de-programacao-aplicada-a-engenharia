package semana4.etapa2;

import java.util.Scanner;

public class Prova {

    private Questao questao;
    private Scanner entrada;

    public Prova() {
        questao = new Questao();
        entrada = new Scanner(System.in);
    }

    public void aplicar() {

        int resposta;
        int oportunidades = 2;
        int tentativas = 0;
        int erro = 0;

        System.out.println(questao.getEnunciado());
        System.out.print("Informe sua resposta: ");
        resposta = entrada.nextInt();
        tentativas++;

        while (tentativas <= oportunidades) {

            if (!questao.verificaResposta(resposta) && tentativas < oportunidades) {
                erro++;
                System.out.print("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                resposta = entrada.nextInt();
            }
            tentativas++;
        }

        if (erro == 0) {
            System.out.println("Você tentou 1 vez e acertou a questão!");
        }

        else if (questao.verificaResposta(resposta)) {
            System.out.printf("Você tentou %d vez e acertou a questão!\n", erro + 1);
        }

        else {
            System.out.printf("Você tentou %d vez e errou a questão!\n", erro + 1);
        }

        entrada.close();
    }

}
