public abstract class SeguroResidencial implements Segurado {

    private int tamanho;

    public SeguroResidencial(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Seguro Residencial: ";
    }
}