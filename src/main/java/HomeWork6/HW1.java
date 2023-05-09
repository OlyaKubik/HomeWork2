package HomeWork6;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class HW1 {
    private final WebDriver driver;
    public HW1 (WebDriver driver){
        this.driver = driver;
    }

    private static final long EXPLICITY_WAIT=20L;

    private FluentWait<WebDriver> fluentWait(long duration){
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(duration))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(InvalidElementStateException.class)
                .ignoring(StaleElementReferenceException.class);

    }
    private void waitForFunction (Function function,long timeout){
        FluentWait<WebDriver> wait = fluentWait(timeout);
        wait.until(function);
    }

    public WebElement waitEleventLocated (By by) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.presenceOfElementLocated(by));
    }


    public void waitTextInElement (WebElement element, String text){
        waitForFunction(ExpectedConditions.textToBePresentInElementValue(element, text),EXPLICITY_WAIT);
    }

    public void waitInVisibilityElement (WebElement element){
        waitForFunction(ExpectedConditions.invisibilityOf(element), EXPLICITY_WAIT);
    }
    public void waitInVisibilityElement (By by){
        waitForFunction(ExpectedConditions.invisibilityOf(driver.findElement(by)), EXPLICITY_WAIT);
    }

    public void waitTitle (String title){
       waitForFunction(ExpectedConditions.titleContains(title), EXPLICITY_WAIT);
    }
    public void waitTitleIs (String title){
        waitForFunction(ExpectedConditions.titleIs(title),EXPLICITY_WAIT);
    }
    public void waitElementToBeClickable(By by) {
        waitForFunction(ExpectedConditions.elementToBeClickable(by), EXPLICITY_WAIT);
    }

    public void waitElementToBeClickable(WebElement element) {
        waitForFunction(ExpectedConditions.elementToBeClickable(element), EXPLICITY_WAIT);
    }

    public void waitElementToBeSelected(By by) {
        waitForFunction(ExpectedConditions.elementToBeSelected(by), EXPLICITY_WAIT);
    }

    public void waitElementToBeSelected(WebElement element) {
        waitForFunction(ExpectedConditions.elementToBeSelected(element), EXPLICITY_WAIT);
    }

    public void waitElementSelectionStateTobe(WebElement element, boolean bo){
        waitForFunction(ExpectedConditions.elementSelectionStateToBe(element, bo),EXPLICITY_WAIT);
    }
    public void waitVisabilityOfElemetLocated (By by){
        waitForFunction(ExpectedConditions.visibilityOfElementLocated(by), EXPLICITY_WAIT);
    }
    public void waitframeToAvailableAndSwich(WebElement element){
        waitForFunction(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element),EXPLICITY_WAIT);
    }
    public void waitframeToAvailableAndSwich(By by){
        waitForFunction(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by),EXPLICITY_WAIT);
    }
    public Alert waitForAlertAndSwitchToIt() {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.alertIsPresent());
    }
    public Alert waitForAlertAndSwitchToIt(WebElement element) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.alertIsPresent());
    }

    public WebElement waitPresenceOfElementReturn(By by) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public void waitForVisabilityOfElement(By by) {
        waitForFunction(ExpectedConditions.visibilityOfElementLocated(by), EXPLICITY_WAIT);
    }



    }












