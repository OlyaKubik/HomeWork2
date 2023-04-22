package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HM2 {

    //Задание 2
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);

        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(15000);
        //1 действие

        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-sound']")))
                .release().build().perform();

        Thread.sleep(8000);
        //2 действие

        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-sound']")))
                .release().build().perform();

        Thread.sleep(8000);
        //3 действие

        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-sound']")))
                .release().build().perform();

        Thread.sleep(8000);
        //4 действие

        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-credits']")))
                .release().build().perform();
        Thread.sleep(8000);
        //5 действие

        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-credits']")))
                .release().build().perform();
        Thread.sleep(8000);
        //6 действие

        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-sound']")))
                .release().build().perform();
        Thread.sleep(10000);

        //7 действие
        WebElement roundbig = driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"));
        WebElement sound = driver.findElement(By.xpath("//*[local-name() = 'circle'][1]"));

        actions.moveToElement(roundbig).clickAndHold().moveToElement(sound,600,100).
                release().build().perform();
        Thread.sleep(8000);

      driver.findElements(By.xpath("//div[@id='postcard-back-content']/textarea")).get(0).sendKeys("Задание выполнено!");

    }
}
