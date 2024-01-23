package constructor;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(CodeOnStatic.i);

        CodeOnStatic.i = 25;
        System.out.println(CodeOnStatic.m1());

    }
}