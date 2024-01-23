package constructor;

public final class FinalClass {

    final int j = 50;

    final int m2() {
        return 30;
    }

    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        System.out.println(f.j);
        System.out.println(f.m2());
    }
}