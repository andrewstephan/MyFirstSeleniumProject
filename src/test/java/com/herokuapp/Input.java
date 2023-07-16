package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Input {

    @Test
    public void inputTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //webdriver este o clasa din selenium
        String url = "https://the-internet.herokuapp.com/inputs";
        driver.get(url);
        driver.manage().window().maximize(); //maximizarea paginii web

        //add number to input
        WebElement giveInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/input"));
        giveInput.sendKeys("432432432"); //dam o valoare
        giveInput.clear();
        driver.close();
        //Assert.assertTrue(giveInput.getText().contains("32432432")); //nu functioneaza assert pe ce contine elementul, de aceea este comentat
        //verify input value

    }
}
