package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ControllerInfo {
    @FXML
    TextArea infoArea;

    public void initialize(){
        infoArea.setEditable(false);
        infoArea.appendText("\t\t\t\tผู้จัดทำโปรแกรม\n\n");

        infoArea.appendText("  ฉมามาส คำพุฒ      5810450202\n\n" +
                            "  ศักย์ชัย ลิ้มสุขนิรันดร์  5810451063\n\n" +
                            "  ศรัทธา จารุพรโกศล  5810451055");
    }
}
