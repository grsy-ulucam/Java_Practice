package lessons;

public class j10_Runner {

    public static void main(String[] args) {

        j06_Animal animal=new j06_Animal();
        animal.drinkAllAnimal();
        animal.feedAllAnimal();

        j09_Mamal mamal=new j09_Mamal();
        mamal.mamalsMove();

        j07_Cat cat =new j07_Cat();
        cat.milkCat();
        cat.pleasantCat();
        cat.mamalsMove();

        j08_Dog dog=new j08_Dog();
        dog.dogEat();
        dog.dogSound();
        dog.mamalsMove();
    }
}
