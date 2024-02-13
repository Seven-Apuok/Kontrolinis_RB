package lt_techin_RobertasB;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.Duration;

public class SetingsTest {

    protected WebDriver driver;
    String givenUrl = "http://192.168.89.19/";
    File file=new File(System.getProperty("user.dir")+"\\RB_PrestaShop\\products.csv");
    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(givenUrl);
    }

//    @AfterEach
//    void tearDown() {
//
//        driver.quit();
//    }
}

