package lk.ijse.dep12.game_event_4.controller;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class MainViewController {

    public AnchorPane root;
    public Label lbl3;
    public Label lblBackground1;
    public Label lblBackground2;

    public void initialize() {
        lblBackground2.setLayoutX(lblBackground1.getLayoutX());
        lblBackground2.setLayoutY(lblBackground1.getLayoutY() - 597);

        Platform.runLater(() -> {
            root.getScene().setOnKeyPressed(keyEvent -> {
                if (keyEvent.getCode() == KeyCode.RIGHT) {
                    lbl3.setLayoutX(lbl3.getLayoutX() + 10);
                } else if (keyEvent.getCode() == KeyCode.LEFT) {
                    lbl3.setLayoutX(lbl3.getLayoutX() - 10);
                } else if (keyEvent.getCode() == KeyCode.UP) {
                    if (lblBackground1.getLayoutY() > 597) lblBackground1.setLayoutY(0);
                    else lblBackground1.setLayoutY(lblBackground1.getLayoutY() + 10);
                    lblBackground2.setLayoutY(lblBackground1.getLayoutY() - 597);

                }
            });
        });
    }
}
