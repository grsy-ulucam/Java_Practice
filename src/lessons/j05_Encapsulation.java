package lessons;

import java.time.LocalDate;
import java.util.Locale;

public class j05_Encapsulation {

    public static void main(String[] args) {

        j04_Encapsulation variable=new j04_Encapsulation();
        System.out.println("variable.getName() = " + variable.getName());
        System.out.println("variable.getSurName() = " + variable.getSurName());
        variable.setAge(12);
        System.out.println("variable.getAge() = " + variable.getAge());
        variable.setBirthday(12);
        System.out.println("variable.getBirthday() = " + variable.getBirthday());
        System.out.println("variable.setBirthdayHappy(\"12.05.200\") = " + variable.setBirthdayHappy("12.05.200"));
    }
}
