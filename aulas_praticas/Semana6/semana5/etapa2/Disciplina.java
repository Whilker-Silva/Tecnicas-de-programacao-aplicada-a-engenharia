package aulas_praticas.Semana6.semana5.etapa2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Disciplina {

    // Atributos
    private String codigo;
    private ArrayList<Aluno> listaAlunos;

    // Constrututor
    public Disciplina(String codigo) {
        this.codigo = codigo;
        listaAlunos = new ArrayList<>();
    }

    ////////////// Metodos/////////////////////

    public String getCodigo() {
        return codigo;
    }

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void ordenarDiario() {
        listaAlunos.sort(getComparador());
    }

    public List<Aluno> getListaAlunos() {
        return Collections.unmodifiableList(listaAlunos);
    }

    private Comparator<Aluno> getComparador() {

        Comparator<Aluno> comparador = new Comparator<Aluno>() {
            @Override
            public int compare(Aluno a1, Aluno a2) {
                return (a1.getNota() - a2.getNota()) * -1;
            }
        };
        return comparador;
    }
}
