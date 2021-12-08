package academy.devdojo.maratonajava.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

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
}
