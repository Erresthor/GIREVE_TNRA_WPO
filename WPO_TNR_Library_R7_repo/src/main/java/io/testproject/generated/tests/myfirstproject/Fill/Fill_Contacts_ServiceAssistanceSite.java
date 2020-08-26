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
import io.testproject.proxy.addon.WebExtensions;
import io.testproject.proxy.addon.io.testproject.addons.web.element.select.SelectOptionbyVisibleText;
import io.testproject.proxy.addon.WebListOperations;
import io.testproject.proxy.addon.actions.ClickOnListItemWhichContainsText;
import jdk.internal.loader.Resource;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class was automatically generated by TestProject
 * Project: My first Project
 * Test: Fill_Contacts_ServiceAssistanceSite
 * Generated by: C ANNICCHIARICO (come.annicchiarico@gireve.com)
 * Generated on Tue Aug 11 08:04:40 GMT 2020.
 */
@Test(
    name = "Fill_Contacts_ServiceAssistanceSite",
    description = "This test was auto generated from steps of the 'CreerOffre' test",
    version = "1.0"
)
public class Fill_Contacts_ServiceAssistanceSite implements WebTest {

  @Parameter(
    description = "Service Assistance Site ? [o/n]",
    defaultValue = "o",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_boolSiteAssistance ;

  @Parameter(
    description = "Valeur temps délai d'intervention",
    defaultValue = "1",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_valueDelaiInterventionSite ;

  @Parameter(
    description = "Unite délai d'intervention",
    defaultValue = "heures",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_iDelaiInterventionSiteUnit ;

  @Parameter(
    description = "Ouvert 24h/24 ? [o/n]",
    defaultValue = "o",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_boolPermanentSiteAssistance ;

  @Parameter(
    description = "Heure AM Start",
    defaultValue = "00h00",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_stringSiteOpeningHourMorningStart ;

  @Parameter(
    description = "Heure AM End",
    defaultValue = "12h00",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_stringSiteOpeningHourMorningEnd ;

  @Parameter(
    description = "Heure PM Start",
    defaultValue = "12h00",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_stringSiteOpeningHourAfternoonStart ;

  @Parameter(
    description = "Heure PM End",
    defaultValue = "00h00",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_stringSiteOpeningHourAfternoonEnd ;

  @Parameter(
    description = "Jours de la semaine de dispo",
    defaultValue = "Lun,Mar,Mer,Jeu,Ven,Sam,Dim",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_stringSiteDaysOfAvailability ;

  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(15000);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;
    ClickOnListItemWhichContainsText clickOnListItemWhichContainsText;
    SelectOptionbyVisibleText selectOptionbyVisibleText;
    ExecutionResult executionresult;



    if (Fill_Contacts_boolSiteAssistance.equals(("o"))) {
      // 31. Click 'I13'
      by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[4]/div[2]/label/i");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'I13'", booleanResult, TakeScreenshotConditionType.Never);

      // 53. Type 'valueDelaiInterventionSite' in 'portal_bundle_appbundle_offer_onSiteAssistanceResponseTimeValue'
      by = By.cssSelector("#portal_bundle_appbundle_offer_onSiteAssistanceResponseTimeValue");
      booleanResult = driver.testproject().typeText(by,Fill_Contacts_valueDelaiInterventionSite);
      report.step("Type 'valueDelaiInterventionSite' in 'portal_bundle_appbundle_offer_onSiteAssistanceResponseTimeValue'", booleanResult, TakeScreenshotConditionType.Never);

      // 54. Click 'portal_bundle_appbundle_offer_onSiteAssistanceResponseTimeUnit'
      by = By.cssSelector("#portal_bundle_appbundle_offer_onSiteAssistanceResponseTimeUnit");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'portal_bundle_appbundle_offer_onSiteAssistanceResponseTimeUnit'", booleanResult, TakeScreenshotConditionType.Never);

      // 4. Clicks on a list item based on text
      by = By.cssSelector("#portal_bundle_appbundle_offer_onSiteAssistanceResponseTimeUnit");
      booleanResult = driver.testproject().selectAnOptionByValue(by,Fill_Contacts_iDelaiInterventionSiteUnit);
      report.step("Clicks on a list item based on text", booleanResult,TakeScreenshotConditionType.Never);

      if (Fill_Contacts_boolPermanentSiteAssistance.equals("o")) {
        // 5. Click 'Ouvert 24/7'
        by = By.xpath("//*[@id='portal_bundle_appbundle_offer_localOpeningTime']/div[1]/label");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Ouvert 24/7'", booleanResult, TakeScreenshotConditionType.Never);
      } else if (Fill_Contacts_boolPermanentSiteAssistance.equals("n")) {
        // 4. Click 'Horaires d'ouverture sp&eacute;cifiqu...'
        by = By.xpath("//*[@id='portal_bundle_appbundle_offer_localOpeningTime']/div[2]/label");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Horaires d'ouverture sp&eacute;cifiqu...'", booleanResult, TakeScreenshotConditionType.Never);

        // 10. Click 'add-site-opening-hours-link'
        by = By.cssSelector(".add-local-opening-hours-link");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'add-local-opening-hours-link'", booleanResult, TakeScreenshotConditionType.Never);

        String[] days = Fill_Contacts_stringSiteDaysOfAvailability.split(",") ;
        int n = days.length ;
        for (int j = 0; j<n; j++){
          String day = days[j] ;
          // 37. Click 'day'
          if (day.equals("Lun")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[6]/ul/li[1]/div/div/div[1]/div/label[1]/span");
          } else if (day.equals("Mar")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[6]/ul/li[1]/div/div/div[1]/div/label[2]/span");
          } else if (day.equals("Mer")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[6]/ul/li[1]/div/div/div[1]/div/label[3]/span");
          } else if (day.equals("Jeu")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[6]/ul/li[1]/div/div/div[1]/div/label[4]/span");
          } else if (day.equals("Ven")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[6]/ul/li[1]/div/div/div[1]/div/label[5]/span");
          } else if (day.equals("Sam")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[6]/ul/li[1]/div/div/div[1]/div/label[6]/span");
          }else if (day.equals("Sun")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[6]/ul/li[1]/div/div/div[1]/div/label[7]/span");
          } else {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[6]/ul/li[1]/div/div/div[1]/div/label[0]/span");
          }
          booleanResult = driver.testproject().click(by);
          report.step("Click '"+ day+"'", true, TakeScreenshotConditionType.Never);
          // // 32. Click 'Lun'
          // if (day.equals("Lun")) {
          //   by = By.xpath("//*[@id='phone-opening-portal_bundle_appbundle_offer_phoneOpeningTime']/ul/li[1]/div/div/div[1]/div/label[1]/span");
          //   booleanResult = driver.testproject().click(by);
          //   report.step("Click '"+ day+"'", booleanResult, TakeScreenshotConditionType.Never);
          // } else if (day.equals("Mar")) {
          //   by = By.xpath("//*[@id='phone-opening-portal_bundle_appbundle_offer_phoneOpeningTime']/ul/li[1]/div/div/div[1]/div/label[2]/span");
          //   booleanResult = driver.testproject().click(by);
          //   report.step("Click '"+ day+"'", booleanResult, TakeScreenshotConditionType.Never);
            
          // }else if (day.equals("Mer")) {
          //   by = By.xpath("//*[@id='phone-opening-portal_bundle_appbundle_offer_phoneOpeningTime']/ul/li[1]/div/div/div[1]/div/label[3]/span");
          //   booleanResult = driver.testproject().click(by);
          //   report.step("Click '"+ day+"'", booleanResult, TakeScreenshotConditionType.Never);
            
          // }else if (day.equals("Jeu")) {
          //   by = By.xpath("//*[@id='phone-opening-portal_bundle_appbundle_offer_phoneOpeningTime']/ul/li[1]/div/div/div[1]/div/label[4]/span");
          //   booleanResult = driver.testproject().click(by);
          //   report.step("Click '"+ day+"'", booleanResult, TakeScreenshotConditionType.Never);
            
          // }else if (day.equals("Ven")) {
          //   by = By.xpath("//*[@id='phone-opening-portal_bundle_appbundle_offer_phoneOpeningTime']/ul/li[1]/div/div/div[1]/div/label[5]/span");
          //   booleanResult = driver.testproject().click(by);
          //   report.step("Click '"+ day+"'", booleanResult, TakeScreenshotConditionType.Never);
            
          // }else if (day.equals("Sam")) {
          //   by = By.xpath("//*[@id='phone-opening-portal_bundle_appbundle_offer_phoneOpeningTime']/ul/li[1]/div/div/div[1]/div/label[6]/span");
          //   booleanResult = driver.testproject().click(by);
          //   report.step("Click '"+ day+"'", booleanResult, TakeScreenshotConditionType.Never);
            
          // }else if (day.equals("Dim")) {
          //   by = By.xpath("//*[@id='phone-opening-portal_bundle_appbundle_offer_phoneOpeningTime']/ul/li[1]/div/div/div[1]/div/label[7]/span");
          //   booleanResult = driver.testproject().click(by);
          //   report.step("Click '"+ day+"'", booleanResult, TakeScreenshotConditionType.Never);
        }
        // 39. Click 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_morningStart'
        by = By.cssSelector("#portal_bundle_appbundle_offer_localOpeningHours_0_morningStart");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'portal_bundle_appbundle_offer_localOpeningHours_0_morningStart'", booleanResult, TakeScreenshotConditionType.Never);
    
        // 40. Select options in 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_morningStart' with text '[NONE]'
        selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText(Fill_Contacts_stringSiteOpeningHourMorningStart);
        by = By.cssSelector("#portal_bundle_appbundle_offer_localOpeningHours_0_morningStart");
        executionresult = helper.executeProxy(selectOptionbyVisibleText, by);
        report.step("Select options in 'portal_bundle_appbundle_offer_localOpeningHours_0_morningStart' with text 'hourMorningStart'", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);
    


        // 39. Click 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_morningStart'
        by = By.cssSelector("#portal_bundle_appbundle_offer_localOpeningHours_0_morningEnd");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'portal_bundle_appbundle_offer_localOpeningHours_0_morningEnd'", booleanResult, TakeScreenshotConditionType.Never);
    
        // 40. Select options in 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_morningEnd' with text '[NONE]'
        selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText(Fill_Contacts_stringSiteOpeningHourMorningEnd);
        by = By.cssSelector("#portal_bundle_appbundle_offer_localOpeningHours_0_morningEnd");
        executionresult = helper.executeProxy(selectOptionbyVisibleText, by);
        report.step("Select options in 'portal_bundle_appbundle_offer_localOpeningHours_0_morningEnd' with text 'hourMorningEnd'", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);



        // 39. Click 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_afternoonStart'
        by = By.cssSelector("#portal_bundle_appbundle_offer_localOpeningHours_0_afternoonStart");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'portal_bundle_appbundle_offer_localOpeningHours_0_afternoonStart'", booleanResult, TakeScreenshotConditionType.Never);
    
        // 40. Select options in 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_afternoonStart' with text '[NONE]'
        selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText(Fill_Contacts_stringSiteOpeningHourAfternoonStart);
        by = By.cssSelector("#portal_bundle_appbundle_offer_localOpeningHours_0_afternoonStart");
        executionresult = helper.executeProxy(selectOptionbyVisibleText, by);
        report.step("Select options in 'portal_bundle_appbundle_offer_localOpeningHours_0_afternoonStart' with text 'hourafternoonStart'", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);



        // 39. Click 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_afternoonEnd'
        by = By.cssSelector("#portal_bundle_appbundle_offer_localOpeningHours_0_afternoonEnd");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'portal_bundle_appbundle_offer_localOpeningHours_0_afternoonEnd'", booleanResult, TakeScreenshotConditionType.Never);
    
        // 40. Select options in 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_afternoonEnd' with text '[NONE]'
        selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText(Fill_Contacts_stringSiteOpeningHourAfternoonEnd);
        by = By.cssSelector("#portal_bundle_appbundle_offer_localOpeningHours_0_afternoonEnd");
        executionresult = helper.executeProxy(selectOptionbyVisibleText, by);
        report.step("Select options in 'portal_bundle_appbundle_offer_localOpeningHours_0_afternoonEnd' with text 'hourafternoonEnd'", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);
      }

    }
    return ExecutionResult.PASSED;

  }
}