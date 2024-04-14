package UI;

import java.net.URL;
import java.util.ResourceBundle;

// import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class MenuController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private ChoiceBox<String> numOfPlayer;

    private String[] num = { "2", "3", "4" };

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        numOfPlayer.getItems().addAll(num);
        // numOfPlayer.setOnAction(this::getNumOfPlayer);
    }

    // public void getNumOfPlayer(ActionEvent event){
    // String players = numOfPlayer.getValue();
    // label.setText(players);
    // }
}
