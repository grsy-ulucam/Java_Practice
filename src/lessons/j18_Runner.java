package lessons;

public class j18_Runner {


    //TRICK :) Object’lerin gerektiğinde şekilden şekile girip farklı bir object gibi davranabilmesine Polymorphism denir.

    public static void main(String[] args) {

        j15_Plant plant = new j15_Plant();

        plant.allPlant();

        System.out.println("plant.name = " + plant.name);

        j16_Banana banana = new j16_Banana();

        banana.allPlant();

        banana.name = "banana";

        System.out.println("banana.name = " + banana.name);

        j17_Apple apple = new j17_Apple();

        apple.allPlant();

        apple.name = "apple";

        System.out.println("apple.name = " + apple.name);

        j15_Plant obje=new j16_Banana();

        System.out.println("obje.name = " + obje.name);

        obje.name="melon";

        System.out.println("obje.name = " + obje.name);


    }

}
