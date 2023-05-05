package Aulas_Praticas.Semana_3.Ex_01;

public class Aluno {

    // ######################################ATRIBUTOS################################################

    private String nome;
    private String categoria;
    private int[] notas;

    // Atributos de contagem
    private int contNotas;

    // #######################################CONSTRUTOR################################################

    public Aluno(String nome, String categoria, int qtdDisciplinas) {
        this.nome = nome;
        this.categoria = categoria;
        notas = new int[qtdDisciplinas];
    }

    // #######################################METODOS################################################

    public String getNome() {
        return nome;
    }

    public void inserirNotas(int nota) {
        notas[contNotas] = nota;
        contNotas++;
    }

    public double coefiente() {
        double somatoria = 0;
        for (int i = 0; i < notas.length; i++) {
            somatoria += notas[i];
        }
        return somatoria / notas.length;
    }

    public String situacao(double coefiente) {

        if (categoria.equals("bolsista")) {
            if (coefiente < 75) {
                return "desligado";
            } else {
                return "regular";
            }
        }

        else {
            if (coefiente < 70) {
                return "desligado";
            } else {
                return "regular";
            }
        }
    }

}
