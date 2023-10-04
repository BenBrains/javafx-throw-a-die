package com.fyxren.die;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private Circle c1;

    @FXML
    private Circle c2;

    @FXML
    private Circle c3;

    @FXML
    private Circle c4;

    @FXML
    private Circle c5;

    @FXML
    private Circle c6;

    @FXML
    private Circle c7;

    @FXML
    private TextField output;

    @FXML
    protected void throwDie() {
        int die = (int) (Math.random() * 6) + 1;
        output.setText(String.valueOf(die));
        switch (die) {
            case 1 -> {
                c1.setVisible(false);
                c2.setVisible(false);
                c3.setVisible(false);
                c4.setVisible(true);
                c5.setVisible(false);
                c6.setVisible(false);
                c7.setVisible(false);
            }
            case 2 -> {
                c1.setVisible(false);
                c2.setVisible(true);
                c3.setVisible(false);
                c4.setVisible(false);
                c5.setVisible(false);
                c6.setVisible(true);
                c7.setVisible(false);
            }
            case 3 -> {
                c1.setVisible(false);
                c2.setVisible(true);
                c3.setVisible(false);
                c4.setVisible(true);
                c5.setVisible(false);
                c6.setVisible(true);
                c7.setVisible(false);
            }
            case 4 -> {
                c1.setVisible(true);
                c2.setVisible(true);
                c3.setVisible(false);
                c4.setVisible(false);
                c5.setVisible(false);
                c6.setVisible(true);
                c7.setVisible(true);
            }
            case 5 -> {
                c1.setVisible(true);
                c2.setVisible(true);
                c3.setVisible(false);
                c4.setVisible(true);
                c5.setVisible(false);
                c6.setVisible(true);
                c7.setVisible(true);
            }
            case 6 -> {
                c1.setVisible(true);
                c2.setVisible(true);
                c3.setVisible(true);
                c4.setVisible(false);
                c5.setVisible(true);
                c6.setVisible(true);
                c7.setVisible(true);
            }
        }
    }
}
