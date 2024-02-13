package lt_techin_RobertasB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageSetings {
    WebDriver driver;
    public PageSetings (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

}
