package com.example.mud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room implements IGameEntity {

    private String name;
    private String description;
    private List<NPC> npcs = new ArrayList<>();
    private Map<String, Room> neighbors = new HashMap<>();

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addNPC(NPC npc) {
        npcs.add(npc);
    }

    public NPC getNPC(String name) {
        for (NPC npc : npcs) {
            if (npc.getName().equalsIgnoreCase(name)) {
                return npc;
            }
        }
        return null;
    }

    public List<NPC> getNPCs() {
        return npcs;
    }

    public void removeNPC(NPC npc) {
        npcs.remove(npc);
    }


    public void addNeighbor(String direction, Room neighbor) {
        neighbors.put(direction.toLowerCase(), neighbor);
    }

    public Room getNeighbor(String direction) {
        return neighbors.get(direction.toLowerCase());
    }

    @Override
    public void describe() {
        System.out.println("Комната: " + name);
        System.out.println("Описание: " + description);

        if (!npcs.isEmpty()) {
            System.out.println("NPC в комнате:");
            for (NPC npc : npcs) {
                System.out.println(" - " + npc.getName());
            }
        }

        if (!neighbors.isEmpty()) {
            System.out.println("Доступные направления:");
            for (String dir : neighbors.keySet()) {
                System.out.println(" - " + dir);
            }
        }
    }
}
