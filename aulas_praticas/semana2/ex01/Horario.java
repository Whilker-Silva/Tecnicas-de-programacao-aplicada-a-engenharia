package semana2.ex01;

public class Horario {

    // Atributos
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Horario(int tempoSegundo) {
        hora = tempoSegundo / 3600;
        minuto = tempoSegundo % 3600 / 60;
        segundo = tempoSegundo % 3600 % 60;
    }

    public void exibir() {
        System.out.printf("%02dh:%02dm:%02ds%n", hora, minuto, segundo);
    }
}
