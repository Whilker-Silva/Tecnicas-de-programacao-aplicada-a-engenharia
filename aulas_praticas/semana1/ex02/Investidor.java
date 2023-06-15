package semana1.ex02;

public class Investidor {

    // Atributos
    private double valorInvestido;
    private double rentabilidade;

    // Construor
    public Investidor(double valorInvestido, double rentabilidade) {
        this.valorInvestido = valorInvestido;
        this.rentabilidade = rentabilidade / 100;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void renderJuros() {
        valorInvestido += valorInvestido * rentabilidade;
    }
}
