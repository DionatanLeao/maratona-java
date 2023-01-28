package academy.devdojo.maratonajava.javacore.Heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("-----------------");
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }
}
