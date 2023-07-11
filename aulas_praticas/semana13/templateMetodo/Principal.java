package semana13.templateMetodo;

public class Principal {

    public static void main(String[] args) {
        double SALARIO_BRUTO = 3000;
        Salario salarioMG = new SalarioMG(SALARIO_BRUTO);
        Salario salarioRJ = new SalarioRJ(SALARIO_BRUTO);

        System.out.printf("Salario em MG: R$%.2f\n",salarioMG.calularSalario(SALARIO_BRUTO));
        System.out.printf("Salario em SP: R$%.2f\n",salarioRJ.calularSalario(SALARIO_BRUTO));
    }
}
