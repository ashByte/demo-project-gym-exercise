package com.example.demo;
import com.example.demo.ExerciseObjects.*;

public class Exercise {
    String exerciseName;
    String description;
    ExerciseType exerciseType;
    BodyPart bodyPart;
    Equipment equipment;
    Level level;
    Double rating;

    public Exercise(
        String exerciseName,
        String description, 
        String exerciseType, 
        String bodyPart, 
        String equipment, 
        String level, 
        String rating) {
            this.exerciseName = exerciseName;
            this.description = description;
            this.exerciseType = ExerciseType.fromString(exerciseType);
            this.bodyPart = BodyPart.fromString(bodyPart);
            this.equipment = Equipment.fromString(equipment);
            this.level = Level.fromString(level);
            this.rating = Double.parseDouble(rating);
        }
}



