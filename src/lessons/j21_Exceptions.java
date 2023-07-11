package lessons;

public class j21_Exceptions {
    public static void main(String[] args) {

        int a = 10;
        Object t="12233";
        try {
           String ss= (String) t;
            System.out.println("ss = " + ss);
        }catch (ClassCastException e){
            e.getMessage();
            System.out.println("Goodbye");
        }
        try {
            String s= String.valueOf(a);
            System.out.println("s = " + s);
        }catch (ClassCastException e){
            e.getMessage();
            System.out.println("Welcome");
        }
       finally {
            System.out.println("Class exception");
        }


    }
}
