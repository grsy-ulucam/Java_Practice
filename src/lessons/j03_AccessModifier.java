package lessons;

public class j03_AccessModifier {


        public static void main(String[] args) {

        j01_AccessModifier variable=new j01_AccessModifier();

        System.out.println("variable.a = " + variable.a);
        System.out.println("variable.c = " + variable.c);
        System.out.println("variable.d = " + variable.d);

        j01_AccessModifier.callC();
        j01_AccessModifier.callC();
        j01_AccessModifier.calla();

    }
}
