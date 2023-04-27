package Aulas_Praticas.Semana_2.Ex_01;

public class Horario {
    int hora;
    int minuto;
    int segundo;

    Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    Horario(int segundo) {

        hora = segundo / 3600;
        minuto = (segundo % 3600)/60;
        this.segundo = (segundo % 3600)%60;
    }

    void mostraHora() {
        System.out.printf("%02dh:%02dm:%02ds\n", hora, minuto, segundo);     
    }
}
