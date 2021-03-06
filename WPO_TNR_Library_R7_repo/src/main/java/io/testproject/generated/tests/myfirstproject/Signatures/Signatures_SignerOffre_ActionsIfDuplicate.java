package io.testproject.generated.tests.tnrar7onesource;

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

/**
 * This class was automatically generated by TestProject
 * Project: TNRA-R7-OneSource
 * Test: Signatures_SignerOffre_ActionsIfPreexistant
 * Generated by: C ANNICCHIARICO (come.annicchiarico@gireve.com)
 * Generated on Thu Aug 20 14:31:11 GMT 2020.
 */
@Test(
    name = "Signatures_SignerOffre_ActionsIfDuplicate",
    description = "This test was auto generated from steps of the 'Signatures_SignerOffre_NPS_EMP' test",
    version = "1.0"
)
public class Signatures_SignerOffre_ActionsIfDuplicate implements WebTest {
  @Parameter(
      direction = ParameterDirection.INPUT
  )
  public String Signatures_SignerOffre_ActionsIfDuplicate_stringAddressCheckboxXpath;

  @Parameter(
      direction = ParameterDirection.INPUT
  )
  public String Signatures_SignerOffre_ActionsIfDuplicate_stringAddressConfirmXpath;

  @Parameter(
      direction = ParameterDirection.INPUT
  )
  public String Signatures_SignerOffre_ActionsIfDuplicate_boolStopIfDuplicate;

  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(1000);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;

    // 1. Click 'contract-sign-duplicate-modal-checkbox__2116'
    by = By.xpath(Signatures_SignerOffre_ActionsIfDuplicate_stringAddressCheckboxXpath);
    booleanResult = driver.testproject().click(by);
    report.step("Click 'duplicate checkbox'", true, TakeScreenshotConditionType.Never);

    if (booleanResult){
      if (Signatures_SignerOffre_ActionsIfDuplicate_boolStopIfDuplicate.equals('o')) {
        report.step("Error. These Operations already have an existing agreement", false, TakeScreenshotConditionType.Never);
      } else {
        // 2. Click 'Continuer2'
        by = By.xpath(Signatures_SignerOffre_ActionsIfDuplicate_stringAddressConfirmXpath);
        booleanResult = driver.testproject().click(by);
        report.step("Click 'Continuer2'", true, TakeScreenshotConditionType.Never);
      }
    }

    return ExecutionResult.PASSED;
  }
}
