package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataVelocidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculado o imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataVelocidade() {
        return dataVelocidade;
    }

    public void setDataVelocidade(String dataVelocidade) {
        this.dataVelocidade = dataVelocidade;
    }
}
