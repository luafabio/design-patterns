package creational.singleton.src;

public class Preferences {

    //holder of the single instance for the singleton class
    private static Preferences instance = null;

    /**
     * Create a singleton instance
     *
     * Use synchronized to allow one instance when using multiple threads
     */
    private synchronized static void createInstance() {
        if (instance == null) instance = new Preferences();
    }

    /**
     * Access method to get hold of singleton instance
     *
     * @return the one singleton instance
     */
    public static Preferences getInstance() {
        if (instance == null) createInstance();
        return instance;
    }

    public void helloSingleton() {
        System.out.println("Hello i'm a singleton");
    }
}
