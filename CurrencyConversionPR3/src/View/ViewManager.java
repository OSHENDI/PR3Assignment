package View;

import java.io.IOException;

public class ViewManager {

    public static LoginPage LoginPage;
    public static ConversionPage conversionPage;

    private ViewManager() {
    }

    public static void openLoginPage() throws IOException {
        if (LoginPage == null) {
            LoginPage = new LoginPage();
            LoginPage.show();
        } else {
            LoginPage.show();
        }

    }

    public static void openConversionPage() throws IOException {
        if (conversionPage == null) {
            conversionPage = new ConversionPage();
            conversionPage.show();
        } else {
            conversionPage.show();
        }

    }

    public static void closeLoginPage() {
        if (LoginPage != null) {
            LoginPage.close();
        }
    }

    public static void closeConversionPage() {
        if (conversionPage != null) {
            conversionPage.close();
        }
    }
}
