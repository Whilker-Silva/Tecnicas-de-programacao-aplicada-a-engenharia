package aulas_praticas.semana3.ex_01;

//Importa biblioteca para receber valores do terminal
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // declaração de variáveis locais
        String nome;
        String categoria;
        int qtdDisciplinas;

        // instanciando objeto para entrada dos valores lidos no terminal
        Scanner entrada = new Scanner(System.in);

        // Solicita nome
        System.out.print("Digite o nome do aluno: ");
        nome = entrada.nextLine();
        // Solicita categoria
        System.out.print("Insira a categoria do aluno (bolsista/nao bolsista): ");
        categoria = entrada.nextLine();
        //solicita qdtDisciplinas
        System.out.print("Entre com a quantidade de disciplinas cursadas: ");
        qtdDisciplinas = entrada.nextInt();

        //instanciando objeto da classe Aluno
        Aluno estudante = new Aluno(nome, categoria, qtdDisciplinas);

        //solicita notas de acordo com a qtd de disciplinas informada
        for (int i = 0; i < qtdDisciplinas; i++) {
            System.out.printf("Insira a nota na disciplina %d: ", i + 1);
            estudante.inserirNotas(entrada.nextInt());
        }

        //fecha o Scanner
        entrada.close();

        //Imprime o relatório
        System.out.println();
        System.out.println("############# RELATÓRIO FINAL #############");
        System.out.printf("Nome do aluno: %s\n", estudante.getNome());
        double coeficiente = estudante.coefiente();
        System.out.printf("Coeficiente de Rendimento: %.2f\n", coeficiente);
        System.out.printf("Situação final: %s\n", estudante.situacao(coeficiente));
    }
}
