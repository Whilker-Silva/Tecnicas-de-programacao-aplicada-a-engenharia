package semana4.etapa3;

import java.util.Scanner;

public class Prova {

    private Questao[] questao;
    private Scanner entrada;

    public Prova() {
        questao = new Questao[5];
        for(int i = 0; i< questao.length; i++){
            questao[i] = new Questao();
        }
        entrada = new Scanner(System.in);
    }

    public void aplicar() {

        for (int i = 0; i < questao.length; i++) {
            int resposta;
            int oportunidades = 2;
            int tentativas = 0;
            int erro = 0;

            System.out.printf("Questão %d\n", questao[i].getIdQuestao());
            System.out.println(questao[i].getEnunciado());
            System.out.print("Informe sua resposta: ");
            resposta = entrada.nextInt();
            tentativas++;

            while (tentativas <= oportunidades) {

                if (!questao[i].verificaResposta(resposta) && tentativas < oportunidades) {
                    erro++;
                    System.out.print("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                    resposta = entrada.nextInt();
                }
                tentativas++;
            }

            if (erro == 0) {
                System.out.println("Você tentou 1 vez e acertou a questão!");
            }

            else if (questao[i].verificaResposta(resposta)) {
                System.out.printf("Você tentou %d vez e acertou a questão!\n", erro + 1);
            }

            else {
                System.out.printf("Você tentou %d vez e errou a questão!\n", erro + 1);
            }

            System.out.println();
        }

        entrada.close();
    }

}
