package lessons;
public class j02_AccessModifier {
    public static void main(String[] args) {

        j01_AccessModifier variable=new j01_AccessModifier();

        System.out.println("variable.a = " + variable.a);

        System.out.println("variable.c = " + variable.c);

        System.out.println("variable.d = " + variable.d);

        variable.callE();

        j01_AccessModifier.callC();

        j01_AccessModifier.calla();

    }
}
