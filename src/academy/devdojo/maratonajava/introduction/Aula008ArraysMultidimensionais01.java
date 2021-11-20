package academy.devdojo.maratonajava.introduction;

public class Aula008ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5 Meses
        //31,28,31,30 Dias
        int[][] dias = new int[2][2];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[1][0] = 31;
        dias[1][1] = 30;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
