
# Selenium

Selenium is a free (open-source) automated testing framework used to validate web applications across different browsers and platforms. You can use multiple programming languages like Java, C#, Python, etc to create Selenium Test Scripts. Testing done using the Selenium testing tool is usually referred to as Selenium Testing.

## Lessons Learned

What did you learn while building this project? What challenges did you face and how did you overcome them?

- Use of Absolute x-path is a good practice.
- First task to import selenium module in the project.
- Most of the time if you are using any ide project created as maven project while using selenium.
- Sometimes You need to import external dependencies in pom.xml.


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

| Driver | class     | Syntax                |
| :-------- | :------- | :------------------------- |
| `Chromedriver` | `WebDriver` | **WebDriver driver = new ChromeDriver();** |

#### Functions & Syntax

```http
  Used to get the given url as parameter.
```

| Description | Function name     | Syntax                |
| :-------- | :------- | :------------------------- |
| `Url to find` | `get()` | **driver.get("url");** |
| `The WebElement to find or to select` | `findElement()` | **driver.findElement(By.xpath("Here type the x-path"));** |
| `To give inputs` | `sendKeys()` | **var_name.sendKeys("Value To input");**|
| `To click a button` | `click()` | **button.click();**|
| `To give waiting time before performing an action` | `wait()` | **driver.wait(secounds in millis);**|


#### Drop-Down implementation or Select package
```http
    Import the package org.openqa.selenium.support.ui.Select
    Instantiate the drop-down box as an object, Select in Selenium WebDriver

    Syntax - Select variable-name = new Select(driver.findElement(By.xpath("Give x path of Dropdown")));
```

##### Refrence for Dropdown functions - [Click to View](https://www.guru99.com/select-option-dropdown-selenium-webdriver.html#:~:text=the%20selectByVisibleText()%20method.-,Select%20Methods,-The%20following%20are)


