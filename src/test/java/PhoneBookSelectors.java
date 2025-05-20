import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class PhoneBookSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        FirstTest.pause(5);//вызов из класса метода пауза
        WebElement btnHome = driver.findElement(By.cssSelector("[href=\"/home\"]"));
        btnHome.click();
        pause(3);
        WebElement btnAbout = driver.findElement(By.cssSelector("[href=\"/about\"]"));
        btnAbout.click();
        pause(3);
        WebElement btnLoginHeader = driver.findElement(By.cssSelector("[href='/login']"));
        btnLoginHeader.click();
        pause(3);

        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));
        inputEmail.sendKeys("Rimmavaisbrod@gmail.com");
        pause(3);
        WebElement inputPassword = driver.findElement(By.cssSelector("input[name='password']"));
        inputPassword.sendKeys("Vaisbrod@12345!");
        WebElement btnLogininPageLogin = driver.findElement(By.cssSelector("[name='login']"));
        btnLogininPageLogin.click();


    }
    public static void pause (int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
