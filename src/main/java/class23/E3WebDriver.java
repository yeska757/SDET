package class23;

/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
*/
public interface E3WebDriver {
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();

}

class E3ChromeDriver implements E3WebDriver {

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

class E3FirefoxDriver implements E3WebDriver {

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