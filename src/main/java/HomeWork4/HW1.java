package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    // Задание 1

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");

        //Выбор нужных элемментов в перечне
        WebElement nameavto = driver.findElement(By.id("Carlist"));
        Select nameavtoSelect = new Select(nameavto);
        nameavtoSelect.selectByVisibleText("Renault");
        WebElement countryElement = driver.findElement(By.xpath("//select[@name='FromLB']"));
        Select countrySelect = new Select(countryElement);
        countrySelect.selectByVisibleText("France");
        countrySelect.selectByVisibleText("India");
        countrySelect.selectByVisibleText("Germany");
        countrySelect.selectByVisibleText("Italy");
        countrySelect.selectByVisibleText("Malaysia");
        countrySelect.selectByVisibleText("Spain");

        countrySelect.deselectByVisibleText("India");
        countrySelect.deselectByVisibleText("Malaysia");
        driver.findElement(By.xpath("//input[@onclick='move(this.form.FromLB,this.form.ToLB)']")).click();


        //Вывод элемментов на консоль
        Select avtoListSelect = new Select(driver.findElement(By.id("Carlist")));
        List<WebElement> avtoList =  avtoListSelect.getOptions();
        System.out.print("Автомобили доступные для выбора: \n");
        for (WebElement avto:avtoList){
            if(avto.getText().equals("Car")){
                continue;
            }
            System.out.print(avto.getText() + " ");
        }

        Select countryListSelect = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
        List<WebElement> countryList =  countryListSelect.getOptions();
        System.out.print("\nСтраны из первой таблицы:  \n");
        for (WebElement country:countryList){
            System.out.print(country.getText() + " ");
        }
        Select countryListSelect2 = new Select(driver.findElement(By.xpath("//select[@name='ToLB']")));
        List<WebElement> countryList2 =  countryListSelect2.getOptions();
        System.out.print("\nСтраны из второй таблицы:  \n");
        for (WebElement country2:countryList2){
            System.out.print(country2.getText() + " ");
        }



    }
}
