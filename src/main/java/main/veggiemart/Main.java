package main.veggiemart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public Main() {
    }

    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Market.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("VeggieMart App");
        Image icon = new Image("file:src/main/resources/main/veggiemart/img/Logo.png");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}