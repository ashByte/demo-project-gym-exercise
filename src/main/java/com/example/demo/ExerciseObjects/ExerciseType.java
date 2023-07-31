package com.example.demo.ExerciseObjects;

public enum ExerciseType {
    STRENGTH("Strength"),
    STRETCHING("Stretching"),
    PLYOMETRICS("Plyometrics"),
    POWERLIFTING("Powerlifting"),
    CARDIO("Cardio"),
    UNKNOWN("");

    private String type;

    ExerciseType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public static ExerciseType fromString(String text) {
        for (ExerciseType e : ExerciseType.values()) {
            if (e.type.equalsIgnoreCase(text)) {
                return e;
            }
        }
        return ExerciseType.UNKNOWN;
    }
}