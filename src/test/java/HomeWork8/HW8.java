package HomeWork8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HW8 {

    @Test (dataProvider = "search")
    public void checkSerch(String serchParams) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.foxtrot.com.ua/");
        HomeWork6.HW1 exempClass = new HomeWork6.HW1(driver);
        Actions actions = new Actions(driver);
        exempClass.waitForVisabilityOfElement(By.xpath("//input[@type='search']"));
        WebElement serch = driver.findElement(By.xpath("//input[@type='search']"));
        String first = serchParams;
        serch.sendKeys(first);
        WebElement serch2 = driver.findElement(By.xpath("//input[@value='Найти']"));
        serch2.click();
        if ((driver.findElement(By.tagName("h1"))).getText().contains("Найдено по запросу ")){
            String resultOfReach = (driver.findElement(By.tagName("h1")))
                    .getText().replace("Найдено по запросу ", "");
            assertTrue(resultOfReach.equals("«"+first+"»"));
        }else if ((driver.findElement(By.tagName("h1"))).getText().contains("Результаты поиска ")){

        String resultOfReach = (driver.findElement(By.xpath("//div[@class='page__title']/h1"))).getText();
            assertTrue(resultOfReach.equals("«"+first+"»"));
        }

    }
    @DataProvider(name = "search")
    public Object[] searchObj() {
        return new Object[]{
                "машина", "input", "смысл"
        };
    }
}

