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
 * Test: Fill_Confirmation
 * Generated by: C ANNICCHIARICO (come.annicchiarico@gireve.com)
 * Generated on Tue Aug 11 12:02:34 GMT 2020.
 */
@Test(
    name = "Fill_Confirmation",
    description = "This test was auto generated from steps of the 'CreerOffre' test",
    version = "1.0"
)
public class Fill_Confirmation implements WebTest {
  @Parameter(
    description = "Offre pre signee (PS) ou non pre signee (NPS)",
    defaultValue = "PS",
    direction = ParameterDirection.INPUT
  )
  public String Fill_Confirmation_stringSignatureType ;

  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(15000);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;

    if (Fill_Confirmation_stringSignatureType.equals("PS")) {
      // 3. Click 'portal_bundle_appbundle_offer_preSignature_0'
      by = By.cssSelector("#portal_bundle_appbundle_offer_preSignature_0");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'portal_bundle_appbundle_offer_preSignature_0'", booleanResult, TakeScreenshotConditionType.Never);
    } else if (Fill_Confirmation_stringSignatureType.equals("NPS")) {
      // 4. Click 'portal_bundle_appbundle_offer_preSignature_1'
      by = By.cssSelector("#portal_bundle_appbundle_offer_preSignature_1");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'portal_bundle_appbundle_offer_preSignature_1'", booleanResult, TakeScreenshotConditionType.Never);
    }
    return ExecutionResult.PASSED;
  }
}
