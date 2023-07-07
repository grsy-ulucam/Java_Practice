package lessons;
public class j01_AccessModifier {

        public int a = 10;
        private int b = 20;
        protected int c = 30;

        int d = 40;

        public static void main(String[] args) {

            calla();
            callb();
            callC();
        }

        protected static void calla() {

            System.out.println("ali");
        }

        private static void callb() {

            System.out.println("veli");
        }

        static void callC() {

            System.out.println("hasan");
        }

        protected void callE() {

            System.out.println("veli");
        }

}
