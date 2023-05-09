package aulas_praticas.semana2;

public class Principal {
    public static void main(String[] args) {

        Horario[] hora = new Horario[4];

        hora[0] = new Horario(10, 15, 43);
        hora[1] = new Horario(3690);
        hora[2] = new Horario(3521);
        hora[3] = new Horario(59);

        hora[0].mostraHora();
        hora[1].mostraHora();
        hora[2].mostraHora();
        hora[3].mostraHora();

    }
}
