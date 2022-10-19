
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



#  XPath
#### XPath in Selenium is an XML path used for navigation through the HTML structure of the page. It is a syntax or language for finding any element on a web page using XML path expression.

#### Simple Syntax of Xpath
![App Screenshot](https://www.guru99.com/images/3-2016/032816_0758_XPathinSele1.png)

### Frequently used xpath Locators

| Locators | Description     |
| :-------- | :------- |
| `id`      | To find a element by it's id attribute |
| `classname`      | To find a element by it's classname |
| `name`      | To find a element by it's name attribute |
| `link text`      | To find a element by it's text of the link |

### Types of xpaths

#### there are two types of xpaths
- Absolute xpath
- Relative xpath

#### Absolute xpath

- It's a direct way to write the xpath.
- It's disadvantage is if any change happen in UI of website or xpath then xpath is going to fail.

##### Example 
```http
    /html/body/div[2]/div[1]/div/h4[1]/b/html[1]/body[1]/div[2]/div[1]/div[1]/h4[1]/b[1]
```

    - The solution of the above problem is relative xpath.

#### Relative xpath

- It can search elements anywhere on the webpage, means no need to write a long xpath and you can start from the middle of HTML DOM structure.

#### Example of Relative Xpath
![App Screenshot](https://www.guru99.com/images/3-2016/032816_0758_XPathinSele3.png)

### Link to Dynamic xpath !!!! Important : [Dynamic XPath](https://www.guru99.com/xpath-selenium.html#:~:text=How%20To%20Write%20Dynamic%20XPath%20In%20Selenium%20WebDriver)

### For Practice xpath  : [To practice xpath](https://demo.guru99.com/test/selenium-xpath.html)
