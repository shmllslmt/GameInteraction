package com.shamilla.gameinteraction;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameInteraction extends Application {

    private static final int SCENE_WIDTH = 400;
    private static final int SCENE_HEIGHT = 400;
    private static final int RECTANGLE_SIZE = 50;

    private Rectangle character;

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        // Create the character rectangle
        character = new Rectangle(RECTANGLE_SIZE, RECTANGLE_SIZE, Color.RED);
        character.setX((SCENE_WIDTH - RECTANGLE_SIZE) / 2);
        character.setY((SCENE_HEIGHT - RECTANGLE_SIZE) / 2);
        root.getChildren().add(character);

        // Register key event handlers
        root.setOnKeyPressed(event -> handleKeyPress(event.getCode()));

        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Game Interaction");
        primaryStage.show();
        character.requestFocus();
    }

    private void handleKeyPress(KeyCode keyCode) {
        switch (keyCode) {
            case W:
            case UP:
                character.setY(character.getY() - 10);
                break;
            case S:
            case DOWN:
                character.setY(character.getY() + 10);
                break;
            case A:
            case LEFT:
                character.setX(character.getX() - 10);
                break;
            case D:
            case RIGHT:
                character.setX(character.getX() + 10);
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
