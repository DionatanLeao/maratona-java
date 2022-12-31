package academy.devdojo.maratonajava.javacore.ZZClambda.dominio;

public class Anime {
    private String title;
    private int epsisodes;

    public Anime(String title, int epsisodes) {
        this.title = title;
        this.epsisodes = epsisodes;
    }

    public String getTitle() {
        return title;
    }

    public int getEpsisodes() {
        return epsisodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", epsisodes=" + epsisodes +
                '}';
    }
}
