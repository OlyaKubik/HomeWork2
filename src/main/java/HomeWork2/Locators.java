
package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    private static  class Url {
        private static final String uhomki = "https://uhomki.com.ua/koshki/1074/";
        private static final String itstep  = "https://itstep.dp.ua/ru";
        private static final String w3schools = "https://www.w3schools.com/";
        private static final String idea ="https://www.jetbrains.com/idea/";

    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Задание 1
        //driver.get(Url.uhomki);
       // driver.findElement(By.className("userbar__button-text")).click();
        //driver.findElement(By.linkText("Вход")).click();

        //Задание 2
       // driver.get(Url.uhomki);
        //driver.findElement(By.xpath("//div[@class='footer__heading']/parent::div//a[contains(text(),'Собаки/кошки общее')]")).click();

        //Задание 3
        //driver.get(Url.itstep);
       // driver.findElement(By.className("cookies-new__confirm")).click();
        //System.out.println(
        //driver.findElement(By.xpath("//h2[contains(text(),'IT специальностям')]")).getText());

        //Задание 4
       // driver.findElement(By.xpath("//span[text()='Аквариумы']"));

        //Задание 5
        //driver.findElement(By.xpath("//div[@class='dropbtn-phones']/span"));

        //Задание 6
        //driver.findElement(By.xpath("//div[@class='re-home-children__wrap']/h2"));

        //Задание 7
        //driver.get(Url.w3schools);
        //driver.findElement(By.id("cert_navbtn")).click();
        //driver.findElement(By.id("navbtn_tutorials")).click();
       // driver.findElement(By.id("navbtn_exercises")).click();
        //driver.findElement(By.id("navbtn_references")).click();
        //driver.findElement(By.xpath("//input[@id='search2']")).sendKeys("html");
        //driver.findElement(By.xpath("//a[@id='nav_search_btn']")).click();
        //driver.findElement(By.xpath("//td[@id='gs_tti50']")).sendKeys("html");
        //driver.findElement(By.xpath("//a[@id='nav_translate_btn']")).click();
        //driver.findElement(By.xpath("div[id='darkmodemenu']")).click();
        //driver.findElement(By.xpath("//div[@id = 'goog-gt-']")).click();

        //Задание 8


        //Задание 9
        //driver.get(Url.idea);
        //driver.findElement(By.xpath("//a[@class='wt-col-inline menu-second__download-button wt-button wt-button_size_s wt-button_mode_primary']")).click();

        //Задание 10
        driver.get("https://www.jetbrains.com/idea/download/#section=windows");
        driver.findElement(By.xpath("//a[@class = '_main_12yxkch_17 _modeClassic_12yxkch_135 _sizeM_12yxkch_99 _alignIconLeft_12yxkch_77 _light_12yxkch_59 _flatRight_12yxkch_125 _wtDownloadButton__left_3gbaqk _wtDownloadButton__left_2sbscl _wtDownloadButton__left_45alcl']")).click();
        driver.findElement(By.xpath("//a[@class = '_main_12yxkch_17 _modeRock_12yxkch_208 _sizeM_12yxkch_99 _alignIconLeft_12yxkch_77 _light_12yxkch_59 _flatRight_12yxkch_125 _wtDownloadButton__left_3gbaqk _wtDownloadButton__left_2sbscl _wtDownloadButton__left_45alcl']")).click();











    }
}
