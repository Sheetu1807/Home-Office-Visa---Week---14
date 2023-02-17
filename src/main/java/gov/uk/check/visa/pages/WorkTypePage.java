package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static gov.uk.check.visa.browserfactory.ManageBrowser.driver;

public class WorkTypePage extends Utility {

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "response-0")
    WebElement healthCare;


    public void selectHealthcare() {
        clickOnElement(healthCare);
    }
}