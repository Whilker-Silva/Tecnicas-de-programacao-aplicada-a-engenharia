package semana3.ex01;

public class Aluno {

    private String nome;
    private String categoria;
    private int[] notas;

    private int contNotas = 0;

    /**
     * @param nome
     * @param categoria
     * @param qtdDisciplinas
     */
    public Aluno(String nome, String categoria, int qtdDisciplinas) {
        this.nome = nome;
        this.categoria = categoria;
        notas = new int[qtdDisciplinas];
    }

    public String getNome() {
        return nome;
    }

    /**
     * @return a media das notas obtidas pelo aluno
     */
    public double getCoefiente() {

        double somatoria = 0;
        for (int x : notas) {
            somatoria += x;
        }

        return somatoria / notas.length;
    }

    /**
     * @return se o aluno foi aprovado ou não
     */
    public String getSituacao() {

        if (categoria.equals("bolsista")) {
            if (getCoefiente() < 75) {
                return "desligado";
            }
            return "regular";
        }

        else {
            if (getCoefiente() < 70) {
                return "desligado";
            }
            return "regular";
        }
    }

    public void inserirNotas(int nota) {
        notas[contNotas] = nota;
        contNotas++;
    }
}
