package controller;

import game.Game;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class TicTacToeController {
    public TicTacToeController() {
    }


    int tour = 0;
    Game game = new Game();

    @FXML
    private Button rtg1;

    @FXML
    private Button rtg2;

    @FXML
    private Button rtg3;

    @FXML
    private Button rtg4;
    @FXML
    private Button rtg5;

    @FXML
    private Button rtg6;

    @FXML
    private Button rtg7;

    @FXML
    private Button rtg8;
    @FXML
    private Button rtg9;
    @FXML
    private TextField valuePlayerOneID;

    @FXML
    private TextField valuePlayerTwoID;

    @FXML
    private Button resetScoreID;

    @FXML
    private CheckBox CheckBoxComputer;

    @FXML
    private Label topBar;


    @FXML
    void reset(ActionEvent event) {


        System.out.println(Arrays.toString(game.gameArrayList()));

        rtg1.setText("");
        rtg2.setText("");
        rtg3.setText("");
        rtg4.setText("");
        rtg5.setText("");
        rtg6.setText("");
        rtg7.setText("");
        rtg8.setText("");
        rtg9.setText("");

        resetStyle();
        topBar.setText("");
        game.setControl(0);
    }


    private void resetStyle() {
        rtg1.setStyle("-fx-background-color: #b4c8d6");
        rtg2.setStyle("-fx-background-color: #b4c8d6");
        rtg3.setStyle("-fx-background-color: #b4c8d6");
        rtg4.setStyle("-fx-background-color: #b4c8d6");
        rtg5.setStyle("-fx-background-color: #b4c8d6");
        rtg6.setStyle("-fx-background-color: #b4c8d6");
        rtg7.setStyle("-fx-background-color: #b4c8d6");
        rtg8.setStyle("-fx-background-color: #b4c8d6");
        rtg9.setStyle("-fx-background-color: #b4c8d6");

        game.listGameGenerator();
        game.setTour(0);
        game.setContinueGame(false);
    }

    public void text(int index, Button button) {
        if (game.gameArrayList()[index] == 1) {
            button.setText("O");
        } else if (game.gameArrayList()[index] == 10) {
            button.setStyle("-fx-background-color: #b4c8d6;  -fx-text-fill: #ae0101 ");
            button.setText("X");
        } else {
            button.setText("");
        }
    }


    @FXML
    void initialize() {


        EventHandler<ActionEvent> resetScore = e -> {
            resetStyle();

            game.setValuePlayerTwo(0);
            game.setValuePlayerOne(0);
            valuePlayerOneID.setText("0");
            valuePlayerTwoID.setText("0");
            topBar.setText("");
            game.setControl(0);

        };

        resetScoreID.addEventHandler(ActionEvent.ACTION, resetScore);


        EventHandler<ActionEvent> eventHandler = event -> {
            text(0, rtg1);
            text(1, rtg2);
            text(2, rtg3);
            text(3, rtg4);
            text(4, rtg5);
            text(5, rtg6);
            text(6, rtg7);
            text(7, rtg8);
            text(8, rtg9);

            if (game.getControl() == 1) {
                topBar.setText("Player One WIN");
            } else if (game.getControl() == 2) {
                topBar.setText("Player Two WIN");
            } else if (game.getControl() == 3) {
                topBar.setText("DRAW");
            }

        };

        //1 &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        EventHandler<ActionEvent> eventHandler1 = e -> {


            System.out.println(CheckBoxComputer);
            game.player(0);

            valuePlayerOneID.setText(String.valueOf(game.getValuePlayerOne()));
            valuePlayerTwoID.setText(String.valueOf(game.getValuePlayerTwo()));

            System.out.println(game.isMove());


            if (CheckBoxComputer.isSelected() && game.isMove()) {
                game.iARandom();
                game.setMove(false);
            } else {
                System.out.println(CheckBoxComputer);

            }

        };


        //2&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        EventHandler<ActionEvent> eventHandler2 = e -> {
            game.player(1);

            valuePlayerOneID.setText(String.valueOf(game.getValuePlayerOne()));
            valuePlayerTwoID.setText(String.valueOf(game.getValuePlayerTwo()));

            if (CheckBoxComputer.isSelected() && game.isMove()) {
                game.iARandom();
                game.setMove(false);
            } else {
                System.out.println(CheckBoxComputer);
            }
        };
        //3 &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        EventHandler<ActionEvent> eventHandler3 = e -> {

            game.player(2);

            valuePlayerOneID.setText(String.valueOf(game.getValuePlayerOne()));
            valuePlayerTwoID.setText(String.valueOf(game.getValuePlayerTwo()));

            if (CheckBoxComputer.isSelected() && game.isMove()) {
                game.iARandom();
                game.setMove(false);
            } else {
                System.out.println(CheckBoxComputer);
            }
        };
        //4 &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        EventHandler<ActionEvent> eventHandler4 = e -> {
            game.player(3);

            valuePlayerOneID.setText(String.valueOf(game.getValuePlayerOne()));
            valuePlayerTwoID.setText(String.valueOf(game.getValuePlayerTwo()));
            System.out.println(tour);
            System.out.println(Arrays.toString(game.gameArrayList()));

            if (CheckBoxComputer.isSelected() && game.isMove()) {
                game.iARandom();
                game.setMove(false);
            } else {
                System.out.println(CheckBoxComputer);
            }
        };
        //5 &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        EventHandler<ActionEvent> eventHandler5 = e -> {
            game.player(4);

            valuePlayerOneID.setText(String.valueOf(game.getValuePlayerOne()));
            valuePlayerTwoID.setText(String.valueOf(game.getValuePlayerTwo()));
            if (CheckBoxComputer.isSelected() && game.isMove()) {
                game.iARandom();
                game.setMove(false);
            } else {
                System.out.println(CheckBoxComputer);
            }
        };
        //6 &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        EventHandler<ActionEvent> eventHandler6 = e -> {
            game.player(5);


            valuePlayerOneID.setText(String.valueOf(game.getValuePlayerOne()));
            valuePlayerTwoID.setText(String.valueOf(game.getValuePlayerTwo()));

            if (CheckBoxComputer.isSelected() && game.isMove()) {
                game.iARandom();
                game.setMove(false);
            } else {
                System.out.println(CheckBoxComputer);
            }
        };
        //7 &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        EventHandler<ActionEvent> eventHandler7 = e -> {
            game.player(6);

            valuePlayerOneID.setText(String.valueOf(game.getValuePlayerOne()));
            valuePlayerTwoID.setText(String.valueOf(game.getValuePlayerTwo()));

            if (CheckBoxComputer.isSelected() && game.isMove()) {
                game.iARandom();
                game.setMove(false);

            } else {
                System.out.println(CheckBoxComputer);
            }
        };
        //8 &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        EventHandler<ActionEvent> eventHandler8 = e -> {
            game.player(7);

            valuePlayerOneID.setText(String.valueOf(game.getValuePlayerOne()));
            valuePlayerTwoID.setText(String.valueOf(game.getValuePlayerTwo()));

            if (CheckBoxComputer.isSelected() && game.isMove()) {
                game.iARandom();
                game.setMove(false);
            } else {
                System.out.println(CheckBoxComputer);
            }
        };

        //9 &&&&&&&&&&&&&&&&&&&&&&&&&F&&&&&&&&&&&&&&&&&&
        EventHandler<ActionEvent> eventHandler9 = e -> {
            game.player(8);

            valuePlayerOneID.setText(String.valueOf(game.getValuePlayerOne()));
            valuePlayerTwoID.setText(String.valueOf(game.getValuePlayerTwo()));

            if (CheckBoxComputer.isSelected() && game.isMove()) {
                game.iARandom();
                game.setMove(false);
            } else {
                System.out.println(CheckBoxComputer);
            }
        };


        rtg1.addEventHandler(ActionEvent.ACTION, eventHandler1);
        rtg2.addEventHandler(ActionEvent.ACTION, eventHandler2);
        rtg3.addEventHandler(ActionEvent.ACTION, eventHandler3);

        rtg4.addEventHandler(ActionEvent.ACTION, eventHandler4);
        rtg5.addEventHandler(ActionEvent.ACTION, eventHandler5);
        rtg6.addEventHandler(ActionEvent.ACTION, eventHandler6);

        rtg7.addEventHandler(ActionEvent.ACTION, eventHandler7);
        rtg8.addEventHandler(ActionEvent.ACTION, eventHandler8);
        rtg9.addEventHandler(ActionEvent.ACTION, eventHandler9);


        rtg1.addEventHandler(ActionEvent.ACTION, eventHandler);
        rtg2.addEventHandler(ActionEvent.ACTION, eventHandler);
        rtg3.addEventHandler(ActionEvent.ACTION, eventHandler);
        rtg4.addEventHandler(ActionEvent.ACTION, eventHandler);
        rtg5.addEventHandler(ActionEvent.ACTION, eventHandler);
        rtg6.addEventHandler(ActionEvent.ACTION, eventHandler);
        rtg7.addEventHandler(ActionEvent.ACTION, eventHandler);
        rtg8.addEventHandler(ActionEvent.ACTION, eventHandler);
        rtg9.addEventHandler(ActionEvent.ACTION, eventHandler);

        resetScoreID.addEventHandler(ActionEvent.ACTION, eventHandler);
    }
}
