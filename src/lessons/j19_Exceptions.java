package lessons;

public class j19_Exceptions {

    public static void main(String[] args) {

      int a =12;
      int b=0;
      try {
          int result=a/b;
      }catch (ArithmeticException e){
          System.out.println("e.getMessage() = " + e.getMessage());
          System.out.println("Data can't be zero");
      }
      finally {
          System.out.println("This method run everytime");
      }
    }
}
