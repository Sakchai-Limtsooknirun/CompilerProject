package Controller;

import RegularExpression.REChecker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerMenu2 {

    REChecker reChecker = new REChecker();
    @FXML
    private TextArea reArea,sentenceArea ;
    @FXML
    private TextArea out;

    public void initialize(){
        out.setEditable(false);
    }
    @FXML
    public void BtnOK(ActionEvent event){
        if (!reArea.getText().isEmpty()&&!sentenceArea.getText().isEmpty())
        out.setText(reChecker.fineMatchInSentence(sentenceArea.getText(),reArea.getText()));
        reArea.clear();
        sentenceArea.clear();
    }
}
