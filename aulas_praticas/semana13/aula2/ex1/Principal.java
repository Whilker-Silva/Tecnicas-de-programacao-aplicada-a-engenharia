package semana13.aula2.ex1;

public class Principal {
    public static void main(String[] args) {

        Sanduiche s = new SanduicheHamburguer("X-Burguer");
        s = new Hamburguer(s, 2);
        s = new Queijo(s, 2);
        s = new Tomate(s, 4);
        s = new Cebola(s, 0);

        System.out.printf("%s: R$%.2f\n", s.getNome(), s.getPreco());
    }
}
