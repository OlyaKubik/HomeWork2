package HomeWork7;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class HW1 {

    @Test
    public void checkNumberOfTabs(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.get("https://dan-it.com.ua/uk/");
        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Для дорослих']")));
        actions.moveToElement(driver.findElement
                        (By.xpath("//a[text()='Java']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();//открыла в новой вкладке 1
        actions.moveToElement(driver.findElement
                        (By.xpath("//a[text()='Quality Assurance (QA)']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();//открыла в новой вкладке 2
        actions.moveToElement(driver.findElement
                        (By.xpath("//a[text()='FrontEnd']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();//открыла в новой вкладке 3
        Set<String> finle = driver.getWindowHandles();
        assertTrue(finle.size()==4);

    }


    @Test
    public void checkLink (){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");
        driver.findElement(By.xpath("//span[@class='site-menu__item']/a[text()='Оплата и доставка']")).click();


       String nameUrl = "https://uhomki.com.ua/ru/oplata-i-dostavka/";
       assertTrue(driver.getCurrentUrl().equals(nameUrl));

    }

    @Test
    public void checkPresenceOfWord() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.get("https://uhomki.com.ua/ru/");

        //Первый поиск
        WebElement search1 = driver.findElement(By.xpath("//input[@class='search__input']"));
        String serch = "смесь";
        search1.sendKeys(serch);
        search1.submit();
        WebElement serchresult = driver.findElement(By.id("j-catalog-header"));
        String resultText = serchresult.getText().replace("Результаты поиска «","");
        String resText = resultText.replace("»","");
        assertTrue(resText.equalsIgnoreCase(serch));

        WebElement search2 = driver.findElement(By.xpath("//input[@class='search__input']"));
        search2.clear();


        //второй поиск
        WebElement search3 = driver.findElement(By.xpath("//input[@class='search__input']"));

        String serch5 = "спесь";
        search3.sendKeys(serch5);
        search3.submit();
        WebElement serchresult2 = driver.findElement(By.id("j-catalog-header"));
        String resultText2 = serchresult2.getText().replace("Результаты поиска «","");
        String resText2 = resultText2.replace("»","");
        System.out.println(resText2);

        assertTrue(resText2.equalsIgnoreCase(serch5));

        WebElement search4= driver.findElement(By.xpath("//input[@class='search__input']"));
        search4.clear();


        //третий поиск
        WebElement search5 = driver.findElement(By.xpath("//input[@class='search__input']"));

        String serch4 = "ересь";
        search5.sendKeys(serch4);
        search5.submit();
        WebElement serchresult4 = driver.findElement(By.id("j-catalog-header"));
        String resultText4 = serchresult4.getText().replace("Результаты поиска «","");
        String resText4 = resultText4.replace("»","");

        assertTrue(resText4.equalsIgnoreCase(serch4));
    }
    @Test
    public void checkCheckBox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        WebElement unclicked = driver.findElement(By.xpath("//input[@id='RememberMe']"));
        assertFalse(unclicked.isSelected());
        unclicked.click();
        assertTrue(unclicked.isSelected());
        unclicked.click();
        assertFalse(unclicked.isSelected());


    }

    @Test
    public void checkTextModalWindow(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomeWork6.HW1 exempClass = new HomeWork6.HW1(driver);
        Actions actions1 = new Actions(driver);
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
       WebElement alert = driver.findElement(By.xpath("//input[@onclick='myFunction1()']"));
        actions1.moveToElement(alert).click().perform();
        exempClass.waitForAlertAndSwitchToIt();
        Alert alerts = driver.switchTo().alert();
        System.out.println(alerts.getText());
        assertEquals(alerts.getText(),"Hi.. This is alert message!");
        alerts.accept();

    }
}
