package lessons;

public class j31_LessonChemistry implements j30_Lesson{

    public String getName(){
        return "I like study chemistry";
    }
    public  static void getNot(int not1,int not2){
        System.out.println("chemistry class welcome*");
        System.out.println(not1+not2);
    }

    public static void main(String[] args) {
        j31_LessonChemistry chemistry=new j31_LessonChemistry();
        System.out.println(chemistry.getName());
        System.out.println( hours);
        System.out.println(name);
        j30_Lesson.getNot(18,22);
       j31_LessonChemistry.getNot(33,25);
        System.out.println(teacher);
    }
}
