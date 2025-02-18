package com.example.mud;

public class NPC implements IGameEntity {

    protected String name;
    protected String description;
    protected String address;

    public NPC(String name, String description, String address) {
        this.name = name;
        this.description = description;
        this.address = address;
    }

    @Override
    public void describe() {
        System.out.println("NPC: " + name);
        System.out.println("Описание: " + description);
        System.out.println("Адрес: " + address);
    }

    public String getName() {
        return name;
    }
}
