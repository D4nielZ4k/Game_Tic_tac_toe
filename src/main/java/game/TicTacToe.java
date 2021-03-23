package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class TicTacToe extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/TicTacToe.FXML"));


        Pane pane = loader.load();
        Scene scene = new Scene(pane, 795, 500.0);

        stage.setTitle("Game");
        stage.setScene(scene);

        stage.show();
    }

}

