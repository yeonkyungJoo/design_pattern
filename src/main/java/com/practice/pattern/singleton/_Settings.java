package com.practice.pattern.singleton;

public class _Settings {

    private _Settings() {}

    private static volatile _Settings instance;

    public static _Settings getInstance() {
        if (instance == null) {
            synchronized (_Settings.class) {
                if (instance == null) {
                    instance = new _Settings();
                }
            }
        }
        return instance;
    }
}
