package lt_techin_RobertasB;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v119.css.model.Value;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.Name;

public class MainPage extends PageSetings {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".cart-content-btn .btn-primary")
    WebElement proceed;
    @FindBy(css = "[data-button-action]")
    WebElement cart;
    @FindBy(css = "[aria-label] [value='4']")
    WebElement sizeTipeXL;
    @FindBy(css = "[aria-label] [value='2']")
    WebElement sizeTipeM;
    @FindBy(css = "[aria-label='Size']")
    WebElement size;

    @FindBy(css = ".show .btn-secondary")
    WebElement cancel;

    @FindBy(css = ".wishlist-button-product")
    WebElement wishButton;
    @FindBy(css = "input[name='s']")
    WebElement imputWindow;

    @FindBy(css = "[content='http\\:\\/\\/192\\.168\\.89\\.19\\/women\\/2-9-brown-bear-printed-sweater\\.html\\#\\/1-size-s']")
    WebElement sweater;
    @FindBy(css = "[content='http\\:\\/\\/192\\.168\\.89\\.19\\/men\\/1-1-hummingbird-printed-t-shirt\\.html\\#\\/1-size-s\\/8-color-white']")

    WebElement tShirt;

    @FindBy(css = "[href='\\/\\/192\\.168\\.89\\.19\\/cart\\?action\\=show'] .hidden-sm-down")
    WebElement fullCart;

    public void clickFullCart(){
        fullCart.click();
    }
    public void clickSweater(){
        sweater.click();
    }
    public void clickTShirt(){
        tShirt.click();
    }
    public void clickWishButton() {

        wishButton.click();
    }

    public void searcImputWindow(String name) {
        imputWindow.sendKeys(name);
    }
    public void enterKey(){
        imputWindow.sendKeys(Keys.ENTER);

    }
    public void clickCacel() {

        cancel.click();
    }
    public void clickSize() {

        size.click();
    }
    public void clickSizeTipeXL() {

        sizeTipeXL.click();
    }
    public void clickSizeTipeM() {

        sizeTipeM.click();
    }
    public void clickCart() {

        cart.click();
    }
    public void clickProceed() {

        proceed.click();
    }
}
