package lessons;

public class j14_SubClass extends j13_SuperClass{

    public void getName(){
        System.out.println("Hello");
    }

    public  void  getAge(){
        System.out.println("enter your age");
    }
    public  void  getAge(int age){
        System.out.println(age);
    }
    public  void  getAge(String name,String surname,int age){
        System.out.println(name+" " +surname+" " +age);
    }

    public static void main(String[] args) {

        j14_SubClass txx=new j14_SubClass();
        txx.getName();
        txx.getAge();
        txx.getAge(12);
        txx.getAge("Gürsoy","Uluçam",38);
    }
}
