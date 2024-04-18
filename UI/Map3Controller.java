package UI;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import Backend.*;

public class Map3Controller {

    @FXML
    private Arc player1;

    @FXML
    private Text player1Text;

    @FXML
    private Arc player2;

    @FXML
    private Text player2Text;

    @FXML
    private Arc player3;

    @FXML
    private Text player3Text;

    @FXML
    private Arc player4;

    @FXML
    private Text player4Text;

    @FXML
    private ImageView horse1;

    @FXML
    private ImageView horse2;

    @FXML
    private ImageView horse3;

    @FXML
    private ImageView horse4;

    @FXML
    private Rectangle number1;

    @FXML
    private Rectangle number2;
    
    @FXML
    private Rectangle number3;

    @FXML
    private Rectangle number4;

    @FXML
    private Rectangle number5;

    @FXML
    private Rectangle number6;

    @FXML
    private Rectangle number7;

    @FXML
    private Rectangle number8;

    @FXML
    private Rectangle number9;

    @FXML
    private Rectangle number10;

    @FXML
    private Rectangle number11;

    @FXML
    private Rectangle number12;

    @FXML
    private Rectangle number13;

    @FXML
    private Rectangle number14;

    @FXML
    private Rectangle number15;

    @FXML
    private Rectangle number16;

    @FXML
    private Rectangle number17;

    @FXML
    private Rectangle number18;

    @FXML
    private Rectangle number19;

    @FXML
    private Rectangle number20;

    @FXML
    private Rectangle number21;

    @FXML
    private Rectangle number22;
    
    @FXML
    private Rectangle number23;

    @FXML
    private Rectangle number24;

    @FXML
    private Rectangle number25;

    @FXML
    private Rectangle number26;

    @FXML
    private Rectangle number27;

    @FXML
    private Rectangle number28;

    @FXML
    private Rectangle number29;

    @FXML
    private Rectangle number30;

    @FXML
    private Rectangle number31;

    @FXML
    private Rectangle number32;

    @FXML
    private Rectangle number33;

    @FXML
    private Rectangle number34;

    @FXML
    private Rectangle number35;

    @FXML
    private Rectangle number36;

    @FXML
    private Rectangle number37;

    @FXML
    private Rectangle number38;

    @FXML
    private Rectangle number39;
    
    @FXML
    private Rectangle number40;


    public static Rectangle[] rectangles;
    public static ImageView[] imageViews;
    public static Arc[] arcs;
    public static Text[] texts;
    public static Player[] players;

    @FXML
    public void initialize() {
        imageViews = new ImageView[]{
            horse1, horse2, horse3, horse4
        };
        arcs = new Arc[]{
            player1, player2 ,player3, player4
        };

        texts = new Text[]{
            player1Text, player2Text, player3Text, player4Text
        };
        rectangles = new Rectangle[]{
            number1, number2, number3, number4, number5, 
            number6, number7, number8, number9, number10, 
            number11, number12, number13, number14, number15, 
            number16, number17, number18, number19, number20, 
            number21, number22, number23, number24, number25, 
            number26, number27, number28, number29, number30, 
            number31, number32, number33, number34, number35, 
            number36, number37, number38, number39, number40
        };
        players = new Player[]{
            new Player(1), new Player(2), 
            new Player(3), new Player(4)
        };
    }

    Shagai shagai = new Shagai();
    

    @FXML
    public static void addImage(int i){
        for(int j = 1; j <= i; j++){
            String name = "file:///Users/yujin/Desktop/Horse_Run/src/UI/pics/horse" + j + ".png";
            Image image2 = new Image(name);
            imageViews[j-1].setImage(image2);
            int num = j - 1;
            double newX, newY;
            switch (num) {
                case 0:
                    newX = rectangles[0].getLayoutX(); 
                    newY = rectangles[0].getLayoutY(); 
            
                    imageViews[num].setLayoutX(newX);
                    imageViews[num].setLayoutY(newY);
                    break;
                case 1:
                    newX = rectangles[0].getLayoutX(); 
                    newY = rectangles[0].getLayoutY() + 40; 
            
                    imageViews[num].setLayoutX(newX);
                    imageViews[num].setLayoutY(newY);
                    break;
                case 2:
                    newX = rectangles[0].getLayoutX() + 50; 
                    newY = rectangles[0].getLayoutY(); 
            
                    imageViews[num].setLayoutX(newX);
                    imageViews[num].setLayoutY(newY);
                    break;
                case 3:
                    newX = rectangles[0].getLayoutX() + 50; 
                    newY = rectangles[0].getLayoutY() + 40; 
            
                    imageViews[num].setLayoutX(newX);
                    imageViews[num].setLayoutY(newY);
                    break;
                default:
                    break;
            }
            arcs[j-1].setFill(Color.DODGERBLUE);
            arcs[j-1].setOpacity(1);
            arcs[j-1].setUserData(j-1);
            texts[j-1].setFill(Color.BLACK);
            texts[j-1].setOpacity(1);
            texts[j-1].setUserData(j-1);
        }
    }

    @FXML
    private void moveImage(MouseEvent event) {
        Object source = event.getSource();
        Integer num;
        Node node = (Node) source;
        
        num = (Integer) node.getUserData();

        shagai.rollShagai();

        players[num].changePosition(shagai.getShagaiShape());

        double newX;
        double newY;
        switch (num) {
            case 0:
                newX = rectangles[players[num].getPosition()].getLayoutX(); 
                newY = rectangles[players[num].getPosition()].getLayoutY(); 
        
                imageViews[num].setLayoutX(newX);
                imageViews[num].setLayoutY(newY);
                break;
            case 1:
                newX = rectangles[players[num].getPosition()].getLayoutX(); 
                newY = rectangles[players[num].getPosition()].getLayoutY() + 40; 
        
                imageViews[num].setLayoutX(newX);
                imageViews[num].setLayoutY(newY);
                break;
            case 2:
                newX = rectangles[players[num].getPosition()].getLayoutX() + 50; 
                newY = rectangles[players[num].getPosition()].getLayoutY(); 
        
                imageViews[num].setLayoutX(newX);
                imageViews[num].setLayoutY(newY);
                break;
            case 3:
                newX = rectangles[players[num].getPosition()].getLayoutX() + 50; 
                newY = rectangles[players[num].getPosition()].getLayoutY() + 40; 
        
                imageViews[num].setLayoutX(newX);
                imageViews[num].setLayoutY(newY);
                break;
            default:
                break;
        }

        // if(players[num].getPosition )
        
    }
}
