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
import java.lang.String;
import org.openqa.selenium.By;

import io.testproject.proxy.addon.ElementExtensions;
import io.testproject.proxy.addon.io.testproject.addons.element.web.DoubleClickNoJs;

/**
 * This class was automatically generated by TestProject
 * Project: My first Project
 * Test: GoTo_OfferX
 * Generated by: C ANNICCHIARICO (come.annicchiarico@gireve.com)
 * Generated on Thu Aug 13 07:37:46 GMT 2020.
 */
@Test(
    name = "GoTo_OfferX",
    description = "This test was auto generated from steps of the 'Signatures_VerificationGireve' test",
    version = "1.0"
)
public class GoTo_OfferX implements WebTest {
  @Parameter(
      defaultValue = "NomOffre",
      direction = ParameterDirection.INPUT
  )
  public String GoTo_OfferX_stringIdentifiantOffre;

  @Parameter(
      defaultValue = "1",
      direction = ParameterDirection.INPUT
  )
  public String GoTo_OfferX_iOfferListPosition;

  @Parameter(
      defaultValue = "MesOffres/Brouillons",
      direction = ParameterDirection.INPUT
  )
  public String GoTo_OfferX_stringCategory;

  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(15000);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;
    ExecutionResult executionresult;
    String string;
    DoubleClickNoJs doubleClickNoJs;


    // 1. Click 'Place de marché'
    by = By.xpath("/html/body/header/div/div[2]/nav[2]/div/div/div/ul/li[2]/a");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Place de marché'", booleanResult, TakeScreenshotConditionType.Never);

    String menuCategory = GoTo_OfferX_stringCategory.split("/")[0] ;




    if (menuCategory.equals("MesOffres")) {
      // 2. Click 'Mes offres1'
      by = By.xpath("/html/body/header/div/div[2]/nav[2]/div/div/div/ul/li[2]/ul/li[2]/a");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'Mes offres1'", booleanResult, TakeScreenshotConditionType.Never);

      String mesoffresCategory = GoTo_OfferX_stringCategory.split("/")[1] ;

      if (mesoffresCategory.equals("Publiees")) {
        // 3. Click 'Brouillons\n                          ...'
        by = By.xpath("/html/body/div[2]/ul/li[1]/a");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Brouillons\\n                          ...'", booleanResult, TakeScreenshotConditionType.Never);
      } else if (mesoffresCategory.equals("Brouillons")) {
        // 3. Click 'Brouillons\n                          ...'
        by = By.xpath("/html/body/div[2]/ul/li[2]/a");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Brouillons\\n                          ...'", booleanResult, TakeScreenshotConditionType.Never);
      }else if (mesoffresCategory.equals("Archivees")) {
        // 3. Click 'Brouillons\n                          ...'
        by = By.xpath("/html/body/div[2]/ul/li[3]/a");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Archivees\\n                          ...'", booleanResult, TakeScreenshotConditionType.Never);
      }

      // 4. Click 'offer_search_offerSearch'
      by = By.cssSelector("#offer_search_offerSearch");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'offer_search_offerSearch'", booleanResult, TakeScreenshotConditionType.Never);

      // 5. Type '{{GoTo_OfferX_stringIdentifiantOffre}}' in 'offer_search_offerSearch'
      by = By.cssSelector("#offer_search_offerSearch");
      booleanResult = driver.testproject().typeText(by,GoTo_OfferX_stringIdentifiantOffre);
      report.step(String.format("Type '%s' in 'offer_search_offerSearch'",GoTo_OfferX_stringIdentifiantOffre), booleanResult, TakeScreenshotConditionType.Never);

      // 6. Double Click 'FirstAvailableOffer'
      doubleClickNoJs = ElementExtensions.getDoubleClickNoJs();
      by = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[" + GoTo_OfferX_iOfferListPosition + "]/div/div[2]/h2/a");
      executionresult = helper.executeProxy(doubleClickNoJs, by);
      report.step("Double Click 'FirstAvailableOffer'", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);

    } else if (menuCategory.equals("OffresDuMarche")) {
      // 2. Click 'Mes offres1'
      by = By.xpath("/html/body/header/div/div[2]/nav[2]/div/div/div/ul/li[2]/ul/li[1]/a");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'Mes offres1'", booleanResult, TakeScreenshotConditionType.Never);

      // 4. Click 'offer_search_offerSearch'
      by = By.cssSelector("#offer_market_search_offerSearch");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'offer_search_offerSearch'", booleanResult, TakeScreenshotConditionType.Never);

      // 5. Type '{{GoTo_OfferX_stringIdentifiantOffre}}' in 'offer_search_offerSearch'
      by = By.cssSelector("#offer_market_search_offerSearch");
      booleanResult = driver.testproject().typeText(by,GoTo_OfferX_stringIdentifiantOffre);
      report.step(String.format("Type '%s' in 'offer_search_offerSearch'",GoTo_OfferX_stringIdentifiantOffre), booleanResult, TakeScreenshotConditionType.Never);

      // 6. Double Click 'FirstAvailableOffer'
      doubleClickNoJs = ElementExtensions.getDoubleClickNoJs();
      by = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[" + GoTo_OfferX_iOfferListPosition + "]/div/div[2]/h2/a");
      executionresult = helper.executeProxy(doubleClickNoJs, by);
      report.step("Double Click 'FirstAvailableOffer'",  executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);
    }

    
    // 7. Get text from 'Offer Page Header'
    by = By.xpath("/html/body/div[3]/div/div[1]/div[1]/div[1]/h1");
    string = driver.testproject().getText(by);
    report.step("Get text from 'BoxNomDeL'offre'", (string != null) && string.contains(GoTo_OfferX_stringIdentifiantOffre), TakeScreenshotConditionType.Never);

    return ExecutionResult.PASSED;
  }
}
