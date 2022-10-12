
# Selenium

Selenium is a free (open-source) automated testing framework used to validate web applications across different browsers and platforms. You can use multiple programming languages like Java, C#, Python, etc to create Selenium Test Scripts. Testing done using the Selenium testing tool is usually referred to as Selenium Testing.

## Lessons Learned

What did you learn while building this project? What challenges did you face and how did you overcome them?

- Use of Absolute x-path is a good practice.
- First task to import selenium module in the project.
- Most of the time if you are using any ide project created as maven project while using selenium.
- Sometimes You need to import external dependencies in pom.xml.
- Use of webdriver should match your current version of web-browser which you are using.


## Things to remember

#### Packages to import

```http
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
```

#### Webdriver

```http
  import of webdriver with System.setProperty.
  It's initialization with the Webdriver we are using.
```

| Parameter | class     | Syntax                |
| :-------- | :------- | :------------------------- |
| `Chromedriver` | `WebDriver` | **WebDriver driver = new ChromeDriver();** |

#### get

```http
  Used to get the given url as parameter.
```

| Parameter | Function name     | Syntax                |
| :-------- | :------- | :------------------------- |
| `Url to find` | `get` | **driver.get("url");** |
