package lessons;

public class j04_Encapsulation {

    private  String name="Ali";
    private  String SurName="Kaçar";
    private  int age;
    private  int birthday;

    public j04_Encapsulation() {
    }

    public j04_Encapsulation(String name, String surName, int age, int birthday) {
        this.name = name;
        SurName = surName;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return SurName;
    }

    public int getAge() {
        return age;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", SurName='" + SurName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public String setBirthdayHappy(String s) {
     return s;
    }

}
