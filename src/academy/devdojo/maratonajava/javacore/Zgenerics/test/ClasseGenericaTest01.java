package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService service = new CarroRentavelService();
        Carro carro = service.buscarCarrosDisponivel();
        System.out.println("Usando o carro por um mês...");
        service.retornarCarroAlugado(carro);
    }
}
