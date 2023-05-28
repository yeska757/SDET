package class23;

/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
*/
public interface WebDriver {
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();

}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Chrome browser opens");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome Browser closes");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome Window maximizes");
    }

    @Override
    public void findElement() {
        System.out.println("Element is found in Chrome");
    }
}

class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Firefox browser opens");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox browser closes");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Firefox window maximizes");
    }

    @Override
    public void findElement() {
        System.out.println("Element is found in Firefox");
    }
}