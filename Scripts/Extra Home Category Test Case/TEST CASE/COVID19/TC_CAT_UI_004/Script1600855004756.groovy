import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Extra Home Category Test Case/UTILITIES/OPEN_BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Extra Menu Objects COVID19/Page_diagnostics/div_ANTIBODY (Ab)'), 0)

WebUI.waitForElementVisible(findTestObject('Extra Menu Objects COVID19/Page_diagnostics/a_ANTIBODY (Ab)'), 0)

WebUI.verifyElementText(findTestObject('Extra Menu Objects COVID19/Page_diagnostics/a_ANTIBODY (Ab)'), 'ANTIBODY (Ab)')

WebUI.verifyElementClickable(findTestObject('Extra Menu Objects COVID19/Page_diagnostics/a_ANTIBODY (Ab)'))

WebUI.click(findTestObject('Extra Menu Objects COVID19/Page_diagnostics/a_ANTIBODY (Ab)'))

WebUI.waitForElementVisible(findTestObject('Extra Menu Objects COVID19/Page_diagnostics/a_Antibody_Search'), 0)

WebUI.callTestCase(findTestCase('Extra Home Category Test Case/UTILITIES/CLOSE_BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)
