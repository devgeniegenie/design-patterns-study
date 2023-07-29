package designpatterns.creational_patterns.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {

    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    /**
     * thread safety하게 구현
     * 1. synchronized
     * 2. 이른 초기화
     * 3. double checked locking
     * 4. static inner 클래스 사용
     */
}