package com.practice.pattern.singleton;

public class Settings {
    // static inner 클래스 활용해서 싱글턴 인스턴스 생성
    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        // getInstance()가 호출될 때 SettingHolder가 로딩되고,
        // 그 때 INSTANCE가 생성된다.
        return SettingsHolder.INSTANCE;
    }
}
