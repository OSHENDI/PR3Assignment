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

public class LoginPage extends Stage {

   private Scene LoginScene;

    public LoginPage() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginUI.fxml"));
        Parent parent = loader.load();
        LoginScene = new Scene(parent);
        this.setScene(LoginScene);
        this.setTitle("Login Page");
        this.setResizable(false);
    }

}
