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
    public Simulacao(int numeroAtendentes, int duracaoSimulacao) {

        filaClientes = new LinkedList<>();
        listaAtendentes = new ArrayList<>();
        this.duracaoSimulacao = duracaoSimulacao;
        this.numeroAtendentes = numeroAtendentes;

        criarFilaClientes();
        ciarListaAtendentes();
    }

    public void simular() {

        for (int t = 0; t < duracaoSimulacao; t++) {

            for (Atendente a : listaAtendentes) {

                if (a.estaDisponivel(t)) {
                    if (filaClientes.peek() != null) {
                        if (filaClientes.peek().getTempoChegada() < t) {
                            filaClientes.poll();
                        }
                    }
                }
            }

            System.out.println(filaClientes.size());

        }
    }

    private void criarFilaClientes() {

        Random tempo = new Random();
        int tc = tempo.nextInt(4);
        int da = tempo.nextInt(7) + 1;

        do {
            filaClientes.add(new Cliente(tc, da));

            tc += tempo.nextInt(4);
            da = tempo.nextInt(7) + 1;

        } while (tc + da < duracaoSimulacao);
    }

    private void ciarListaAtendentes() {

        for (int i = 0; i < numeroAtendentes; i++) {
            listaAtendentes.add(new Atendente());
        }
    }

}
