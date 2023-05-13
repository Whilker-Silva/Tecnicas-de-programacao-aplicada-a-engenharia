import java.util.Random;

public class Questao {

    //atributos
    private int idQuestao;
    private String enunciado;
    private int gabarito;

    private static int contQuestao = 0;

    //construtor
    public Questao() {

        Random numeroAleatorio = new Random();
        int num1 = numeroAleatorio.nextInt(10);
        int num2 = numeroAleatorio.nextInt(10);

        enunciado = "Quanto é " + num1 + " * " + num2 + "?";
        gabarito = num1 * num2;
        
        contQuestao++;
        idQuestao = contQuestao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public int getIdQuestao(){
        return idQuestao;
    }

    public boolean getGabarito(int resposta) {
        if (resposta == gabarito) {
            return true;
        }

        else {
            return false;
        }
    }

}