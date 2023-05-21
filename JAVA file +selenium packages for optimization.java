package com.Kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Binary_brains {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/hp/Desktop/Savi%20Jatayu/form1.html");
        String url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
        String pageTitle = driver.getTitle();

        if ("Simple form".equals(pageTitle)) {
            System.out.println("Test Case Passed");
        } else {
            System.out.println("Test Case Failed");
        }

        Thread.sleep(5000);

        String name = generateName();
        String email = generateEmail();
        String password = generatePassword();

        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(name);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/button")).click();

        Thread.sleep(5000);

        String input1 = generateInput();
        String input2 = generateInput();

        driver.findElement(By.xpath("/html/body/section/header/form/input")).sendKeys(input1);
        Thread.sleep(15000);

        driver.findElement(By.xpath("/html/body/section/header/form/input")).sendKeys("b");
        Thread.sleep(20000);
        
        driver.quit();
    }

    private static String generateName() {
        return "Savi";
    }

    private static String generateEmail() {
        return "savi@gmail.com";
    }

    private static String generatePassword() {
        return "Savi123";
    }

    private static String generateInput() {
        return "a";
    }
}
