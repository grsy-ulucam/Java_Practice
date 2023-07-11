package lessons;

public class j24_Exceptions {
    public static void main(String[] args) {
        String s="12";
        String t="12v334";
        try {
            System.out.println("s = " + s);
            System.out.println("Integer.parseInt(s) = " + Integer.parseInt(s));

        }catch (NumberFormatException n){
            System.out.println(n.getMessage());
        }
        try {
            System.out.println("Integer.parseInt(t) = " + Integer.parseInt(t));
        }catch (NumberFormatException ss){
            System.out.println("ss.getMessage() = " + ss.getMessage());
        }
         finally {
            System.out.println("the end");
        }
    }
}
