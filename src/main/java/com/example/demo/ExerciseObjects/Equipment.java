package com.example.demo.ExerciseObjects;

public enum Equipment {
    BODYONLY("Body Only"),
    DUMBBELL("Dumbbell"),
    BARBELL("Barbell"),
    OTHER("Other"), //doubles as unknown
    CABLE("Cable");

    private String equipment;

    Equipment(String equipment) {
        this.equipment = equipment;
    }

    public String getEquipment() {
        return this.equipment;
    }

    public static Equipment fromString(String text) {
        for (Equipment e : Equipment.values()) {
            if (e.equipment.equalsIgnoreCase(text)) {
                return e;
            }
        }
        return Equipment.OTHER;
    }
}