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
import io.testproject.proxy.addon.actions.ClickOnNthItem;
import java.lang.String;
import org.openqa.selenium.By;

/**
 * This class was automatically generated by TestProject
 * Project: My first Project
 * Test: FillOutOffer_ServiceDetails
 * Generated by: C ANNICCHIARICO (come.annicchiarico@gireve.com)
 * Generated on Fri Aug 07 14:10:32 GMT 2020.
 */
@Test(
    name = "Fill_Services_OfferServiceDetails",
    version = "1.0"
)
public class Fill_Services_OfferServiceDetails implements WebTest {
    @Parameter(
        description = "Environnement",
        defaultValue = "R7",
        direction = ParameterDirection.INPUT
    )
    public String ENVIRONNEMENT;

  @Parameter(
      defaultValue = "ServiceName",
      direction = ParameterDirection.INPUT
  )
  public String ServiceNameEN;

  @Parameter(
      defaultValue = "Nom Service",
      direction = ParameterDirection.INPUT
  )
  public String ServiceNameFR;

  @Parameter(
      defaultValue = "COM113",
      direction = ParameterDirection.INPUT
  )
  public String EVSEGroupName;

  @Parameter(
      defaultValue = "1",
      direction = ParameterDirection.INPUT
  )
  public String iCDRFinDeCharge;

  @Parameter(
      defaultValue = "1",
      direction = ParameterDirection.INPUT
  )
  public String iEventDebutTransaction;

  @Parameter(
      defaultValue = "1",
      direction = ParameterDirection.INPUT
  )
  public String iEventFinTransaction;

  @Parameter(
      defaultValue = "This a service (i swear)",
      direction = ParameterDirection.INPUT
  )
  public String DescriptionFonctServEN;

  @Parameter(
      defaultValue = "Ceci est un service (si, si !)",
      direction = ParameterDirection.INPUT
  )
  public String DescriptionFonctServFR;

  @Parameter(
      defaultValue = "o",
      direction = ParameterDirection.INPUT
  )
  public String CdrInterBool;

  @Parameter(
      defaultValue = "1",
      direction = ParameterDirection.INPUT
  )
  public String ValuePasCDRInter;

  @Parameter(
      defaultValue = "heures",
      direction = ParameterDirection.INPUT
  )
  public String iUnitPasCDRInter;

  @Parameter(
      defaultValue = "RFI,TOK,TES",
      direction = ParameterDirection.INPUT
  )
  public String ModeAcces;

  @Parameter(
      description = "Tarification dans l'article 9 ? [o/n]",
      defaultValue = "n",
      direction = ParameterDirection.INPUT
  )
  public String article9Tariff;

  @Parameter(
      description = "Service gratuit ? [o/n]",
      defaultValue = "n",
      direction = ParameterDirection.INPUT
  )
  public String serviceGratuit;

  @Parameter(
      description = "Session prix mini ? [o/n]",
      defaultValue = "n",
      direction = ParameterDirection.INPUT
  )
  public String hasMaximumPrice;

  @Parameter(
      description = "Session prix maxi ? [o/n]",
      defaultValue = "n",
      direction = ParameterDirection.INPUT
  )
  public String hasMinimumPrice;

  @Parameter(
      description = "Dépends du Créneau [o/n]",
      defaultValue = "n",
      direction = ParameterDirection.INPUT
  )
  public String dependsOnCreneau;

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
      description = "Minimum session HT",
      defaultValue = "0",
      direction = ParameterDirection.INPUT
  )
  public String minAmountSession;

  @Parameter(
      description = "Maximum session HT",
      defaultValue = "0",
      direction = ParameterDirection.INPUT
  )
  public String maxAmountSession;

  @Parameter(
      description = "Jours de la semaine valides",
      defaultValue = "Lun,Mar,Mer,Jeu,Ven,Sam,Dim",
      direction = ParameterDirection.INPUT
  )
  public String inputDays;

  @Parameter(
      description = "Heure de début Matin",
      defaultValue = "00h00",
      direction = ParameterDirection.INPUT
  )
  public String hourMorningStart;

  @Parameter(
      description = "Heure de fin Matin",
      defaultValue = "12h00",
      direction = ParameterDirection.INPUT
  )
  public String hourMorningEnd;

  @Parameter(
      description = "Heure de début après-midi",
      defaultValue = "12h00",
      direction = ParameterDirection.INPUT
  )
  public String hourAfternoonStart;

  @Parameter(
      description = "Heure de fin après-midi",
      defaultValue = "24h00",
      direction = ParameterDirection.INPUT
  )
  public String hourAfternoonEnd;

  @Parameter(
      defaultValue = "o",
      direction = ParameterDirection.INPUT
  )
  public String modifyEVSEGroup;

  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(15000);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;
    ExecutionResult executionresult;
    ClickOnListItemWhichContainsText clickOnListItemWhichContainsText;
    ClickOnNthItem clickOnNthItem;


    // 1. Click 'portal_bundle_associated_service_form_name_en'
    by = By.cssSelector("#portal_bundle_associated_service_form_name_en");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'portal_bundle_associated_service_form_name_en'", booleanResult, TakeScreenshotConditionType.Never);

    // 2. Type '{{ServiceNameEN}}' in 'portal_bundle_associated_service_form_name_en'
    by = By.cssSelector("#portal_bundle_associated_service_form_name_en");
    booleanResult = driver.testproject().typeText(by,ServiceNameEN);
    report.step(String.format("Type '%s' in 'portal_bundle_associated_service_form_name_en'",ServiceNameEN), booleanResult, TakeScreenshotConditionType.Never);

    // 3. Type '{{ServiceNameFR}}' in 'portal_bundle_associated_service_form_name_fr'
    by = By.cssSelector("#portal_bundle_associated_service_form_name_fr");
    booleanResult = driver.testproject().typeText(by,ServiceNameFR);
    report.step(String.format("Type '%s' in 'portal_bundle_associated_service_form_name_fr'",ServiceNameFR), booleanResult, TakeScreenshotConditionType.Never);


    Fill_Services_AssociatedEVSEGroup evsePicker = new Fill_Services_AssociatedEVSEGroup() ;
    evsePicker.EVSEGroupName = EVSEGroupName;
    evsePicker.modifyEVSEAssociated = modifyEVSEGroup;
    executionresult = evsePicker.execute(helper);
    report.step("Choose the associated EVSE Group", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);


    // 4. Click 'portal_bundle_associated_service_form_endChargeCdr'
    by = By.cssSelector("#portal_bundle_associated_service_form_endChargeCdr");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'portal_bundle_associated_service_form_endChargeCdr'", booleanResult, TakeScreenshotConditionType.Never);

    // 5. Clicks on a list item based on text
    by = By.cssSelector("#portal_bundle_associated_service_form_endChargeCdr");
    booleanResult = driver.testproject().selectAnOptionByValue(by,iCDRFinDeCharge);
    report.step("Clicks on a list item based on text", booleanResult, TakeScreenshotConditionType.Never);

    Fill_Services_CDRIntermediaire cdrInterPicker = new Fill_Services_CDRIntermediaire();
    cdrInterPicker.cdrInterBool = CdrInterBool; 
    cdrInterPicker.iunitPasCDRInter = iUnitPasCDRInter;
    cdrInterPicker.valuePasCDRInter = ValuePasCDRInter;
    executionresult = cdrInterPicker.execute(helper);
    report.step("Choose the associated Intermediary CDR characteristics", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);

    Fill_Services_ModeAcces modeAccPicker = new Fill_Services_ModeAcces();
    modeAccPicker.modeAcces = ModeAcces;
    executionresult = modeAccPicker.execute(helper);
    report.step("Choose the associated Access Mode", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);

    // 6. Click 'portal_bundle_associated_service_form_loadStartEvent'
    by = By.cssSelector("#portal_bundle_associated_service_form_loadStartEvent");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'portal_bundle_associated_service_form_loadStartEvent'", booleanResult, TakeScreenshotConditionType.Never);

    // 7. Clicks on a list item based on text
    by = By.cssSelector("#portal_bundle_associated_service_form_loadStartEvent");
    booleanResult = driver.testproject().selectAnOptionByValue(by,iEventDebutTransaction);
    report.step("Clicks on a list item based on text", booleanResult,TakeScreenshotConditionType.Never);

    // 8. Click 'portal_bundle_associated_service_form_loadEndEvent'
    by = By.cssSelector("#portal_bundle_associated_service_form_loadEndEvent");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'portal_bundle_associated_service_form_loadEndEvent'", booleanResult, TakeScreenshotConditionType.Never);

    // 9. Clicks on a list item based on text
    by = By.cssSelector("#portal_bundle_associated_service_form_loadEndEvent");
    booleanResult = driver.testproject().selectAnOptionByValue(by,iEventDebutTransaction);
    report.step("Clicks on a list item based on text", booleanResult,TakeScreenshotConditionType.Never);

    // 10. Type '{{DescriptionFonctServEN}}' in 'portal_bundle_associated_service_form_description_en'
    by = By.cssSelector("#portal_bundle_associated_service_form_description_en");
    booleanResult = driver.testproject().typeText(by,DescriptionFonctServEN);
    report.step(String.format("Type '%s' in 'portal_bundle_associated_service_form_description_en'",DescriptionFonctServEN), booleanResult, TakeScreenshotConditionType.Never);

    // 11. Type '{{DescriptionFonctServFR}}' in 'portal_bundle_associated_service_form_description_fr'
    by = By.cssSelector("#portal_bundle_associated_service_form_description_fr");
    booleanResult = driver.testproject().typeText(by,DescriptionFonctServFR);
    report.step(String.format("Type '%s' in 'portal_bundle_associated_service_form_description_fr'",DescriptionFonctServFR), booleanResult, TakeScreenshotConditionType.Never);

    Fill_Services_TarificationEtArticle9 a = new Fill_Services_TarificationEtArticle9();
        a.article9Tariff = article9Tariff;
        a.serviceGratuit = serviceGratuit;
        a.hasMaximumPrice = hasMaximumPrice;
        a.hasMinimumPrice = hasMinimumPrice;
        a.dependsOnCreneau=dependsOnCreneau;
        a.BasePrice=BasePrice ;
        a.BaseParam=BaseParam ;
        a.iBaseParam=iBaseParam;
        a.Devise=Devise;
        a.iPrecPrice=iPrecPrice;
        a.iPrecTime=iPrecTime;
        a.boolLimitTariff=boolLimitTariff;
        a.idParamSelectorPowers0=idParamSelectorPowers0;
        a.idParamSelectorPowers1=idParamSelectorPowers1;
        a.valueParamPowers0=valueParamPowers0;
        a.valueParamPowers1=valueParamPowers1;
        a.valueParamTime0=valueParamTime0;
        a.valueParamTime1=valueParamTime1;
        a.completeTariff=completeTariff;
        a.limitTariffValue=limitTariffValue;
        a.minAmountSession=minAmountSession;
        a.maxAmountSession=maxAmountSession;
        a.inputDays=inputDays;
        a.hourMorningStart=hourMorningStart;
        a.hourMorningEnd=hourMorningEnd;
        a.hourAfternoonStart=hourAfternoonStart;
        a.hourAfternoonEnd=hourAfternoonEnd ;
        a.ENVIRONNEMENT = ENVIRONNEMENT;
    executionresult = a.execute(helper);
    report.step("Fill Tariff", executionresult == ExecutionResult.PASSED, TakeScreenshotConditionType.Never);


    return ExecutionResult.PASSED;
  }
}
