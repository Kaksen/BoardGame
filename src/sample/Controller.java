package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import javax.swing.*;

public class Controller {
    @FXML
    private Canvas background, foreground;


    private void drawSquare(Square s) {
        GraphicsContext gc = background.getGraphicsContext2D();
        gc.setFill(s.getColor());
        gc.fillRect(s.getPosX(), s.getPosy(), s.getSize(), s.getSize());
    }
}
