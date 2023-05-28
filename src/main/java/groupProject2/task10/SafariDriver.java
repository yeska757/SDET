package groupProject2.task10;

public class SafariDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("navigate = SafariDriver implemented from RemoteWebDriver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("getScreenshot = SafariDriver implemented from RemoteWebDriver");
    }

    @Override
    public void open() {
        System.out.println("open = SafariDriver implemented from RemoteWebDriver");
    }

    @Override
    public void close() {
        System.out.println("close = SafariDriver implemented from RemoteWebDriver");
    }

    @Override
    public String getTitle() {
        System.out.println("getTitle = SafariDriver implemented from RemoteWebDriver");
        return null;
    }
}
