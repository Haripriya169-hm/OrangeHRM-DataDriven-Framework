package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By dashboardHeader = By.xpath("//h6[text()='Dashboard']");
    By profileIcon = By.xpath("//p[@class='oxd-userdropdown-name']");
    By logoutBtn = By.xpath("//a[text()='Logout']");

    public boolean isDashboardDisplayed() {
        return driver.findElements(dashboardHeader).size() > 0;
    }

    public void logout() {
        driver.findElement(profileIcon).click();
        driver.findElement(logoutBtn).click();
    }
}