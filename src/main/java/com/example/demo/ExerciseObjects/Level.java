package com.example.demo.ExerciseObjects;

public enum Level {
    BEGINNER("Beginner"),
    INTERMEDIATE("Intermediate"),
    EXPERT("Expert"),
    UNKNOWN("");

    private String level;

    Level(String level) {
        this.level = level;
    }

    public String getLevel() {
        return this.level;
    }

    public static Level fromString(String text) {
        for (Level l : Level.values()) {
            if (l.level.equalsIgnoreCase(text)) {
                return l;
            }
        }
        return Level.UNKNOWN;
    }
}