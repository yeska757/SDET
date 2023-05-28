package groupProject2.task10;

public class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("navigate = FirefoxDriver implemented from RemoteWebDriver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("getScreenshot = FirefoxDriver implemented from RemoteWebDriver");
    }

    @Override
    public void open() {
        System.out.println("open = FirefoxDriver implemented from RemoteWebDriver");
    }

    @Override
    public void close() {
        System.out.println("close = FirefoxDriver implemented from RemoteWebDriver");
    }

    @Override
    public String getTitle() {
        System.out.println("getTitle = FirefoxDriver implemented from RemoteWebDriver");
        return null;
    }
}
