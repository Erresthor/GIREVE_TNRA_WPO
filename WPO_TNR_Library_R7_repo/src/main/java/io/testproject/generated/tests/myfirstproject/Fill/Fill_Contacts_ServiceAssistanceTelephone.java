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
import io.testproject.proxy.addon.actions.ClickOnListItemWhichContainsText;
import jdk.internal.loader.Resource;
import org.openqa.selenium.By;

/**
 * This class was automatically generated by TestProject
 * Project: My first Project
 * Test: Fill_Contacts_ServiceAssistance
 * Generated by: C ANNICCHIARICO (come.annicchiarico@gireve.com)
 * Generated on Tue Aug 11 08:04:40 GMT 2020.
 */
@Test(
    name = "Fill_Contacts_ServiceAssistanceTelephone",
    description = "This test was auto generated from steps of the 'CreerOffre' test",
    version = "1.0"
)
public class Fill_Contacts_ServiceAssistanceTelephone implements WebTest {

  @Parameter(
    description = "Service Assistance Phone ? [o/n]",
    defaultValue = "o",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_boolPhoneAssistance ;

  @Parameter(
    description = "Numero de Telephone utilise",
    defaultValue = "0000000000",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_stringPhoneNumber ;

  @Parameter(
    description = "Ouvert 24h/24 ? [o/n]",
    defaultValue = "o",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_boolPermanentPhoneAssistance ;

  @Parameter(
    description = "Heure AM Start",
    defaultValue = "00h00",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_stringPhoneOpeningHourMorningStart ;

  @Parameter(
    description = "Heure AM End",
    defaultValue = "12h00",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_stringPhoneOpeningHourMorningEnd ;

  @Parameter(
    description = "Heure PM Start",
    defaultValue = "12h00",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_stringPhoneOpeningHourAfternoonStart ;

  @Parameter(
    description = "Heure PM End",
    defaultValue = "00h00",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_stringPhoneOpeningHourAfternoonEnd ;

  @Parameter(
    description = "Jours de la semaine de dispo",
    defaultValue = "Lun,Mar,Mer,Jeu,Ven,Sam,Dim",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Contacts_stringPhoneDaysOfAvailability ;

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



    if (Fill_Contacts_boolPhoneAssistance.equals(("o"))) {
      // 1. Click 'I12'
      by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[1]/div[2]/label/i");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'I12'", booleanResult, TakeScreenshotConditionType.Never);

      // 3. Type 'tel' in 'portal_bundle_appbundle_offer_phoneNumber'
      by = By.cssSelector("#portal_bundle_appbundle_offer_phoneNumber");
      booleanResult = driver.testproject().typeText(by,Fill_Contacts_stringPhoneNumber);
      report.step("Type 'tel' in 'portal_bundle_appbundle_offer_phoneNumber'", booleanResult, TakeScreenshotConditionType.Never);

      if (Fill_Contacts_boolPermanentPhoneAssistance.equals("o")) {
        // 5. Click 'Ouvert 24/7'
        by = By.xpath("//*[@id='portal_bundle_appbundle_offer_phoneOpeningTime']/div[1]/label");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Ouvert 24/7'", booleanResult, TakeScreenshotConditionType.Never);
      } else if (Fill_Contacts_boolPermanentPhoneAssistance.equals("n")) {
        // 4. Click 'Horaires d'ouverture sp&eacute;cifiqu...'
        by = By.xpath("//*[@id='portal_bundle_appbundle_offer_phoneOpeningTime']/div[2]/label");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Horaires d'ouverture sp&eacute;cifiqu...'", booleanResult, TakeScreenshotConditionType.Never);

        // 10. Click 'add-phone-opening-hours-link'
        by = By.cssSelector("#add-phone-opening-hours-link");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'add-phone-opening-hours-link'", booleanResult, TakeScreenshotConditionType.Never);

        String[] days = Fill_Contacts_stringPhoneDaysOfAvailability.split(",") ;
        int n = days.length ;
        for (int j = 0; j<n; j++){
          String day = days[j] ;
          
          
          // 37. Click 'day'
          if (day.equals("Lun")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[3]/ul/li[1]/div/div/div[1]/div/label[1]/span");
          } else if (day.equals("Mar")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[3]/ul/li[1]/div/div/div[1]/div/label[2]/span");
          } else if (day.equals("Mer")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[3]/ul/li[1]/div/div/div[1]/div/label[3]/span");
          } else if (day.equals("Jeu")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[3]/ul/li[1]/div/div/div[1]/div/label[4]/span");
          } else if (day.equals("Ven")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[3]/ul/li[1]/div/div/div[1]/div/label[5]/span");
          } else if (day.equals("Sam")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[3]/ul/li[1]/div/div/div[1]/div/label[6]/span");
          }else if (day.equals("Sun")) {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[3]/ul/li[1]/div/div/div[1]/div/label[7]/span");
          } else {
            by = By.xpath("/html/body/div[2]/div/div/form/div[1]/div[1]/div/div[3]/ul/li[1]/div/div/div[1]/div/label[0]/span");
          }
          booleanResult = driver.testproject().click(by);
          report.step("Click '"+ day+"'", true, TakeScreenshotConditionType.Never);
        }
        // 39. Click 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_morningStart'
        by = By.cssSelector("#portal_bundle_appbundle_offer_phoneOpeningHours_0_morningStart");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'portal_bundle_appbundle_offer_phoneOpeningHours_0_morningStart'", booleanResult, TakeScreenshotConditionType.Never);
    
        // 40. Select options in 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_morningStart' with text '[NONE]'
        selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText(Fill_Contacts_stringPhoneOpeningHourMorningStart);
        by = By.cssSelector("#portal_bundle_appbundle_offer_phoneOpeningHours_0_morningStart");
        executionresult = helper.executeProxy(selectOptionbyVisibleText, by);
        report.step("Select options in 'portal_bundle_appbundle_offer_phoneOpeningHours_0_morningStart' with text 'hourMorningStart'", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);

        // 39. Click 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_morningStart'
        by = By.cssSelector("#portal_bundle_appbundle_offer_phoneOpeningHours_0_morningEnd");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'portal_bundle_appbundle_offer_phoneOpeningHours_0_morningEnd'", booleanResult, TakeScreenshotConditionType.Never);
    
        // 40. Select options in 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_morningEnd' with text '[NONE]'
        selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText(Fill_Contacts_stringPhoneOpeningHourMorningEnd);
        by = By.cssSelector("#portal_bundle_appbundle_offer_phoneOpeningHours_0_morningEnd");
        executionresult = helper.executeProxy(selectOptionbyVisibleText, by);
        report.step("Select options in 'portal_bundle_appbundle_offer_phoneOpeningHours_0_morningEnd' with text 'hourMorningEnd'", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);



        // 39. Click 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_afternoonStart'
        by = By.cssSelector("#portal_bundle_appbundle_offer_phoneOpeningHours_0_afternoonStart");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'portal_bundle_appbundle_offer_phoneOpeningHours_0_afternoonStart'", booleanResult, TakeScreenshotConditionType.Never);
    
        // 40. Select options in 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_afternoonStart' with text '[NONE]'
        selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText(Fill_Contacts_stringPhoneOpeningHourAfternoonStart);
        by = By.cssSelector("#portal_bundle_appbundle_offer_phoneOpeningHours_0_afternoonStart");
        executionresult = helper.executeProxy(selectOptionbyVisibleText, by);
        report.step("Select options in 'portal_bundle_appbundle_offer_phoneOpeningHours_0_afternoonStart' with text 'hourafternoonStart'", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);


        // 39. Click 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_afternoonEnd'
        by = By.cssSelector("#portal_bundle_appbundle_offer_phoneOpeningHours_0_afternoonEnd");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'portal_bundle_appbundle_offer_phoneOpeningHours_0_afternoonEnd'", booleanResult, TakeScreenshotConditionType.Never);
    
        // 40. Select options in 'portal_bundle_associated_service_form_pricing_0_serviceOpeningHours_afternoonEnd' with text '[NONE]'
        selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText(Fill_Contacts_stringPhoneOpeningHourAfternoonEnd);
        by = By.cssSelector("#portal_bundle_appbundle_offer_phoneOpeningHours_0_afternoonEnd");
        executionresult = helper.executeProxy(selectOptionbyVisibleText, by);
        report.step("Select options in 'portal_bundle_appbundle_offer_phoneOpeningHours_0_afternoonEnd' with text 'hourafternoonEnd'", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);
      }
    }
    return ExecutionResult.PASSED;
  }
}
