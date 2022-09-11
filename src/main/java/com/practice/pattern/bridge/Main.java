package com.practice.pattern.bridge;

public class Main {

    // 추상적인 부분과 구체적인 부분을 분리하고
    // 구체적인 부분은 숨겨놓다?!
    public static void main(String[] args) {

        // 다른 skin으로 교체 가능
        Champion a = new A(new KDA());
        a.move();
        a.skillE();

        Champion b = new B(new KDA());
        b.skillQ();
    }
}
