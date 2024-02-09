package threads;

public class Singleton {

    // Private static instance of the Singleton class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {}

    // Public static method to provide the global point of access to the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

