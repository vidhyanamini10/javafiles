package polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
