import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class action_class {
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
        Select drpdown = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
        drpdown.selectByVisibleText("Price (low to high)");

        //Item add to cart
        WebElement itemadd = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']"));
        itemadd.click();

        //Hover over to cart icon and click
        WebElement carticon = driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a"));
        Actions carthover = new Actions(driver);
        carthover.moveToElement(carticon).click().build().perform();


        driver.wait(10000);
        driver.close();
    }

}
