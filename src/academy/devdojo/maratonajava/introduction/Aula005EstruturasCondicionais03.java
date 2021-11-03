package academy.devdojo.maratonajava.introduction;

public class Aula005EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String msgDoar = "Doar";
        String msgNaoDoar = "Não doar";

        // (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? msgDoar : msgNaoDoar;

        if (salario > 5000) {
            resultado = msgDoar;
        } else {
            resultado = msgNaoDoar;
        }

        System.out.println(resultado);
    }
}
