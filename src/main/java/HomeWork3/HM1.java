package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HM1 {
    //Задание 3
    public static void Attribute(WebElement element) throws NoSuchAttributeEx, NoSuchName, NoSuchText, NoSuchClass, NoSuchLocation {
        System.out.println("Название тега: " + element.getTagName());

        if (element.getAttribute("id") == null) {
            throw new NoSuchAttributeEx("Атрибута id нет");
        } else {
            System.out.println("Атрибут id равен " + element.getAttribute("id"));
        }

        if (element.getAttribute("name") == null) {
            throw new NoSuchName("Атрибутa name нет");
        } else {
            System.out.println("Атрибут name равен " + element.getAttribute("name"));
        }

        if (element.getAttribute("class") == null) {
            throw new NoSuchClass("Атрибут class нет");
        } else {
            System.out.println("Атрибут class равен " + element.getAttribute("class"));
        }
        if (element.getText() == null) {
            throw new NoSuchText("text");
        } else {
            System.out.println("Атрибут text равен " + element.getAttribute("text"));}

        if (element.getLocation() == null) {
                throw new NoSuchLocation("Координата центра ");
        } else {
            System.out.println("Атрибут Координата центра " + element.getLocation());}
    }

            public static void main (String [] args){
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();

                driver.get("https://uhomki.com.ua/");

                try {
                    Attribute(driver.findElement(By.xpath("//input[@class='search__input']")));
                } catch (NoSuchAttributeEx | NoSuchClass | NoSuchName | NoSuchText | NoSuchLocation ex) {
                    System.out.println(ex.getMessage());
                }



            }
        }
