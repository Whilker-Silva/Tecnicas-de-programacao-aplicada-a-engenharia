public class Casa extends SeguroResidencial {

    private boolean condominio;

    public Casa(int tamanho, boolean condominio) {
        super(tamanho);
        this.condominio = condominio;
    }

    @Override
    public double getPremio() {
        if (condominio) {
            return getTamanho() * 5f;
        }
        return getTamanho() * 7f;
    }

    @Override
    public String toString() {

        String local = "";
        if (condominio) {
            local = "em condominio";
        }

        return super.toString()
                + String.format("Casa %s | Tamnanho: %dM² | Premio: R$%.2f", local, getTamanho(), getPremio());
    }
}
