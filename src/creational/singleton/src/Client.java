package creational.singleton.src;

public class Client {
    public static void main(String[] args) {
        Preferences.getInstance().helloSingleton();
    }
}
