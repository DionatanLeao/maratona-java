package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Sedan";
        carro1.nome = "Monza";
        carro1.ano = 1992;

        Carro carro2 = new Carro();
        carro2.modelo = "Sedan";
        carro2.nome = "Santana";
        carro2.ano = 1994;

        carro1 = carro2;

        System.out.println("Carro 1: " + carro1.nome + " modelo: " + carro1.modelo + " ano: " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + " modelo: " + carro2.modelo + " ano: " + carro2.ano);
    }
}
