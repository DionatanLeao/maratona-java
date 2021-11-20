package academy.devdojo.maratonajava.introduction;

public class Aula007Arrays03 {
    public static void main(String[] args) {
        int[] numeros1 = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        System.out.println("-------------- Foreach -----------------");

        for(int num : numeros3) {
            System.out.println(num);
        }
    }
}
