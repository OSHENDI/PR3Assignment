package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginUIController {
    
    @FXML
    private ResourceBundle resources;
    
    @FXML
    private URL location;
    
    @FXML
    private TextField userTF;
    
    @FXML
    private TextField passTF;
    
    @FXML
    private Button LoginBtn;
    
    @FXML
    void initialize() {
        LoginBtn.setOnAction((event) -> {
            if (userTF.getText().toLowerCase().equals("user") && passTF.getText().toLowerCase().equals("userpass")) {
                View.ViewManager.closeLoginPage();
                try {
                    View.ViewManager.openConversionPage();
                } catch (IOException ex) {
                    Logger.getLogger(LoginUIController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                Alert al = new Alert(Alert.AlertType.WARNING);
                al.setHeaderText("Your login info is incorrent");
                al.setContentText("something's wrong try again!");
                
                al.showAndWait();
            }
        });
        
    }
}
