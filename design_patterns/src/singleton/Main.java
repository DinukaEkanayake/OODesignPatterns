package singleton;


public class Main {

    public static void main(String[] args) {

        ClipBoard c1=ClipBoard.getInstance();
        ClipBoard c2=ClipBoard.getInstance();

        c1.copy("A");
        c2.copy("B");
        System.out.println(c1.paste());
        System.out.println(c2.paste());

        c1.copy("C");
        System.out.println(c1.paste());
        System.out.println(c2.paste());

        ClipBoard c3=ClipBoard.getInstance();
        c3.copy("D");
        System.out.println(c1.paste());
        System.out.println(c2.paste());
        System.out.println(c3.paste());

    }
}
