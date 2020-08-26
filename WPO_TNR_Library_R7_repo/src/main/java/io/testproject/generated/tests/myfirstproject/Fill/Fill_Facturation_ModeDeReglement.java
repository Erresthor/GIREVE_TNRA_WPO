package io.testproject.generated.tests.myfirstproject;

import io.testproject.java.annotations.v2.Parameter;
import io.testproject.java.enums.ParameterDirection;
import io.testproject.java.annotations.v2.Test;
import io.testproject.java.enums.TakeScreenshotConditionType;
import io.testproject.java.sdk.v2.drivers.WebDriver;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import io.testproject.java.sdk.v2.exceptions.FailureException;
import io.testproject.java.sdk.v2.reporters.TestReporter;
import io.testproject.java.sdk.v2.tests.WebTest;
import io.testproject.java.sdk.v2.tests.helpers.WebTestHelper;
import org.openqa.selenium.By;

/**
 * This class was automatically generated by TestProject
 * Project: My first Project
 * Test: Fill_Facturation_ModeDeReglement
 * Generated by: C ANNICCHIARICO (come.annicchiarico@gireve.com)
 * Generated on Mon Aug 10 08:59:37 GMT 2020.
 */
@Test(
    name = "Fill_Facturation_ModeDeReglement",
    description = "This test was auto generated from steps of the 'Fill_Facturation' test",
    version = "1.0"
)
public class Fill_Facturation_ModeDeReglement implements WebTest {
  @Parameter(
    description = "Mode d'acces choisis [CHE,ESP,MAN,VIR]",
    defaultValue = "CHE,ESP,MAN,VIR",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Facturation_stringModeDeReglement;


  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(15000);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;

    String[] modesReglementStringList = Fill_Facturation_stringModeDeReglement.split(",") ;
    int n = modesReglementStringList.length ;
    for (int j = 0; j<n; j++){
      String modeReglementCode = modesReglementStringList[j] ;
      if (modeReglementCode.equals("CHE")) {
        // 2. Click 'UL3'
        by = By.xpath("/html/body/div[2]/div/div/form/div/div[1]/div/div[4]/div[7]/div[2]/span/span[1]/span/ul");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'UL3'", booleanResult, TakeScreenshotConditionType.Never);

        GeneratedUtils.sleep(250) ;

        // 2. Click 'Liste tokens obligatoires'
        by = By.xpath("//*[@id='select2-portal_bundle_appbundle_offer_paymentMethods-results']/li[1]");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Liste tokens obligatoires'", booleanResult, TakeScreenshotConditionType.Never);
      } else if (modeReglementCode.equals("ESP")) {
        // 2. Click 'UL3'
        by = By.xpath("/html/body/div[2]/div/div/form/div/div[1]/div/div[4]/div[7]/div[2]/span/span[1]/span/ul");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'UL3'", booleanResult, TakeScreenshotConditionType.Never);

        GeneratedUtils.sleep(250) ;

        // 2. Click 'Liste tokens obligatoires'
        by = By.xpath("//*[@id='select2-portal_bundle_appbundle_offer_paymentMethods-results']/li[2]");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Liste tokens obligatoires'", booleanResult, TakeScreenshotConditionType.Never);
      } else if (modeReglementCode.equals("MAN")) {
        // 2. Click 'UL3'
        by = By.xpath("/html/body/div[2]/div/div/form/div/div[1]/div/div[4]/div[7]/div[2]/span/span[1]/span/ul");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'UL3'", booleanResult, TakeScreenshotConditionType.Never);

        GeneratedUtils.sleep(250) ;

        // 2. Click 'Liste tokens obligatoires'
        by = By.xpath("//*[@id='select2-portal_bundle_appbundle_offer_paymentMethods-results']/li[3]");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Liste tokens obligatoires'", booleanResult, TakeScreenshotConditionType.Never);
      }else if (modeReglementCode.equals("VIR")) {
        // 2. Click 'UL3'
        by = By.xpath("/html/body/div[2]/div/div/form/div/div[1]/div/div[4]/div[7]/div[2]/span/span[1]/span/ul");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'UL3'", booleanResult, TakeScreenshotConditionType.Never);

        GeneratedUtils.sleep(250) ;

        // 2. Click 'Liste tokens obligatoires'
        by = By.xpath("//*[@id='select2-portal_bundle_appbundle_offer_paymentMethods-results']/li[4]");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Liste tokens obligatoires'", booleanResult, TakeScreenshotConditionType.Never);
      }
    }
    return ExecutionResult.PASSED;
  }
}