package semana13.templateMetodo;

public class SalarioMG extends Salario {

    public SalarioMG(double salarioBruto) {
        super();
    }

    @Override
    protected double calcularVT(double salarioBruto) {
        return salarioBruto * 0.06;
    }

    @Override
    protected double calcularPS(double salarioBruto) {
        return salarioBruto * 0.02;
    }

}
