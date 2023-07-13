package semana13.aula1;

public class SalarioRJ extends Salario {

    public SalarioRJ(double salarioBruto) {
        super();
    }

    @Override
    protected double calcularVT(double salarioBruto) {
        return salarioBruto * 0.08;
    }

    @Override
    protected double calcularPS(double salarioBruto) {
        return salarioBruto * 0.05;
    }

}
