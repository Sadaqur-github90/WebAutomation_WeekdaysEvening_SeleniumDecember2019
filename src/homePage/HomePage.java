package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    static WebDriver driver;
    static String url="https://www.amazon.com/ref=nav_logo";
    static String chromeWebDriver="webdriver.chrome.driver";
    static String chromeWebDriverPath="BrowserDriver/chromedriver";

    static String searchPath="//*[@id=\"twotabsearchtextbox\"]";
    static String searchKey= "Mobile Phone";
    static String searchClickPath="//*[@id=\"nav-search\"]/form/div[2]/div/input";
    static String [] path= {"//*[@id=\"nav-hamburger-menu\"]/i","//*[@id=\"nav-logo\"]/a[1]/span[1]","//*[@id=\"nav-global-location-slot\"]/span/a",
                "//*[@id=\"nav-xshop\"]/a[1]","//*[@id=\"nav-xshop\"]/a[2]","//*[@id=\"nav-xshop\"]/a[3]",
            "//*[@id=\"nav-xshop\"]/a[4]","//*[@id=\"nav-xshop\"]/a[5]","//*[@id=\"nav-xshop\"]/a[6]","//*[@id=\"nav-xshop\"]/a[7]",
            "//*[@id=\"icp-nav-flyout\"]/span","//*[@id=\"nav-link-accountList\"]/span[2]","//*[@id=\"nav-orders\"]/span[1]",
            "//*[@id=\"nav-link-prime\"]/span[2]","//*[@id=\"nav-cart\"]/span[3]","//*[@id=\"nav-cart\"]/span[2]",
            "//*[@id=\"navSwmHoliday\"]/a/img","//*[@id=\"nav-subnav\"]/a[1]/span","//*[@id=\"nav-subnav\"]/a[2]/span",
            "//*[@id=\"nav-subnav\"]/a[3]/span","//*[@id=\"nav-subnav\"]/a[4]/span","//*[@id=\"nav-subnav\"]/a[5]/span",
            "//*[@id=\"nav-subnav\"]/a[6]/span","//*[@id=\"nav-subnav\"]/a[7]/span","//*[@id=\"nav-subnav\"]/a[8]/span",
            "//*[@id=\"nav-subnav\"]/a[9]/span","//*[@id=\"nav-subnav\"]/a[10]/span"
             };

    public static void main(String[] args) throws InterruptedException {
       //nevigateTo(url);
        //driver.close();
        //searchButton(searchPath,searchKey,searchClickPath);
        //Thread.sleep(3000);
       // driver.quit();
        //Thread.sleep(3000);
        //driver.quit();
        //System.out.println(path.length);
        homeButton(path);
    }
    static void nevigateTo(String url) {
        System.setProperty(chromeWebDriver,chromeWebDriverPath);
        driver=new ChromeDriver();
        driver.get(url);
    }
    static void homeButton(String [] path) throws InterruptedException {

        for (String ele:path) {
            nevigateTo(url);
            driver.findElement(By.xpath(ele)).click();
            Thread.sleep(3000);
            driver.quit();
        }
    }
//    static void searchButton(String searchPath,String searchKey,String searchClickPath ) {
//        nevigateTo(url);
//        driver.findElement(By.xpath(searchPath)).sendKeys(searchKey);
//        driver.findElement(By.xpath(searchClickPath)).click();
        //driver.findElement(By.className("icp-nav-flag icp-nav-flag-us")).click();
        //driver.close();

   // }

}

