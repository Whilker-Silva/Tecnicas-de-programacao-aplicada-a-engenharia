package semana3.ex01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        System.out.print("Insira a categoria do aluno (bolsista/nao bolsista): ");
        String categoria = entrada.nextLine();
        System.out.print("Entre com a quantidade de disciplinas cursadas: ");
        int qtdDisciplinas = entrada.nextInt();

        Aluno aluno = new Aluno(nome, categoria, qtdDisciplinas);

        for (int i = 0; i < qtdDisciplinas; i++) {
            System.out.printf("Insira a nota na disciplina %d: ", i+1);
            aluno.inserirNotas(entrada.nextInt());
        }

        System.out.println();
        System.out.printf("############# RELATÓRIO FINAL #############\n");
        System.out.printf("Nome do Aluno: %s\n", aluno.getNome());
        System.out.printf("Coeficeinte de rendimento: %.2f\n", aluno.getCoefiente());
        System.out.printf("Situação final: %s\n", aluno.getSituacao());

        entrada.close();
    }
}
