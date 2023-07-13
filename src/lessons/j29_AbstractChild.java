package lessons;

public class j29_AbstractChild extends j28_AbstractFather {
    @Override
    public void getAge() {
        System.out.println("abstract method father");
    }

    @Override
    public void getHeight() {
        System.out.println("abstract method father height");
    }

    @Override
    public void getName() {
            System.out.println("abstract method parent");

    }

    @Override
    public void getWeight() {
        System.out.println("abstract weight method parent");
    }

    @Override
    public String getTitle() {
        return "Tom";
    }

    public static void main(String[] args) {

        j29_AbstractChild txx=new j29_AbstractChild();
          txx.getName();
          txx.getAge();
          txx.getWeight();
          txx.setAddress();
          System.out.println(txx.getTitle());
          txx.name="ali";
        System.out.println(txx.name);

    }
}
