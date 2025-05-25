import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBook_ILCarroXPath {
    WebDriver driver = new ChromeDriver();

    @Test
    public void loginPhoneBookPositiveTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnLoginHeader = driver.findElement(By.xpath("//a[text()='LOGIN']"));
        btnLoginHeader.click();
        WebElement inputEmail1 = driver.findElement(By.xpath("//input[@name='email']"));
        inputEmail1.sendKeys("RimmiOgulchansk@gmail.com");
        pause(3);
        WebElement inputPassword1 = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        inputPassword1.sendKeys("Password@12345!");
        WebElement btnloginForm = driver.findElement(By.xpath("//form/button[1]"));
        btnloginForm.click();
        driver.quit();


    }


    @Test
    public void ILCarroXPath(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnSignUp = driver.findElement(By.xpath("//a[text()=' Sign up ']"));
        btnSignUp.click();
        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        inputName.sendKeys("Rimma");
        WebElement inputLastName = driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
        inputLastName.sendKeys("Ogulchanskaia");
        WebElement inputEmail = driver.findElement(By.xpath("//form/div[3]/input"));
        inputEmail.sendKeys("rimmiogulchanskaia123@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//form/div[4]/input"));
        inputPassword.sendKeys("Rimma@123456!");
        //WebElement checkBox = driver.findElement(By.xpath("//button[@text()='Y’alla!']"));
        WebElement checkbox = driver.findElement(By.id("terms-of-use"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
        //checkbox.click();
        //driver.navigate().back();
        WebElement btnYalla = driver.findElement(By.xpath("//button[text()='Y’alla!']"));
        btnYalla.click();
        pause(3);
        driver.get("https://ilcarro.web.app/search");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement btnLogIN = driver.findElement(By.xpath("//a[text()=' Log in ']"));
        btnLogIN.click();
        WebElement inputEmailLogIN = driver.findElement(By.xpath("//input[@id='email']"));
        inputEmailLogIN.sendKeys("rimmiogulchanskaia123@gmail.com");
        WebElement inputPasswordLogIN = driver.findElement(By.xpath("//input[@id='password']"));
        inputPasswordLogIN.sendKeys("Rimma@123456!");
        WebElement btnYalla2 = driver.findElement(By.xpath("//button[@type='submit']"));
        btnYalla2.click();
        driver.close();







    }


    @Test
    public void xpathTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement div = driver.findElement(By.xpath("//div[@id='root']"));
        System.out.println(div.getText());
        pause(2);
        WebElement btnAbout = driver.findElement(By.xpath("//a[text()='ABOUT']"));
        String str = btnAbout.getAttribute("href");//возвращает значение атрибута
        System.out.println(str);
        WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        btnLogin.click();
        pause(3);
        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.sendKeys("RimmiOgulchansk@gmail.com");
        pause(3);
        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='password']"));
        inputPassword.sendKeys("Password@12345!");
        pause(3);
        WebElement btnReg = driver.findElement(By.xpath("//*[text()='Registration']"));
        btnReg.click();
        pause(3);
        WebElement btnSighOut = driver.findElement(By.xpath("//*[text()='Sign Out']"));
        btnSighOut.click();
        WebElement inputEmail2 = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail2.sendKeys("RimmiOgulchansk@gmail.com");
        pause(3);
        WebElement inputPassword2 = driver.findElement(By.xpath("//*[@name='password']"));
        inputPassword2.sendKeys("Password@12345!");
        pause(3);
        WebElement btnLogIn = driver.findElement(By.xpath("//button[@name='login']"));
        btnLogIn.click();


        //driver.quit();








    }
    public static void pause (int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
