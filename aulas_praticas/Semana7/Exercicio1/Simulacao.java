package Semana7.Exercicio1;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Random;

public class Simulacao {

    // Atributos
    private Queue<Cliente> filaClientes;
    private ArrayList<Atendente> listaAtendentes;
    private int duracaoSimulacao;
    private int numeroAtendentes;

    // Cosntrutor
    public Simulacao(int duracaoSimulacao, int numeroAtendentes) {

        filaClientes = new LinkedList<>();
        listaAtendentes = new ArrayList<>();
        this.duracaoSimulacao = duracaoSimulacao;
        this.numeroAtendentes = numeroAtendentes;

        ciarFilaClientes();
        //ciarListaAtendentes();
    }

    // Metodos

    private void ciarFilaClientes() {

        Random tempo = new Random();
        int tc = tempo.nextInt(4);
        int da = tempo.nextInt(7)+1;

        do {
            filaClientes.add(new Cliente(tc, da));

            tc += tempo.nextInt(4);
            da = tempo.nextInt(7)+1;

        } while (tc + da <= duracaoSimulacao);

        while (!filaClientes.isEmpty()) {
            Cliente c = filaClientes.remove();
            System.out.printf("chegada: %d duração: %d\n", c.getTempoChegada(), c.getDuracaoAtendimento());
        }

    }

    private void ciarListaAtendentes() {

    }

}
