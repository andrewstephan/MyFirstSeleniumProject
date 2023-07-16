package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes {
    @Test(priority = 1, groups = {"regression", "smoke"}, enabled = false)//priority este ordinea in care sa ruleze
    public void checkboxTest(){ //false se foloseste daca nu vrem sa ruleze acest test. Face parte din annotations testng documentation
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //webdriver este o clasa din selenium
        String url = "https://the-internet.herokuapp.com/checkboxes";
        driver.get(url);
        driver.manage().window().maximize(); //maximizarea paginii web

        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected());

        WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        if(!checkbox2.isSelected()){ //inversul !
            checkbox2.click();
        }

        Assert.assertTrue(checkbox2.isSelected()); //pica testul pentru ca checkbox2 este selected by default
        driver.close();

    }
}
