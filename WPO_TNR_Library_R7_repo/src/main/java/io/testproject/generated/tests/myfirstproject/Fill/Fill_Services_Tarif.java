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
import jdk.internal.loader.Resource;

import org.openqa.selenium.By;
import java.io.* ;

/**
 * This class was automatically generated by TestProject
 * Project: My first Project
 * Test: TariffFiller
 * Generated by: C ANNICCHIARICO (come.annicchiarico@gireve.com)
 * Generated on Wed Aug 05 13:28:38 GMT 2020.
 */
@Test(
    name = "Fill_Services_Tarif",
    description = "This test was auto generated from steps of the 'FillOutOffer_WifiService' test",
    version = "1.0"
)
public class Fill_Services_Tarif implements WebTest {
  @Parameter(
        description = "Niveau du tarif",
        defaultValue = "pricing_0_prices_0",
        direction = ParameterDirection.INPUT
    )
    public String elementAddress;

  @Parameter(
        description = "PrixDeBase",
        defaultValue = "0",
        direction = ParameterDirection.INPUT
    )
    public String BasePrice;

    @Parameter(
      description = "ValeurParamDePrix",
      defaultValue = "0",
      direction = ParameterDirection.INPUT
  )
  public String BaseParam;

  @Parameter(
      description = "IndiceParamDePrix",
      defaultValue = "1",
      direction = ParameterDirection.INPUT
  )
  public String iBaseParam;


    @Parameter(
      description = "Devise",
      defaultValue = "EUR",
      direction = ParameterDirection.INPUT
  )
  public String Devise;

  @Parameter(
      description = "IndicePrecisionPrix",
      defaultValue = "1",
      direction = ParameterDirection.INPUT
  )
  public String iPrecPrice;

  @Parameter(
      description = "IndicePrecisionTemps",
      defaultValue = "1",
      direction = ParameterDirection.INPUT
  )
  public String iPrecTime;

  @Parameter(
    description = "LimiterTarif [o/n]",
    defaultValue = "n",
    direction = ParameterDirection.INPUT
)
public String boolLimitTariff;

@Parameter(
    description = "Indice de comparateur de paramètre 0",
    defaultValue = "1",
    direction = ParameterDirection.INPUT
)
public String idParamSelectorPowers0;

@Parameter(
    description = "Indice de comparateur de paramètre 1",
    defaultValue = "1",
    direction = ParameterDirection.INPUT
)
public String idParamSelectorPowers1;

@Parameter(
    description = "Valeur de paramètre puissance 0",
    defaultValue = "0",
    direction = ParameterDirection.INPUT
)
public String valueParamPowers0;

@Parameter(
    description = "Valeur de paramètre puissance 1",
    defaultValue = "0",
    direction = ParameterDirection.INPUT
)
public String valueParamPowers1;

@Parameter(
    description = "Valeur de paramètre intervalle de temps 0",
    defaultValue = "0",
    direction = ParameterDirection.INPUT
)
public String valueParamTime0;

@Parameter(
    description = "Valeur de paramètre intervalle de temps 1",
    defaultValue = "0",
    direction = ParameterDirection.INPUT
)
public String valueParamTime1;

@Parameter(
    description = "CompleterTarif [o/n]",
    defaultValue = "o",
    direction = ParameterDirection.INPUT
)
public String completeTariff;

@Parameter(
    description = "Valeur de la lmite du Tariff",
    defaultValue = "1",
    direction = ParameterDirection.INPUT
)
public String limitTariffValue;

@Parameter(
    description = "Environnement",
    defaultValue = "R7",
    direction = ParameterDirection.INPUT
)
public String ENVIRONNEMENT;


  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(15000);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;
    ExecutionResult executionresult;
    SelectOptionbyVisibleText selectOptionbyVisibleText;


    
    // 1. Type '5' in 'portal_bundle_associated_service_form_pricing_0_prices_0_value'
    by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_value");
    booleanResult = driver.testproject().typeText(by,BasePrice);
    report.step("Type 'BasePrice' in 'portal_bundle_associated_service_form_"+ elementAddress +"_value'", booleanResult, TakeScreenshotConditionType.Never);

    // 2. Click 'portal_bundle_associated_service_form_pricing_0_prices_0_unit'
    by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_unit");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'portal_bundle_associated_service_form_"+ elementAddress +"_unit'", booleanResult, TakeScreenshotConditionType.Never);

    // 3. Select options in 'portal_bundle_associated_service_form_pricing_0_prices_0_unit' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText(Devise);
    by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_unit");
    executionresult = helper.executeProxy(selectOptionbyVisibleText, by);
    report.step("Select options in 'portal_bundle_associated_service_form_"+ elementAddress +"_unit' with text '[NONE]'", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);

    // 4. Click 'portal_bundle_associated_service_form_pricing_0_prices_0_valueRound'
    by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_valueRound");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'portal_bundle_associated_service_form_"+ elementAddress +"_valueRound'", booleanResult, TakeScreenshotConditionType.Never);

    // 5. Select the '11' option in 'portal_bundle_associated_service_form_pricing_0_prices_0_valueRound'
    by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_valueRound");
    booleanResult = driver.testproject().selectAnOptionByValue(by,iPrecPrice);
    report.step("Select the '11' option in 'portal_bundle_associated_service_form_"+ elementAddress +"_valueRound'", booleanResult, TakeScreenshotConditionType.Never);

    // 8. Type '3' in 'portal_bundle_associated_service_form_pricing_0_prices_0_unitOfWorkValue'
    by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_unitOfWorkValue");
    booleanResult = driver.testproject().typeText(by,BaseParam);
    report.step("Type '3' in 'portal_bundle_associated_service_form_"+ elementAddress +"_unitOfWorkValue'", booleanResult, TakeScreenshotConditionType.Never);

    // 11. Click 'portal_bundle_associated_service_form_pricing_0_prices_0_unitOfWorkRound'
    by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_unitOfWorkRound");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'portal_bundle_associated_service_form_"+ elementAddress +"_unitOfWorkRound'", booleanResult, TakeScreenshotConditionType.Never);

    // 12. Select the '10' option in 'portal_bundle_associated_service_form_pricing_0_prices_0_unitOfWorkRound'
    by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_unitOfWorkRound");
    booleanResult = driver.testproject().selectAnOptionByValue(by,iPrecTime);
    report.step("Select the '"+iPrecTime+"' option in 'portal_bundle_associated_service_form_"+ elementAddress +"_unitOfWorkRound'", booleanResult, TakeScreenshotConditionType.Never);

    
    // 9. Click 'portal_bundle_associated_service_form_pricing_0_prices_0_unitOfWorkUnit'
    by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_unitOfWorkUnit");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'portal_bundle_associated_service_form_"+ elementAddress +"_unitOfWorkUnit'", booleanResult, TakeScreenshotConditionType.Never);

    // 10. Select the '6' option in 'portal_bundle_associated_service_form_pricing_0_prices_0_unitOfWorkUnit'
    by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_unitOfWorkUnit");
    booleanResult = driver.testproject().selectAnOptionByValue(by,iBaseParam);
    report.step("Select the '6' option in 'portal_bundle_associated_service_form_"+ elementAddress +"_unitOfWorkUnit'", booleanResult, TakeScreenshotConditionType.Never);

    boolean hasParameter = false;
    boolean hasTimeInterval = false ;

    String parameterLovsPowerFileName = "";
    String parameterLovsTimeFileName = "" ;
    if (ENVIRONNEMENT.equals("R7")) {
      parameterLovsPowerFileName = "UOPowerAsParamLovs_R7.txt" ;
      parameterLovsTimeFileName = "UOTimeAsParamLovs_R7.txt" ;
    } else if (ENVIRONNEMENT.equals("PP")) {
      parameterLovsPowerFileName = "UOPowerAsParamLovs_PP.txt" ;
      parameterLovsTimeFileName = "UOTimeAsParamLovs_PP.txt" ;
    }

    try {
      //FileInputStream fstream = new FileInputStream("src/main/resources/UOPowerAsParamLovs.txt");
      InputStream is = this.getClass().getClassLoader().getResourceAsStream(parameterLovsPowerFileName);
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String strLine;         
      // Read File Line By Line
      while ((strLine = br.readLine()) != null) {
        if (iBaseParam.equals(strLine)) {
          hasParameter = true ;
        }
      }
      is.close();

      if (!hasParameter) {
        is = this.getClass().getClassLoader().getResourceAsStream(parameterLovsTimeFileName);
        //is = new FileInputStream("src/main/resources/UOTimeAsParamLovs.txt");
        br = new BufferedReader(new InputStreamReader(is));     
        // Read File Line By Line
        while ((strLine = br.readLine()) != null) {
          if (iBaseParam.equals(strLine)) {
            hasTimeInterval = true ;
          }
        }
        is.close();
      }
    } catch (Exception e) {// Catch exception if any
        System.err.println("Error: " + e.getMessage());
    }

    
    if (hasParameter) {
      //PREMIER PARAMETRE
      // 28. Click 'portal_bundle_associated_service_form_pricing_0_prices_0_limitPrices_1_powers_0_operationPower'
      by = By.xpath("//*[@id='portal_bundle_associated_service_form_"+ elementAddress +"_powers_0_operationPower']");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'portal_bundle_associated_service_form_pricing_0_"+ elementAddress +"_operationPower'", booleanResult, TakeScreenshotConditionType.Never);

      // 29. Select the '1' option in 'portal_bundle_associated_service_form_pricing_0_prices_0_powers_0_operationPower'
      by = By.xpath("//*[@id='portal_bundle_associated_service_form_"+ elementAddress +"_powers_0_operationPower']");
      booleanResult = driver.testproject().selectAnOptionByValue(by,idParamSelectorPowers0);
      report.step("Select the '1' option in 'portal_bundle_associated_service_form_"+ elementAddress +"_powers_0_operationPower'", booleanResult, TakeScreenshotConditionType.Never);

      // 30. Type '5' in 'portal_bundle_associated_service_form_pricing_0_prices_0_limitPrices_1_powers_0_valuePower'
      by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_powers_0_valuePower");
      booleanResult = driver.testproject().typeText(by,valueParamPowers0);
      report.step("Type '5' in 'portal_bundle_associated_service_form_"+ elementAddress +"_powers_0_valuePower'", booleanResult, TakeScreenshotConditionType.Never);
      
      //DEUXIEME PARAMETRE
      // 31. Click 'SPAN1'
      by = By.xpath("//*[@id='portal_bundle_associated_service_form_"+ elementAddress +"_powers_0']/a[2]/span");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'SPAN1'", booleanResult, TakeScreenshotConditionType.Never);

      // 32. Click 'portal_bundle_associated_service_form_pricing_0_prices_0_limitPrices_1_powers_1_operationPower'
      by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_powers_1_operationPower");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'portal_bundle_associated_service_form_"+ elementAddress +"_powers_1_operationPower'", booleanResult, TakeScreenshotConditionType.Never);

      // 29. Select the '1' option in 'portal_bundle_associated_service_form_pricing_0_prices_0_powers_0_operationPower'
      by = By.xpath("//*[@id='portal_bundle_associated_service_form_"+ elementAddress +"_powers_1_operationPower']");
      booleanResult = driver.testproject().selectAnOptionByValue(by,idParamSelectorPowers1);
      report.step("Select the '1' option in 'portal_bundle_associated_service_form_"+ elementAddress +"_powers_1_operationPower'", booleanResult, TakeScreenshotConditionType.Never);

      // 30. Type '5' in 'portal_bundle_associated_service_form_pricing_0_prices_0_limitPrices_1_powers_0_valuePower'
      by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_powers_1_valuePower");
      booleanResult = driver.testproject().typeText(by,valueParamPowers1);
      report.step("Type '5' in 'portal_bundle_associated_service_form_"+ elementAddress +"_powers_0_valuePower'", booleanResult, TakeScreenshotConditionType.Never);
    } else if (hasTimeInterval) {
      // 30. Type '5' in 'portal_bundle_associated_service_form_pricing_0_prices_0_startTimeInterval'
      by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_startTimeInterval");
      booleanResult = driver.testproject().typeText(by,valueParamTime0);
      report.step("Type '5' in 'portal_bundle_associated_service_form_"+ elementAddress +"_startTimeInterval'", booleanResult, TakeScreenshotConditionType.Never);

      // 30. Type '5' in 'portal_bundle_associated_service_form_pricing_0_prices_0_endTimeInterval'
      by = By.cssSelector("#portal_bundle_associated_service_form_"+ elementAddress +"_endTimeInterval");
      booleanResult = driver.testproject().typeText(by,valueParamTime1);
      report.step("Type '5' in 'portal_bundle_associated_service_form_"+ elementAddress +"_endTimeInterval'", booleanResult, TakeScreenshotConditionType.Never);
    }

    if (boolLimitTariff.equals("o")) {
      // 13. Click 'I7'
      by = By.xpath("//*[@id='portal_bundle_associated_service_form_"+ elementAddress +"']/div[1]/div/div[5]/div[2]/div/label/i");
      booleanResult = driver.testproject().click(by);
      report.step("Click 'I7'", booleanResult, TakeScreenshotConditionType.Never);

      // 14. Type '5' in 'portal_bundle_associated_service_form_pricing_0_prices_0_limitPrices_1_value'
      by = By.xpath("//*[@id='portal_bundle_associated_service_form_"+ elementAddress +"_limitValue']");
      booleanResult = driver.testproject().typeText(by,limitTariffValue);
      report.step("Type 'limitTariffValue' in 'portal_bundle_associated_service_form_"+ elementAddress +"_limitPrices_1_value'", booleanResult, TakeScreenshotConditionType.Never);

      if (completeTariff.equals("n")) {
        // 15. Click 'hidden-limit-prices-portal_bundle_associated_service_form_pricing_0_prices_0_limitPrices'
        by = By.cssSelector("#hidden-limit-prices-portal_bundle_associated_service_form_"+ elementAddress +"_limitPrices");
        booleanResult = driver.testproject().click(by);
        report.step("Click 'hidden-limit-prices-portal_bundle_associated_service_form_"+ elementAddress +"_limitPrices'", booleanResult, TakeScreenshotConditionType.Never);
      } else {
        // FILL OTHER TARIF
        Fill_Services_Tarif tariffFiller = new Fill_Services_Tarif() ;
        tariffFiller.BaseParam = "00" ;
        tariffFiller.BasePrice = "00" ;
        tariffFiller.elementAddress = elementAddress+"_limitPrices_0" ;
        tariffFiller.iBaseParam = iBaseParam ;
        tariffFiller.iPrecPrice = iPrecPrice ;
        tariffFiller.iPrecTime = iPrecTime;
        tariffFiller.Devise = Devise;
        tariffFiller.boolLimitTariff = "0";
        tariffFiller.limitTariffValue = limitTariffValue ;
        tariffFiller.idParamSelectorPowers0 = idParamSelectorPowers0 ;
        tariffFiller.idParamSelectorPowers1 = idParamSelectorPowers1 ;
        tariffFiller.valueParamPowers0 = valueParamPowers0;
        tariffFiller.valueParamPowers1 = valueParamPowers1 ;
        tariffFiller.valueParamTime0 = valueParamTime0 ;
        tariffFiller.valueParamTime1 = valueParamTime1 ;
        tariffFiller.completeTariff = "0" ;
        tariffFiller.ENVIRONNEMENT = ENVIRONNEMENT;
        executionresult = tariffFiller.execute(helper);
        report.step("Fill Tariff", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);
      }
    }
    return ExecutionResult.PASSED;  
  }
}
