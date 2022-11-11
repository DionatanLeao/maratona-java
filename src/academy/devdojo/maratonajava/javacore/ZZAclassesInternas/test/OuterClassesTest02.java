package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest02 {

    private String  name = "Midoriya";

    void print(final String param){
        final String lastName = "Izuku";

        class LocalClass {
            private void printLocal() {
                System.out.println(param);
                System.out.println(name+" "+lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("param");
    }
}
