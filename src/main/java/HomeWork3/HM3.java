package HomeWork3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;


public class HM3 {
    public static void main(String[]args){

        //Задание 1

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://uhomki.com.ua/");
        Set<String> setfist = driver.getWindowHandles();

        //2
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setSecond = driver.getWindowHandles();
        setSecond.removeAll(setfist);
        String finalDesc = setSecond.iterator().next();
        driver.switchTo().window(finalDesc);
        driver.get("https://zoo.kiev.ua/");

        //3
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setThird = driver.getWindowHandles();
        String finalWindowHandle =
                (setThird.toArray()[setThird.toArray().length-1]).toString();

        driver.switchTo().window(finalWindowHandle);
        driver.get("https://www.w3schools.com/");

        //4
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setFour = driver.getWindowHandles();
        String finalWindowHandle_four =
                (setFour.toArray()[setFour.toArray().length-1]).toString();

        driver.switchTo().window(finalWindowHandle_four);
        driver.get("https://taxi838.ua/ru/dnepr/");

        //5
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setFive = driver.getWindowHandles();
        String finalWindowHandle_Five =
                (setFive.toArray()[setFive.toArray().length-1]).toString();

        driver.switchTo().window(finalWindowHandle_Five);
        driver.get("https://klopotenko.com/");



        ///TASK 2
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            driver.switchTo().window(ChildWindow);
            System.out.println(driver.getCurrentUrl());// название странцы
            System.out.println(driver.getTitle());// название странцы

        }
















    }
}
