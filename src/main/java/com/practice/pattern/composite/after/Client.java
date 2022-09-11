package com.practice.pattern.composite.after;

public class Client {

    public static void main(String[] args) {

        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    // 그룹 전체와 개별 객체를 동일하게 처리할 수 있는 패턴
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
