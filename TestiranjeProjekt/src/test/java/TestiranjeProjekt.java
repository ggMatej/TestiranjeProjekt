import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestiranjeProjekt {
    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;
    //Declare a test URL variable
    public String testURL = "https://www.saucedemo.com/";
    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        //Create a new ChromeDriver
        driver = new ChromeDriver();
        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
    }
    @Test
    public void login() throws InterruptedException {
        //driver.manage().window().maximize();
        WebElement username= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret_sauce");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]"));
        loginBtn.click();
        Thread.sleep(3000);
    }
    @Test
    public void showAbout() throws InterruptedException {
        WebElement username= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        username.click();
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.click();
        password.sendKeys("secret_sauce");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]"));
        loginBtn.click();
        Thread.sleep(3000);
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button"));
        menu.click();
        Thread.sleep(1000);
        WebElement about= driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]"));
        about.click();
        Thread.sleep(1000);
    }
    @Test
    public void logout() throws InterruptedException {
        WebElement username= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        username.click();
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.click();
        password.sendKeys("secret_sauce");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]"));
        loginBtn.click();
        Thread.sleep(3000);
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button"));
        menu.click();
        Thread.sleep(1500);
        WebElement logoutbutton = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        logoutbutton.click();
        Thread.sleep(2000);

    }
    @Test
    public void addToCart() throws InterruptedException {
        WebElement username= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        username.click();
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.click();
        password.sendKeys("secret_sauce");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]"));
        loginBtn.click();
        Thread.sleep(3000);
        WebElement picture = driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img"));
        picture.click();
        Thread.sleep(1500);
        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
        addToCart.click();
        WebElement back = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button"));
        back.click();
        Thread.sleep(1500);

    }
    @Test
    public void removingItemsFromCart() throws InterruptedException {

        WebElement username= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret_sauce");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]"));
        loginBtn.click();
        Thread.sleep(3000);
        WebElement addToCart1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
        addToCart1.click();
        WebElement addToCart2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button"));
        addToCart2.click();
        Thread.sleep(1500);
        //REMOVING FROM CART
        addToCart1.click();
        addToCart2.click();
        Thread.sleep(1500);
    }

    //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest() {
        //Close browser and end the session
        driver.quit();
    }
}
