package UI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartContoller implements Initializable {
    private Stage stage;
    private Scene scene;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button startbutton;

    @FXML
    void startbutton(ActionEvent event) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root1);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
