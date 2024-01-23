package polymorphism;

public class Animal {
    public void makeSound(){
        System.out.println("make some sound");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow meow");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }
}



