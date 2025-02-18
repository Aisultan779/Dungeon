package com.example.mud;

public class Tucket extends NPC {

    private boolean isBacon;

    public Tucket(String name, String description, String address, boolean isBacon) {
        super(name, description, address);
        this.isBacon = isBacon;
    }

    @Override
    public void describe() {
        System.out.println("Tucket: " + name);
        System.out.println("Описание: " + description);
        System.out.println("isBacon? " + isBacon);
    }

    public void reactTo(String something) {
        System.out.println("Tucket " + name + " реагирует на: " + something);
    }

    public void knock() {
        System.out.println("Tucket " + name + " стучит в дверь!");
    }

    public boolean isBacon() {
        return isBacon;
    }

    public void setBacon(boolean bacon) {
        isBacon = bacon;
    }
}
