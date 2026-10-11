class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat barks."); // As requested in the lab question.
    }
}

public class AnimalCatOverride {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
    }
}
