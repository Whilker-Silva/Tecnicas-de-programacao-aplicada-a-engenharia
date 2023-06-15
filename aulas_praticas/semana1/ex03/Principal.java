package semana1.ex03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de palavras na frase: ");
        int qtdPalavras = Integer.parseInt(entrada.nextLine());
        System.out.print("Frase a ser analisada: ");
        String frase = entrada.nextLine();

        String[] palavras = frase.split(" ");

        int maisVogais = 0;
        int posMaior = 0;

        for (int i = 0; i < qtdPalavras; i++) {

            int vogais = 0;

            for (int j = 0; j < palavras[i].length(); j++) {

                String s = palavras[i].substring(j, j + 1);

                if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                    vogais++;
                }
            }

            if (vogais > maisVogais) {
                maisVogais = vogais;
                posMaior = i;
            }
        }

        System.out.printf("Palavra com mais vogais: %s%n", palavras[posMaior]);
        System.out.printf("Quantidade de vogais: %d%n", maisVogais);

        entrada.close();
    }
}
