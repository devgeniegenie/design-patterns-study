package designpatterns.creational_patterns.singleton;

public class Settings {

    private static volatile Settings instance;

    private Settings() {

    }

    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }

    /**
     * 1. synchronized
     * 2. 이른 초기화
     * 3. double checked locking
     */
}