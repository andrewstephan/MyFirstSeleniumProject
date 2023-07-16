package com.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

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


        WebElement monthElement = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
        Select monthElement1 = new Select(monthElement);
        monthElement1.selectByValue("1");


        WebElement yearElement = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
        Select yearElement1 = new Select(yearElement);
        yearElement1.selectByValue("1950");


        WebElement dayElement = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]"));
        //Select dayElement1 = new Select(dayElement); - nu imi selecteaza data dorita
        dayElement.click();

        //another try to complete the calendar

//        WebElement monthElement0 = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
//        Select monthElement = new Select(monthElement0);
//        monthElement.selectByValue("0");
//        WebElement option1 = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[1]"));
//        Assert.assertTrue(monthElement0.isSelected());
//        monthElement0 = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
//        monthElement0.click();

//        WebElement yearElement1 = driver.findElement(By.xpath("<div class=\"react-datepicker__day react-datepicker__day--001 react-datepicker__day--selected react-datepicker__day--weekend\" tabindex=\"0\" aria-label=\"Choose Sunday, January 1st, 2023\" role=\"option\" aria-disabled=\"false\">1</div>"));
//        Select yearElement = new Select(yearElement1);
//        yearElement.selectByValue("31");
//        WebElement option31 = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[31]"));
//        Assert.assertTrue(yearElement1.isSelected());
//        yearElement1 = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[31]"));
//        yearElement1.click();

//        WebElement dayElement1 = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]"));
//        Select dayElement = new Select(dayElement1);
//        dayElement.selectByValue("1");
//        WebElement option3 = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]"));
//        Assert.assertTrue(option3.isSelected());


        //complete the subject

        WebElement subjectComplete = driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
        subjectComplete.sendKeys("Biology");
        new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
        new Actions(driver).sendKeys(Keys.ENTER).perform();

        subjectComplete.sendKeys("Chemistry");
        new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
        new Actions(driver).sendKeys(Keys.ENTER).perform();

        subjectComplete.sendKeys("Economics");
        new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
        new Actions(driver).sendKeys(Keys.ENTER).perform();

        //hobbies - nu merge

//        WebElement hobbyReading = driver.findElement(By.id("hobbies-checkbox-2"));
//        hobbyReading.click();

        WebElement hobbyMusic = driver.findElement(By.id("hobbies-checkbox-3"));
        if(!hobbyMusic.isSelected()){
            hobbyMusic.click();
        }

        //Select musicSelect = new Select(hobbyMusic);
        //musicSelect.selectByValue("3");

        //upload pic

        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
        uploadPicture.sendKeys("C:\\Users\\Andrei\\IdeaProjects\\MyFirstSeleniumProject\\src\\test\\resources\\TestImage.jpg");
        //uploadPicture.click();

        //current address

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Cluj-Napoca");

        //select state and city

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();





    }


}