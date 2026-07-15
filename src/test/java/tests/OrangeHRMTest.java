package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PIMPage;
import utils.ExcelUtils;

public class OrangeHRMTest extends BaseTest {

    // ---------------- LOGIN TEST ----------------

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password, String expected) {

        LoginPage login = new LoginPage(driver);
        DashboardPage dashboard = new DashboardPage(driver);

        login.login(username, password);

        if (expected.equalsIgnoreCase("valid")) {

            Assert.assertTrue(dashboard.isDashboardDisplayed());
            dashboard.logout();

        } else {

            Assert.assertTrue(login.isErrorMessageDisplayed());
        }
    }

    // ---------------- ADD EMPLOYEE TEST ----------------

    @Test(dataProvider = "employeeData")
    public void addEmployeeTest(String firstName, String lastName) {

        LoginPage login = new LoginPage(driver);
        PIMPage pim = new PIMPage(driver);

        login.login("Admin", "admin123");

        pim.addEmployee(firstName, lastName);
    }

    // ---------------- LOGIN DATAPROVIDER ----------------

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws Exception {

        String path = System.getProperty("user.dir")
                + "/src/test/resources/testdata/LoginData.xlsx";

        return ExcelUtils.getExcelData(path, "Sheet1");
    }

    // ---------------- EMPLOYEE DATAPROVIDER ----------------

    @DataProvider(name = "employeeData")
    public Object[][] getEmployeeData() throws Exception {

        String path = System.getProperty("user.dir")
                + "/src/test/resources/testdata/LoginData.xlsx";

        return ExcelUtils.getExcelData(path, "AddEmployee");
    }
}