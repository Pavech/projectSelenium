package tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.telecomunications.MobilePhoneReplenishmentPage;
import tests.base.BaseTest;

import static constants.Constant.MobileReplenishmentTestData.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {
    @Test
    public void checkIsRedirectToAuth() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
        driver.findElement(buttonWallet).click();
        //basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinimumReplenishmentAmount() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
        driver.findElement(inputPhoneNumber).sendKeys(MOBILE_PAYMENT_PHONE_NUMBER);
        By inputAmount = By.xpath("//input[@data-qa-node='amount']");
        driver.findElement(inputAmount).sendKeys("1");
        By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
        driver.findElement(inputCardFrom).sendKeys(MOBILE_PAYMENT_CARD);
        By inputCardExpFate = By.xpath("//input[@data-qa-node='expiredebitSource']");
        driver.findElement(inputCardExpFate).sendKeys(MOBILE_PAYMENT_CARD_EXP_DATE);
        By inputCardECvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        driver.findElement(inputCardECvv).sendKeys(MOBILE_PAYMENT_CARD_CVV);
        By firstNameSource = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        driver.findElement(firstNameSource).sendKeys(MOBILE_PAYMENT_FIRST_NAME);
        By lastNameSource = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        driver.findElement(lastNameSource).sendKeys(MOBILE_PAYMENT_LAST_NAME);
        By buttonSubmitToTheCard = By.xpath("//button[@data-qa-node='submit']");
        driver.findElement(buttonSubmitToTheCard).click();

    }
}

