package UI;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController implements Initializable {

    
    private Stage stage;
    private Scene scene;

    @FXML
    private RadioButton easy;

    @FXML
    private RadioButton hard;

    @FXML
    private ToggleGroup map;

    @FXML
    private RadioButton normal;

    @FXML
    private Label label;

    @FXML 
    private Label player;

    @FXML
    private Button startBtn;

    @FXML
    private ChoiceBox<String> numOfPlayer;

    private String[] num = { "2", "3", "4" };

    @FXML
    int getMap(ActionEvent event) {
        if(easy.isSelected()){
            return 1;
        }
        else if(normal.isSelected()){
            return 2;
        }
        else if(hard.isSelected()){
            return 3;
        }
        else{
            return 0;
        }
    }

    @FXML
    void btnClicked(ActionEvent event) throws IOException {
        int map = getMap(event);
        int numOfPlayer = getNumOfPlayer(event);
        switch (map) {
            case 1:
                Parent root1 = FXMLLoader.load(getClass().getResource("Map1.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root1);
                stage.setScene(scene);
                Map1Controller.addImage(numOfPlayer);
                stage.show();
                break;
            case 2:
                Parent root2 = FXMLLoader.load(getClass().getResource("Map2.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root2);
                stage.setScene(scene);
                Map2Controller.addImage(numOfPlayer);
                stage.show();
                break;
            case 3:
                Parent root3 = FXMLLoader.load(getClass().getResource("Map3.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root3);
                stage.setScene(scene);
                Map3Controller.addImage(numOfPlayer);
                stage.show();
                break;
            case 0:
                Parent root4 = FXMLLoader.load(getClass().getResource("Menu.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root4);
                stage.setScene(scene);
                stage.show();
            break;
            default:
                break;
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        numOfPlayer.getItems().addAll(num);
    }

    public int getNumOfPlayer(ActionEvent event){
        String players = numOfPlayer.getValue();
        return Integer.parseInt(players);
    }
}