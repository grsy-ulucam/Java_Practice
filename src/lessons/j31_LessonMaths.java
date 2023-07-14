package lessons;

public class j31_LessonMaths implements j30_Lesson {

    public String getName(){
        return "I like study Maths";
    }
    public  static void getNot(int not1,int not2){
        System.out.println("maths class");
        System.out.println(not1+not2);
    }

    public static void main(String[] args) {
        j31_LessonMaths maths=new j31_LessonMaths();
        System.out.println(maths.getName());
        System.out.println( hours);
        System.out.println(name);
        j30_Lesson.getNot(12,22);
        j31_LessonMaths.getNot(12,25);

    }
}
