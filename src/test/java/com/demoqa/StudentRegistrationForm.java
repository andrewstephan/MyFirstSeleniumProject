package com.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentRegistrationForm {

    @Test
    public void studentregistrationTest() {
        //open page

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/automation-practice-form";
        driver.get(url);
        driver.manage().window().maximize();

        //complete first name, last name and email

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Andrei");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Stefan");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("stefanandrei@test.ro");

        //check the gender box

        WebElement genderCheck = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
        genderCheck.click();

        //user number

        WebElement userNumber = driver.findElement(By.id("userNumber"));
        userNumber.sendKeys("0123456789");

        //open the calendar

        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirth.click();

        //select the month, year and day


        WebElement monthElement0 = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
        Select monthElement = new Select(monthElement0);
        monthElement.selectByValue("0");
        WebElement option1 = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[1]"));
        Assert.assertTrue(option1.isSelected());
        monthElement0 = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
        monthElement0.click();

        WebElement dayElement1 = driver.findElement(By.xpath("<div class=\"react-datepicker__day react-datepicker__day--001 react-datepicker__day--selected react-datepicker__day--weekend\" tabindex=\"0\" aria-label=\"Choose Sunday, January 1st, 2023\" role=\"option\" aria-disabled=\"false\">1</div>"));
        Select dayElement = new Select(dayElement1);
        dayElement.selectByValue("1");
        //WebElement option2 = driver.findElement()


        //complete the subject

//        WebElement subjectComplete = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
//        subjectComplete.sendKeys("Practice Form");


    }
}