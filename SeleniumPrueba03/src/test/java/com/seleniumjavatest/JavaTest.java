package com.seleniumjavatest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaTest{
    static WebDriver driver;

    @Test
    public void edgeTest() {
        driver = new EdgeDriver();
        driver.get("http://www.automationpractice.pl/");
        driver.manage().window().maximize();

        driver.findElement(By.id("search_query_top")).sendKeys("dress");
        driver.findElement(By.name("submit_search")).click();

        driver.close();

    }
}