package semana4.etapa2;

import java.util.Random;

public class Questao {

    private String enunciado;
    private int gabarito;

    public Questao() {
        Random numeroAleatorio = new Random();
        int num1 = numeroAleatorio.nextInt(10);
        int num2 = numeroAleatorio.nextInt(10);

        enunciado = "Quanto é " + num1 + " * " + num2;
        gabarito = num1 * num2;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public boolean verificaResposta(int resposta) {
        if (resposta == gabarito) {
            return true;
        }
        return false;
    }
}
