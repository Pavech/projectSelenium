package pages.telecomunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    public  MobilePhoneReplenishmentPage(WebDriver driver){
        super(driver);
    }

    private final  By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
    private final  By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final  By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final  By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSourcer']");
    private final  By inputCardExpFate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final  By inputCardECvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final  By buttonSubmitToTheCard = By.xpath("//button[@data-qa-node='submit']");


    public MobilePhoneReplenishmentPage selectCardFromWallet(){
        driver.findElement(buttonWallet).click();
        return this;
    }
    public MobilePhoneReplenishmentPage enterPhoneNumber(String number){
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }
    public MobilePhoneReplenishmentPage enterAmount(String amount){
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardFrom(String card){
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate){
        driver.findElement(inputCardExpFate).sendKeys(expDate);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCvv(String cvv){
        driver.findElement(inputCardECvv).sendKeys(cvv);
        return this;
    }
    public MobilePhoneReplenishmentPage submitToTheCard(){
        driver.findElement(buttonSubmitToTheCard).click();
        return this;
    }


}
