/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconversionpr3;

import View.ViewManager;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class CurrencyConversionPR3 extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        ViewManager.openLoginPage();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
