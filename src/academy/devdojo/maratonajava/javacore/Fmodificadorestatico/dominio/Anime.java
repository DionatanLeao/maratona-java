package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] epsodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
            epsodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático 3");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int epsodio : Anime.epsodios) {
            System.out.print(epsodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public static int[] getEpsodios() {
        return epsodios;
    }
}
