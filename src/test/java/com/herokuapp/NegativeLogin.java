package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLogin {
    @Test
    public void negativeLoginTest(){
        //open page
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //webdriver este o clasa din selenium
        String url = "https://the-internet.herokuapp.com/login";
        driver.get(url);
        driver.manage().window().maximize(); //maximizarea paginii web
        //enter username - gasit cu inspect pe username in pagina
        WebElement usernameInput = driver.findElement(By.id("username")); //aducem elementul by id
        usernameInput.sendKeys("tomsmith");//trimitem key
        //enter password
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("uperSecretPassword!");
        //click login
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
        loginButton.click();

        //verificare

        WebElement errorAlert = driver.findElement(By.id("flash"));
        Assert.assertTrue(errorAlert.getText().contains("Your password is invalid!"));
        driver.close();
    }

}
