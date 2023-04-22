package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HM2 {

    public static void metodelements (WebDriver driver){

        for (WebElement element:
                driver.findElements(By.xpath("//div[text()='Каталог']/following-sibling::ul//a"))){
            System.out.println(element.getText());
        }
        for (WebElement element:
        driver.findElements(By.xpath("//div[@class='products-menu j-products-menu']//div/a"))){
        System.out.println(element.getText());}

    }
    public static void main(String[]args){

        //Задание 4

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://uhomki.com.ua/");
        metodelements(driver);


    }
}
