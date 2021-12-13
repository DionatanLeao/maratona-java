package academy.devdojo.maratonajava.javacore.JmodificadorFinal.test;

import academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio.CarroComprador;
import academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio.Comprador;

public class CarroTest02 {
    public static void main(String[] args) {
        CarroComprador carro = new CarroComprador();
        System.out.println(CarroComprador.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
