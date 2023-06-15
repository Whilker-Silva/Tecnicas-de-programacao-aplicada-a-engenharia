package semana4.etapa3;

import java.util.Random;

public class Questao {

    private String enunciado;
    private int gabarito;
    private int idQuestao;

    private static int ultimaQuestao = 0;

    public Questao() {

        ultimaQuestao++;
        idQuestao = ultimaQuestao;

        Random numeroAleatorio = new Random();
        int num1 = numeroAleatorio.nextInt(10);
        int num2 = numeroAleatorio.nextInt(10);

        enunciado = "Quanto é " + num1 + " * " + num2;
        gabarito = num1 * num2;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public int getIdQuestao() {
        return idQuestao;
    }

    public boolean verificaResposta(int resposta) {
        if (resposta == gabarito) {
            return true;
        }
        return false;
    }
}
