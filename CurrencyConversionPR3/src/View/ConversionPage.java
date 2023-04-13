/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class ConversionPage extends Stage{

    private Scene ConverstionScene;
    public ConversionPage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ConversionUI.fxml"));
        Parent parent = loader.load();
        ConverstionScene = new Scene(parent);
        this.setScene(ConverstionScene);
        this.setTitle("Currency Conversion System");
        this.setResizable(false);
    }
    
    
}
