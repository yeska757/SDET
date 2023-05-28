package groupProject2.task10;

/*
10. Provide Implementation for the diagram below.
    Then create a test class in which you need to create
    Objects of ChromeDriver, FirefoxDrive and SafariDriver
    classes and see which methods available to them.
*/

public class test {
    public static void main(String[] args) {

        RemoteWebDriver[] drivers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver driver : drivers) {
            driver.navigate();
            driver.open();
            driver.getTitle();
            driver.getScreenshot();
            driver.close();
        }

    }
}
