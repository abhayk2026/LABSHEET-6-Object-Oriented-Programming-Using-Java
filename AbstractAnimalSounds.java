abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    @Override
    void sound() { System.out.println("Lion roars."); }
}

class Tiger extends Animal {
    @Override
    void sound() { System.out.println("Tiger growls."); }
}

public class AbstractAnimalSounds {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}
