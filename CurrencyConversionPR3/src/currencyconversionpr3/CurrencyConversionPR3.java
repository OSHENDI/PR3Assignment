
package currencyconversionpr3;

import View.ViewManager;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;


public class CurrencyConversionPR3 extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        ViewManager.openLoginPage();

    }

   
    public static void main(String[] args) {
        launch(args);
    }

}
