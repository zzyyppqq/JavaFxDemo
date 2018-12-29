package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage mPrimaryStage;
    private BorderPane rootLayout = null;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.mPrimaryStage = primaryStage;
        this.mPrimaryStage.setTitle("Address App");

        initRootLayout();

        showPersonView();
    }

    private void initRootLayout() {
        try {
            rootLayout = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));

            mPrimaryStage.setScene(new Scene(rootLayout, 600, 400));
            mPrimaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showPersonView() {
        try {
            AnchorPane personView = FXMLLoader.load(getClass().getResource("fxml/personview.fxml"));
            rootLayout.setCenter(personView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getmPrimaryStage() {
        return mPrimaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
