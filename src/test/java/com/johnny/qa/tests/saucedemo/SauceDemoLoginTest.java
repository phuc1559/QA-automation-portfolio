package com.johnny.qa.tests.saucedemo;

import com.johnny.qa.base.BaseTest;
import com.johnny.qa.pages.saucedemo.InventoryPage;
import com.johnny.qa.pages.saucedemo.LoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SauceDemoLoginTest extends BaseTest {

    @Test
    void loginWithStandardUser_shouldOpenInventoryPage() {
        InventoryPage inventoryPage = new LoginPage(driver)
                .open()
                .loginAs("standard_user", "secret_sauce");

        assertEquals("Products", inventoryPage.getTitle());
    }

    @Test
    void loginWithEmptyUsername_shouldShowUsernameRequiredError() {
        LoginPage loginPage = new LoginPage(driver)
                .open()
                .loginExpectingError("", "secret_sauce");

        assertEquals("Epic sadface: Username is required", loginPage.getErrorMessage());
    }

    @Test
    void loginWithWrongPassword_shouldShowMismatchError() {
        LoginPage loginPage = new LoginPage(driver)
                .open()
                .loginExpectingError("standard_user", "wrong_password");

        assertEquals(
                "Epic sadface: Username and password do not match any user in this service",
                loginPage.getErrorMessage());
    }
}


