import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtdPalavras;
        String frase;

        System.out.print("Quantidade de palavras na frase: ");
        qtdPalavras = entrada.nextInt();
        System.out.print("Frase a ser analisada: ");
        entrada.nextLine();
        frase = entrada.nextLine();

        String[] palavras = new String[qtdPalavras];
        int pos = 0;
        boolean primeiraVez = true;

        // quebrando a frase e adiconando cada palavra no vetor palavras
        for (int i = 0; i < frase.length(); i++) {

            if (frase.substring(i, i + 1).equals(" ")) {

                pos++;
                primeiraVez = true;
            }

            else {
                if (primeiraVez) {
                    palavras[pos] = frase.substring(i, i + 1);
                    primeiraVez = false;
                }

                else {
                    palavras[pos] += frase.substring(i, i + 1);
                }
            }
        }

        

        int posMaior = 0;
        int qtdMaior = 0;

        for (int i = 0; i < qtdPalavras; i++) {

            int qtdVogais = 0;

            for (int j = 0; j < palavras[i].length(); j++) {

                String s = palavras[i].substring(j, j + 1);                 
                 
                if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                    qtdVogais++;
                }                
            }          
            
            if (qtdVogais > qtdMaior) {
                qtdMaior = qtdVogais;
                posMaior = i;              
            }            
        }

        System.out.printf("Palavra com mais vogais: %s\n", palavras[posMaior]); 
        System.out.printf("Tamanho: %d\n", qtdMaior); 
        entrada.close();

    }
}
// uma vida sem desafios nao vale a pena ser vivida
