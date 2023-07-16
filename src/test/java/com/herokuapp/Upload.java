package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload {
    @Test
    public void loginTest() {
        //open page
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //webdriver este o clasa din selenium
        String url = "https://the-internet.herokuapp.com/upload";
        driver.get(url);
        driver.manage().window().maximize(); //maximizarea paginii web

        //click upload
        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));
        //chooseFileButton.click();
        //chooseFileButton.sendKeys("src//test//resources//upload.txt");
        //chooseFileButton.sendKeys("C:\\Users\\Andrei\\IdeaProjects\\MyFirstSeleniumProject\\src\\test\\resources\\upload.txt");

        WebElement fileSubmitButton = driver.findElement(By.id("file-submit"));
        fileSubmitButton.click();
        //select file
        //select upload
        //verify



    }
}