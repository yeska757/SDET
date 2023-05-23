package class22;

public abstract class WebDriver {

   abstract void openBrowser();
    abstract  void loadUrl(String url);
    abstract void performTesting();
    abstract void closeBrowser();



}
class ChromeDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Open Chrome browser");
    }

    @Override
    void loadUrl(String url) {
        System.out.println("Loading website on " + url);
    }

    @Override
    void performTesting() {
        System.out.println("Testing the webpage on Google Chrome");
    }

    @Override
    void closeBrowser() {
        System.out.println("Closing Chrome browser");
    }
}