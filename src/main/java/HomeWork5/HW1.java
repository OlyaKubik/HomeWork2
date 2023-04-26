package HomeWork5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class HW1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


      driver.get("https://www.google.com/search");
       Actions actions = new Actions(driver);


        driver.findElements(By.xpath("//textarea[@class='gLFyf']")).
        get(0).sendKeys("https://www.guinnessworldrecords.com/account/register?");//ввела в поиск


       driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).click();//нажала найти
        Set<String> first = driver.getWindowHandles();
        actions.moveToElement(driver.findElement
                (By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")))
             .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();//открыла 2й в новой вкладке


        driver.findElement(By.xpath("//span[@class='ExCKkf z1asCe rzyADb']")).click();//нажала очистить поиск

        driver.findElements(By.xpath("//textarea[@class='gLFyf']")).
                get(0).sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");//вставила ссылку 3й сайт


        actions.moveToElement(driver.findElement
                (By.xpath("//textarea[@class='gLFyf']"))).sendKeys(Keys.ENTER).click().build().perform();//нажала ентр
        Set<String> second = driver.getWindowHandles();
        actions.moveToElement(driver.findElement
                        (By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();//открытие 3й сайт в новой вкладке
        second.removeAll(first);
        Set<String> thirt = driver.getWindowHandles();

        //Открыли четвертый сайт
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        Thread.sleep(4000);
       WebElement elementFrame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(elementFrame);
        WebElement name = driver.findElement(By.xpath("//input[@id='fname']"));
        name.clear();
        name.sendKeys("Olya");
        WebElement lname = driver.findElement(By.xpath("//input[@id='lname']"));
        lname.clear();
        lname.sendKeys("Kubik");
        lname.submit();
        Thread.sleep(4000);
        System.out.println(driver.findElement
                (By.xpath("//div[@class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']")).getText());
        //Переключиться на следующую ссылку
        Thread.sleep(2000);
        second.removeAll(first);
        driver.switchTo().window(second.iterator().next());
        Thread.sleep(4000);

        driver.findElements(By.xpath("//input[@id='LastName']")).
                get(0).sendKeys("Britny");
        driver.findElements(By.xpath("//input[@id='FirstName']")).
                get(0).sendKeys("Spirs");
        driver.findElements(By.xpath("//input[@id='DateOfBirthDay']")).
                get(0).sendKeys("01");
        driver.findElements(By.xpath("//input[@id='DateOfBirthMonth']")).
                get(0).sendKeys("01");
        driver.findElements(By.xpath("//input[@id='DateOfBirthYear']")).
                get(0).sendKeys("2000");

        WebElement country = driver.findElement(By.id("Country"));
        Select countrySelect = new Select(country);
        countrySelect.selectByVisibleText("Ukraine");

        WebElement state = driver.findElement(By.xpath("//select[@class='input-large create-application-name']"));
        Select stateSelect = new Select(state);
        stateSelect.selectByIndex(2);

        driver.findElements(By.xpath("//input[@id='EmailAddress']")).
                get(0).sendKeys("mailmail@mail.cim");
        driver.findElements(By.xpath("//input[@id='ConfirmEmailAddress']")).
                get(0).sendKeys("mailmail@mail.cim");
        driver.findElements(By.xpath("//input[@id='Password']")).
                get(0).sendKeys("123456");
        driver.findElements(By.xpath("//input[@id='ConfirmPassword']")).
                get(0).sendKeys("123");
        driver.findElement(By.xpath("//button[@class='btn btn-primary blue']")).click();
        System.out.println(driver.findElement
                (By.xpath("//span[@for='ConfirmPassword']")).getText());
        thirt.removeAll(first);
        thirt.removeAll(second);

        //Переключиться на следующую ссылку

        driver.switchTo().window(thirt.iterator().next());

        Actions actions1 = new Actions(driver);
        actions1.contextClick(driver.findElement(By.id("alertBox"))).perform();
        driver.findElement(By.id("alertBox")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println(driver.findElement
                (By.xpath("//div[@style='border-radius: 5px; border-style: " +
                        "groove; margin: 5px; padding: 8px;'][4]/div")).getText());
        actions1.contextClick(driver.findElement(By.id("confirmBox"))).perform();
        driver.findElement(By.id("confirmBox")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        System.out.println(driver.findElement
                (By.xpath("//div[@style='border-radius: 5px; border-style: " +
                        "groove; margin: 5px; padding: 8px;'][4]/div")).getText());
        actions1.contextClick(driver.findElement(By.id("promptBox"))).perform();
        driver.findElement(By.id("promptBox")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.accept();
        System.out.println(driver.findElement
                (By.xpath("//div[@style='border-radius: 5px; border-style: " +
                        "groove; margin: 5px; padding: 8px;'][4]/div")).getText());


    }
}
