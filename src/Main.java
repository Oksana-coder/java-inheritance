import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog bruno = new Dog("Bruno");
        Cat dixi = new Cat("Dixi");

        bruno.bark();
        dixi.meow();

        ArrayList<Animal> myPets = new ArrayList<>();
        myPets.add(bruno);
        myPets.add(dixi);

        for (Animal myPet : myPets) {
            myPet.eat();
        }
    }
}
