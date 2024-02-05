package streamsLambda;


interface MyDemo{
    public void display();

}
interface MyDemo2{
    public void add();
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyDemo m = () -> {System.out.println("Hello World");};

        m.display();
        MyDemo2 m2= () -> { System.out.println("3");};
        m2.add();

    }
}
