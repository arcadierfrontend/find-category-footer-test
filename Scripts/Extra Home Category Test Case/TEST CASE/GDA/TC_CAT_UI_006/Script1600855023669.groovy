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

WebUI.waitForElementVisible(findTestObject('Extra Menu Objects GDA/Page_diagnostics/div_NTD DIAGNOSTICS'), 0)

WebUI.waitForElementVisible(findTestObject('Updated GDA Extra Menu/Page_diagnostics/a_NTD DIAGNOSTICS'), 0)

WebUI.verifyElementText(findTestObject('Updated GDA Extra Menu/Page_diagnostics/a_NTD DIAGNOSTICS'), 'NTD DIAGNOSTICS')

WebUI.verifyElementClickable(findTestObject('Updated GDA Extra Menu/Page_diagnostics/a_NTD DIAGNOSTICS'))

WebUI.click(findTestObject('Updated GDA Extra Menu/Page_diagnostics/a_NTD DIAGNOSTICS'))

WebUI.waitForElementVisible(findTestObject('Extra Menu Objects GDA/Page_diagnostics/a_NTD_DIAGNOSTICS_Search'), 0)

WebUI.callTestCase(findTestCase('Extra Home Category Test Case/UTILITIES/CLOSE_BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)

