import java.util.Scanner;

public class Prova {

    private Questao q1;
    
    public Prova() {        
        q1 = new Questao();        
    }

    public void aplicar(){

        int resposta;

        System.out.println(q1.getEnunciado());
        System.out.print("Insira sua resposta: ");

        Scanner entrada = new Scanner(System.in);        
        resposta =  entrada.nextInt();
       

        if(q1.getGabarito(resposta)){
            System.out.println("Você tentou 1 vez e acertou a questão!");
        }
        else{
            System.out.print("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
            resposta =  entrada.nextInt();

            if(q1.getGabarito(resposta)){
                System.out.println("Você tentou 2 vezes e acertou a questão!");
            }

            else{
                System.out.println("Você tentou 2 vezes e errou a questão");                
            }
        }

        entrada.close();
    }

}
