package semana2.ex01;

public class Principal {

    public static void main(String[] args) {

        Horario[] hora = new Horario[4];

        hora[0] = new Horario(10, 15, 43);
        hora[1] = new Horario(3690);
        hora[2] = new Horario(3521);
        hora[3] = new Horario(59);

        for(int i = 0; i < hora.length; i++){
            hora[i].exibir();
        }
    }

}
