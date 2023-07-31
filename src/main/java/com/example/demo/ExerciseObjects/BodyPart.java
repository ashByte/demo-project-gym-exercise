package com.example.demo.ExerciseObjects;

public enum BodyPart {
    ABDOMINALS("Abdominals"),
    QUADRICEPS("Quadriceps"),
    SHOULDERS("Shoulders"),
    CHEST("Chest"),
    BICEPS("Biceps"),
    UNKNOWN("");

    private String part;

    BodyPart(String part) {
        this.part = part;
    }

    public String getPart() {
        return this.part;
    }

    public static BodyPart fromString(String text) {
        for (BodyPart b : BodyPart.values()) {
            if (b.part.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return BodyPart.UNKNOWN;
    }
}