public class Apartamento extends SeguroResidencial {

    private int andares;

    public Apartamento(int tamanho, int andares) {
        super(tamanho);
        this.andares = andares;
    }

    @Override
    public double getPremio() {
        if (andares < 4) {
            return getTamanho() * 3f;
        }
        return getTamanho() * 4f;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("Apartamento em predio com %d andares | Tamnanho: %dM² | Premio: R$%.2f", andares,
                        getTamanho(), getPremio());
    }
}
