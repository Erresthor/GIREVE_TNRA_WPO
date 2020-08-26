package io.testproject.generated.tests.myfirstproject;
import io.testproject.java.annotations.v2.Parameter;
import io.testproject.java.annotations.v2.Test;
import io.testproject.java.enums.ParameterDirection;
import io.testproject.java.enums.TakeScreenshotConditionType;
import io.testproject.java.sdk.v2.drivers.WebDriver;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import io.testproject.java.sdk.v2.exceptions.FailureException;
import io.testproject.java.sdk.v2.reporters.TestReporter;
import io.testproject.java.sdk.v2.tests.WebTest;
import io.testproject.java.sdk.v2.tests.helpers.WebTestHelper;
import io.testproject.proxy.addon.WebListOperations;
import io.testproject.proxy.addon.actions.ClickOnListItemWhichContainsText;
import java.lang.String;
import org.openqa.selenium.By;

/**
 * This class was automatically generated by TestProject
 * Project: My first Project
 * Test: FillOutOffer_General
 * Generated by: C ANNICCHIARICO (come.annicchiarico@gireve.com)
 * Generated on Tue Jul 28 13:25:52 GMT 2020.
 */
@Test(
    name = "Fill_General_IndicatorVisibilityOffer",
    description = "Fill out the visibility infos about an offer.",
    version = "1.0"
)
public class Fill_General_IndicatorVisibilityOffer implements WebTest {
    @Parameter(
        defaultValue = "EVR",
        direction = ParameterDirection.INPUT
    )
    public String Fill_General_IndicatorVisibilityOffer_stringOfferVisibility;

  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(15000);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;
    //ClickOnListItemWhichContainsText clickOnListItemWhichContainsText;
    
    if (Fill_General_IndicatorVisibilityOffer_stringOfferVisibility.equals("EVR")) {
        // 27. Click 'portal_bundle_appbundle_offer_showAvailabilityIndicators_3'
        by = By.cssSelector("#portal_bundle_appbundle_offer_showAvailabilityIndicators_3");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Visiblite - Tout le monde'", booleanResult, TakeScreenshotConditionType.Never);
    } else if (Fill_General_IndicatorVisibilityOffer_stringOfferVisibility.equals("UGE")) {
        // 25. Click 'portal_bundle_appbundle_offer_showAvailabilityIndicators_1'
        by = By.cssSelector("#portal_bundle_appbundle_offer_showAvailabilityIndicators_1");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Visiblite - Gerants'", booleanResult, TakeScreenshotConditionType.Never);
    } else if (Fill_General_IndicatorVisibilityOffer_stringOfferVisibility.equals("UGP")) {
        // 26. Click 'portal_bundle_appbundle_offer_showAvailabilityIndicators_2'
        by = By.cssSelector("#portal_bundle_appbundle_offer_showAvailabilityIndicators_2");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Visiblite - Gerants et partenaires'", booleanResult, TakeScreenshotConditionType.Never);
    } else if (Fill_General_IndicatorVisibilityOffer_stringOfferVisibility.equals("NOB")) {
         // 24. Click 'portal_bundle_appbundle_offer_showAvailabilityIndicators_0'
        by = By.cssSelector("#portal_bundle_appbundle_offer_showAvailabilityIndicators_0");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Visiblite - Personne'", booleanResult, TakeScreenshotConditionType.Never);
    } else {
        booleanResult = false ;
        report.step("Choix de la visibilite de l'Offre","Yes","Erreur - Choississez un identificateur valide (EVR, UGO,UGP, NOB).", booleanResult, TakeScreenshotConditionType.Always);
    }
    return ExecutionResult.PASSED;
  }
}