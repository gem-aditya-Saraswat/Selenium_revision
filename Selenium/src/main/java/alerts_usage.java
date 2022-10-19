import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_usage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Assignments\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement js_alert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        js_alert.click();
        //Alert get text
        Alert alert = driver.switchTo().alert();

        String textMessage = alert.getText();
        System.out.println("Message in Alert is - " + textMessage);
        alert.accept();

        WebElement result_out = driver.findElement(By.xpath("//*[@id='result']"));
        System.out.println("Confirmation Message is - "+ result_out.getText());

        WebElement js_alert_confirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        js_alert_confirm.click();


        //Alert get text
        Alert alert_confirm = driver.switchTo().alert();
        alert_confirm.accept();

        result_out = driver.findElement(By.xpath("//*[@id='result']"));
        System.out.println("Confirmation Message is - "+ result_out.getText());

        js_alert_confirm.click();
        alert_confirm = driver.switchTo().alert();
        alert_confirm.dismiss();

        result_out = driver.findElement(By.xpath("//*[@id='result']"));
        System.out.println("Confirmation Message is - "+ result_out.getText());

        WebElement js_alert_input = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        js_alert_input.click();

        alert_confirm = driver.switchTo().alert();
        alert_confirm.sendKeys("Hello to Selenium");
        alert_confirm.accept();

        result_out = driver.findElement(By.xpath("//*[@id='result']"));
        System.out.println("Entered Value is - " + result_out.getText());


    }
}
