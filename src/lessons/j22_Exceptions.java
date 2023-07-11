package lessons;

public class j22_Exceptions {
    public static void main(String[] args) {
        String tt = "";
        String ss = null;
         try {
             System.out.println("ss.length() = " + ss.length());
         }catch (NullPointerException n){
             System.out.println(n.getMessage());
             System.out.println("ss.lenght cant run");
         }

        try {
            System.out.println("tt.length() = " + tt.length());

        } catch (NullPointerException n) {
            System.out.println("n.getMessage() = " + n.getMessage());
        }

        finally {
            System.out.println("The End");
        }
    }
}
