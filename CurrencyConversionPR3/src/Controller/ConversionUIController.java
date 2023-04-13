package Controller;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ConversionUIController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField usdField;

    @FXML
    private Button ConvertButton;

    @FXML
    private Button LogoutBtn;

    @FXML
    private TextField nisField;

    @FXML
    void initialize() {
        DecimalFormat df = new DecimalFormat("#.##");
        ConvertButton.setOnAction((event) -> {
            if (!usdField.getText().isEmpty() && nisField.getText().isEmpty()) {
                nisField.setText((Double.parseDouble(usdField.getText()) * 3.5)+"");
            } else if (usdField.getText().isEmpty() && !nisField.getText().isEmpty()) {

                usdField.setText(df.format((Double.parseDouble(nisField.getText()) / 3.5))+"");
            } else {
                Alert al = new Alert(Alert.AlertType.WARNING);
                al.setHeaderText("There must be something wrong");
                al.setContentText("Warning! the two fields can't be empty or full at the same time!");
                al.showAndWait();
            }
        });
        LogoutBtn.setOnAction((event) -> {
            View.ViewManager.closeConversionPage();
            try {
                View.ViewManager.openLoginPage();
            } catch (IOException ex) {
                Logger.getLogger(ConversionUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }
}
