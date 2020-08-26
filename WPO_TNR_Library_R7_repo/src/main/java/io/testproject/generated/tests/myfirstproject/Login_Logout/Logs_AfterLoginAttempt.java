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

/**
 * This class was automatically generated by TestProject
 * Project: My first Project
 * Test: LoginWPO
 * Generated by: C ANNICCHIARICO (come.annicchiarico@gireve.com)
 * Generated on Tue Jul 28 08:18:05 GMT 2020.
 */
@Test(
    name = "Logs_AfterLoginAttempt",
    description = "Deals with all the necessary actions when first accessing the Gireve Connect-Place",
    version = "1.0"
)
public class Logs_AfterLoginAttempt implements WebTest {
  @Parameter(
      description = "Auto generated application URL parameter",
      defaultValue = "https://r7-connect-place.gireve.com/login/",
      direction = ParameterDirection.INPUT
  )
  public String ApplicationURL;

  @Parameter(
      description = "Password for WPO Connection (This was a SECRET parameter and therefore its value is empty)",
      direction = ParameterDirection.INPUT
  )
  public String Logs_Password;

  @Parameter(
      description = "Addresse de la page d'accueil",
      defaultValue = "https://r7-connect-place.gireve.com/",
      direction = ParameterDirection.INPUT
  )
  public String ApplicationHomePage;

  @Parameter(
      defaultValue = "EN",
      direction = ParameterDirection.INPUT
  )
  public String Logs_stringLanguage;

	 
  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(500);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;
    String string;
    Boolean hasToUpdatePassword = false; 

    String passwordNumber = Logs_Password.substring(Logs_Password.length()-2,Logs_Password.length()-1);
    String changeToPassword ="";
    String otherPassword ="";

    if (passwordNumber.equals("1")) {
      otherPassword = Logs_Password.substring(0,Logs_Password.length()-2) + "2." ;
    } else if (passwordNumber.equals("2")) {
      otherPassword = Logs_Password.substring(0,Logs_Password.length()-2) + "1." ;
    } else {
      report.step("Le format du Mot de Passe est erroné. Le mot de passe doit se terminer par 'x.' avex x=1 ou x=2.", true, TakeScreenshotConditionType.Never);
    }

    // 1. Get current URL
    string = driver.testproject().getCurrentUrl();
    if (string.equals(ApplicationHomePage)) {
      // La connection a réussi ! Super :D
      report.step("Connection au WPO (page actuelle : " + string + " ).", true, TakeScreenshotConditionType.Never);
    } else if (string.equals(ApplicationURL)) {
      report.step("Connection au WPO échouée (page actuelle : " + string + " . \n Tentative avec un MdP alternatif).", true, TakeScreenshotConditionType.Never);

      by = By.cssSelector("#input-password");
      booleanResult = driver.testproject().clearContents(by);
      report.step("Clear 'input-id-group' contents", booleanResult, TakeScreenshotConditionType.Never);

      // 2. Type '{{Other_Password}}' in 'input-password'
      by = By.cssSelector("#input-password");
      booleanResult = driver.testproject().typeText(by,otherPassword);
      report.step(String.format("Type '%s' in 'input-password'",otherPassword), booleanResult, TakeScreenshotConditionType.Never);
      GeneratedUtils.sleep(250);

      if (string.equals(ApplicationHomePage)) {
        // La connection a réussi ! Super :D
        report.step("Connection au WPO (page actuelle : " + string + " ).", true, TakeScreenshotConditionType.Never);
      } else if (string.equals(ApplicationURL)) {
        report.step("Connection au WPO ECHOUEE.", false, TakeScreenshotConditionType.Never);
      } else {
        report.step("Connection au WPO Interrompue : Changement de mot de passe ! ).", true, TakeScreenshotConditionType.Never);
        changeToPassword = Logs_Password;
        hasToUpdatePassword = true ;
      }
    } else {
      report.step("Connection au WPO Interrompue : Changement de mot de passe ! ).", true, TakeScreenshotConditionType.Never);
      changeToPassword = otherPassword ;
      hasToUpdatePassword = true;
    }

    if (hasToUpdatePassword){
      // 2. Type '{{Other_Password}}' in 'input-password'
      by = By.xpath("//*[@id='fos_user_resetting_form_plainPassword_first']");
      booleanResult = driver.testproject().typeText(by,changeToPassword);
      report.step(String.format("Type '%s' in 'input-password'",changeToPassword), booleanResult, TakeScreenshotConditionType.Never);

      // 2. Type '{{Other_Password}}' in 'input-password'
      by = By.xpath("//*[@id='fos_user_resetting_form_plainPassword_second']");
      booleanResult = driver.testproject().typeText(by,changeToPassword);
      report.step(String.format("Type '%s' in 'input-password'",changeToPassword), booleanResult, TakeScreenshotConditionType.Never);      
      
      // 2. Type '{{Other_Password}}' in 'input-password'
      by = By.xpath("/html/body/div/div[1]/div/form/div/div[3]/div/div/button");
      booleanResult = driver.testproject().click(by);
      report.step(String.format("Click 'Modifier le mot de passe'" ,booleanResult, TakeScreenshotConditionType.Never));

      string = driver.testproject().getCurrentUrl();
      if (string.equals(ApplicationHomePage)) {
        // La connection a réussi ! Super :D
        report.step("Connection au WPO (page actuelle : " + string + " ).", true, TakeScreenshotConditionType.Never);
      } else {
        report.step("Connection au WPO ECHOUEE.", false, TakeScreenshotConditionType.Never);
      }
    }
    return ExecutionResult.PASSED;
  }
}