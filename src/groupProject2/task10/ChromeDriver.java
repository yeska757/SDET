package groupProject2.task10;

public class ChromeDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("navigate = ChromeDriver implemented from RemoteWebDriver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("getScreenshot = ChromeDriver implemented from RemoteWebDriver");
    }

    @Override
    public void open() {
        System.out.println("open = ChromeDriver implemented from RemoteWebDriver");
    }

    @Override
    public void close() {
        System.out.println("close = ChromeDriver implemented from RemoteWebDriver");
    }

    @Override
    public String getTitle() {
        System.out.println("getTitle = ChromeDriver implemented from RemoteWebDriver");
        return null;
    }
}
