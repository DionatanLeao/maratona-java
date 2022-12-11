package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest03 {
    private String name = "Nome";

    static class Nested {
        private String lastName = " SobreNome";
        void print() {
            System.out.println(new OuterClassesTest03().name.concat(lastName));
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
