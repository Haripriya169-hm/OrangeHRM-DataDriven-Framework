package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PIMPage {

    WebDriver driver;

    By pimMenu = By.xpath("//span[text()='PIM']");
    By addEmployeeBtn = By.xpath("//button[normalize-space()='Add']");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By saveBtn = By.xpath("//button[@type='submit']");

    public PIMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addEmployee(String fName, String lName) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(pimMenu)).click();

        wait.until(ExpectedConditions.elementToBeClickable(addEmployeeBtn)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(fName);

        driver.findElement(lastName).sendKeys(lName);

        WebElement save = wait.until(ExpectedConditions.elementToBeClickable(saveBtn));

        save.click();
    }
}