import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElement_Select_Usage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Assignments\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Finding the elements on which we want to perform actions.
        WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement button = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));


        //The action which we want to perform
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        button.click();

        
        driver.wait(10000);
        driver.close();
    }

}
