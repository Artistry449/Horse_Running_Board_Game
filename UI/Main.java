package UI;
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Animate Me");
        StackPane root = new StackPane(button);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();

        // Encapsulate animation logic in a function
        Runnable animationFunction = () -> {
            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), button);
            transition.setByX(100);
            transition.setAutoReverse(true);
            transition.setCycleCount(2);
            transition.play();
        };

        // Call the animation function on button click
        button.setOnAction(event -> animationFunction.run());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
