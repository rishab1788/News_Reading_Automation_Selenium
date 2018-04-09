package com;

/**
 * Created by Rishabh on 8/6/2017.
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class News_Reading {


    public static void main(String[] args) throws Exception {


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.inshorts.com/en/read");

        for (int j = 0; j < 10; j++) {


            for (int i = 0; i < 10; i++) {


                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("window.scrollBy(0,400)", "");
                Thread.sleep(1000);

            }
            String xp = "//*[@id='load-more-btn']";

            WebElement menu = driver.findElement(By.xpath(xp));
            menu.click();

        }


    }
}

