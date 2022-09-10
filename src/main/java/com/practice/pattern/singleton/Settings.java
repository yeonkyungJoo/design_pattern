package com.practice.pattern.singleton;

public class Settings {

    // 객체 생성 비용이 적은 경우
    // eager initialization - thread-safe
    public static final Settings INSTANCE = new Settings();

    private Settings() {}

    public static Settings getInstance() {
        return INSTANCE;
    }
/*
    private static Settings instance;

    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }*/
}
