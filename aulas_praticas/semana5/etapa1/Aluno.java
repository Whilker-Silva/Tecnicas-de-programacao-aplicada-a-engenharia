package etapa1;

public class Aluno {

    // Atibutos
    private String nome;
    private int nota;
    private int faltas;

    // Cosntrutor
    public Aluno(String nome, int nota, int faltas) {
        this.nome = nome;
        this.nota = nota;
        this.faltas = faltas;
    }

    ////////////// Metodos/////////////////////

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public int getFaltas() {
        return faltas;
    }

    public String getSituacao() {
        return (nota >= 60 && faltas < 19) ? "Aprovado" : "Reprovado";
    }
}
