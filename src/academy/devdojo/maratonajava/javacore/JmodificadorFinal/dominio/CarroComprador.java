package academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio;

public class CarroComprador {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();
    public static final double VELOCIDADE_LIMITE = 250;

    public CarroComprador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
