import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import java.time.Duration;
////import java.time.temporal.TemporalUnit;
////import java.util.concurrent.TimeUnit;


public class swag_Lab_Full_Automation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Assignments\\chromedriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //Finding the elements on which we want to perform actions.
        WebElement username = driver.findElement(By.xpath("//*[@id='user-name']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement button = driver.findElement(By.xpath("//*[@id='login-button']"));


        //The action which we want to perform
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        button.click();

        //Dropdown Implementation
        Select drpdown = new Select(driver.findElement(By.xpath("//*[@id='header_container']/div[2]/div[2]/span/select")));
        drpdown.selectByIndex(2);

        //Item add to cart
        WebElement itemadd = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']"));
        itemadd.click();

        //Hover over to cart icon and click
        WebElement carticon = driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a"));
        Actions carthover = new Actions(driver);
        carthover.moveToElement(carticon).click().build().perform();

        //CheckOut Automation
        WebElement chkbutton = driver.findElement(By.xpath("//*[@id='checkout']"));
        chkbutton.click();

        WebElement firstname = driver.findElement(By.xpath("//*[@id='first-name']"));
        firstname.sendKeys("Aditya");

        WebElement lastname = driver.findElement(By.xpath("//*[@id='last-name']"));
        lastname.sendKeys("Saraswat");

        WebElement z_code = driver.findElement(By.xpath("//*[@id='postal-code']"));
        z_code.sendKeys("281003");

        WebElement contbtn = driver.findElement(By.xpath("//*[@id='continue']"));
        contbtn.click();

        Thread.sleep(10000);
        WebElement finishbtn = driver.findElement(By.xpath("//*[@id='finish']"));
        finishbtn.click();


//        driver.wait(10000);
        driver.close();
    }
}
