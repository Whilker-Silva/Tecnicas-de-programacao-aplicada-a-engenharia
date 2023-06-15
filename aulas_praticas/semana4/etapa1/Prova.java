package semana4.etapa1;

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

        System.out.println(questao.getEnunciado());
        System.out.print("Informe sua resposta: ");
        resposta = entrada.nextInt();

        if(questao.verificaResposta(resposta)){
            System.out.println("Muito bem, você acertou!");
        }

        else{
            System.out.println("Infelizmente você errou!");
        }

        entrada.close();
    }

}
