package designpatterns.creational_patterns.singleton;

public class App {

    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println(settings == Settings.getInstance());
        System.out.println(settings == settings2);
    }
}
