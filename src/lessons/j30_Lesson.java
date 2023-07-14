package lessons;

public interface j30_Lesson  {

   int hours=6;
   String name="lesson";
   String teacher="Mary";
   public default  String getName(){
     return "I like study";
   }
   public  static void getNot(int not1,int not2){
       System.out.println(not1+not2);
   }

}
