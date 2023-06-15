package Semana7.Exercicio1;

public class Atendente {

    private int momentoAtendimento;

    public Atendente() {

    }

    public void atenderCliente(int tempoAtendimento, int tempoSimulacao) {
        momentoAtendimento = tempoAtendimento + tempoSimulacao;
    }

    public Boolean estaDisponivel(int tempoSimulacao) {

        if(tempoSimulacao > momentoAtendimento){
            return true;
        }

        return false;
    }

}
