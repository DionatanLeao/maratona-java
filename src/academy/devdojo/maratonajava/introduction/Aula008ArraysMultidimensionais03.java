package academy.devdojo.maratonajava.introduction;

public class
Aula008ArraysMultidimensionais03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = arrays;
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        for (int[] array: arrayInt) {
            System.out.println("\n-----");
            for (int integer : array) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
        String[][] arrayNomes = {{"Mario","Maria"},{"Julio","Alberto","Matheus"}};

        for (String[] arrString : arrayNomes) {
            for (String nome: arrString) {
                System.out.println(nome);
            }
        }
    }
}
