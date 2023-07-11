package semana13.templateMetodo;

public abstract class Salario {

    private final double SALARIO_MINIMO = 1000;

    public double calularSalario(double salarioBruto) {
        double inss = calcularINSS(salarioBruto);
        double irpf = calcularIRPF(salarioBruto);
        double vt = calcularVT(salarioBruto);
        double ps = calcularPS(salarioBruto);
        return salarioBruto - inss - irpf - vt - ps;
    }

    private double calcularINSS(double salarioBruto) {
        if (salarioBruto == SALARIO_MINIMO) {
            return salarioBruto * 0.07;
        } else if (salarioBruto < 2 * SALARIO_MINIMO) {
            return salarioBruto * 0.1;
        } else if (salarioBruto < 3 * SALARIO_MINIMO) {
            return salarioBruto * 0.12;
        } else if (salarioBruto < 4 * SALARIO_MINIMO) {
            return salarioBruto * 0.14;
        } else {
            return salarioBruto * 0.2;
        }
    }

    private double calcularIRPF(double salarioBruto) {
        if (salarioBruto == SALARIO_MINIMO) {
            return 0;
        } else if (salarioBruto < 2 * SALARIO_MINIMO) {
            return salarioBruto * 0.075;
        } else if (salarioBruto < 3 * SALARIO_MINIMO) {
            return salarioBruto * 0.15;
        } else if (salarioBruto < 4 * SALARIO_MINIMO) {
            return salarioBruto * 0.225;
        } else {
            return salarioBruto * 0.275;
        }
    }

    protected abstract double calcularVT(double salarioBruto);

    protected abstract double calcularPS(double salarioBruto);

}
