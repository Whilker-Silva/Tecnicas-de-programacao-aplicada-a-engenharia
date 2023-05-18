package etapa1;

public class Principal {
    public static void main(String[] args) {

        Disciplina disciplina = new Disciplina("GAC111");
        disciplina.adicionarAluno(new Aluno("Regina", 75, 15));
        disciplina.adicionarAluno(new Aluno("Pedro", 45, 10));
        disciplina.adicionarAluno(new Aluno("Jose", 85, 12));

        // Geração do diário
        disciplina.ordenarDiario();

        System.out.println("\nDisciplina: " + disciplina.getCodigo());
        System.out.printf("%-10s %-12s %-8s %-10s \n", "Nome", "Nota", "Faltas", "Situacao");
        for (Aluno a : disciplina.getListaAlunos()) {
            System.out.printf("%-10s %-12s %-8s %-10s %n", a.getNome(), a.getNota(),
                    a.getFaltas(), a.getSituacao());
        }
    }
}
