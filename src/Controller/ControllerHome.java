package Controller;

import RegularExpression.REChecker;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerHome {
    @FXML
    public Label Info;
    public Button Menu1, Menu2, Menu3;
    public GridPane gridpaneBG ;


    public void initialize() {
        Info.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                FXMLLoader root = new FXMLLoader(getClass().getResource("/View/InfoView.fxml"));
                try {
                    NewStage(root, "รายชื่อสมาชิก", 388, 227);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    @FXML
    public void BtnMenu1(ActionEvent e) throws IOException {
        FXMLLoader root = new FXMLLoader(getClass().getResource("/View/Menu1.fxml"));
        NewStage(root, "Sentence Match Checker", 600, 400);
    }

    @FXML
    public void BtnMenu2(ActionEvent e) throws IOException {
        FXMLLoader root = new FXMLLoader(getClass().getResource("/View/Menu2.fxml"));
        NewStage(root, "Find Word for RE", 600, 400);
    }

    @FXML
    public void BtnMenu3(ActionEvent e) throws IOException {
        FXMLLoader root = new FXMLLoader(getClass().getResource("/View/Menu3.fxml"));
        NewStage(root, "Spit Word in Sentence for RE", 600, 400);
    }

    public void NewStage(FXMLLoader root, String title, int w, int h) throws IOException {
        Stage b = new Stage();
        b.setTitle(title);
        b.setScene(new Scene(root.load(), w, h));
        b.show();
    }


}
