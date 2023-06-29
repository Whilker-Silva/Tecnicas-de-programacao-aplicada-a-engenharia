import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Segurado> listaSegurados = new ArrayList<>();

        listaSegurados.add(new SeguroVida(50, "masculino"));
        listaSegurados.add(new Casa(110, true));
        listaSegurados.add(new Apartamento(60, 3));

        for (Segurado s : listaSegurados) {
            System.out.println(s.toString());
        }
    }
}
