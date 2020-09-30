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

WebUI.openBrowser('https://diagnostics.sandbox.arcadier.io/')

WebUI.waitForElementVisible(findTestObject('Complete Footer Object/Page_diagnostics/Footer Container'), 0)

WebUI.waitForElementVisible(findTestObject('Complete Footer Object/Page_diagnostics/Custom Footer'), 0)

WebUI.waitForElementVisible(findTestObject('Complete Footer Object/Page_diagnostics/Widget'), 0)

WebUI.waitForElementVisible(findTestObject('Complete Footer Object/Page_diagnostics/Logo'), 0)

COMPANY = WebUI.getText(findTestObject('Complete Footer Object/Page_diagnostics/COMPANY Title'))

WebUI.waitForElementVisible(findTestObject('Complete Footer Object/Page_diagnostics/About Link'), 0)

About = WebUI.getText(findTestObject('Complete Footer Object/Page_diagnostics/About Link'))

WebUI.waitForElementVisible(findTestObject('Complete Footer Object/Page_diagnostics/Privacy Policy Link'), 0)

//diagnostics.sandbox.arcadier.io/pages/about-us = WebUI.getUrl()
https: Privacy = WebUI.getText(findTestObject('Complete Footer Object/Page_diagnostics/Privacy Policy Link'))

WebUI.waitForElementVisible(findTestObject('Complete Footer Object/Page_diagnostics/Terms of Service Link'), 0)

//diagnostics.sandbox.arcadier.io/pages/privacy-policy = WebUI.getUrl()
https: Terms = WebUI.getText(findTestObject('Complete Footer Object/Page_diagnostics/Terms of Service Link'))

//diagnostics.sandbox.arcadier.io/pages/terms-of-service = WebUI.getUrl()
https: SOCIAL = WebUI.getText(findTestObject('Complete Footer Object/Page_diagnostics/SOCIAL Title'))

WebUI.waitForElementVisible(findTestObject('Complete Footer Object/Page_diagnostics/Facebook Link'), 0)

Facebook = WebUI.getText(findTestObject('Complete Footer Object/Page_diagnostics/Facebook Link'))

WebUI.waitForElementVisible(findTestObject('Complete Footer Object/Page_diagnostics/Linkedin Link'), 0)

//diagnostics.sandbox.arcadier.io/# = WebUI.getUrl()
https: Linkedin = WebUI.getText(findTestObject('Complete Footer Object/Page_diagnostics/Linkedin Link'))

WebUI.waitForElementVisible(findTestObject('Complete Footer Object/Page_diagnostics/Twitter Link'), 0)

//diagnostics.sandbox.arcadier.io/# = WebUI.getUrl()
https: Twitter = WebUI.getText(findTestObject('Complete Footer Object/Page_diagnostics/Twitter Link'))

//diagnostics.sandbox.arcadier.io/# = WebUI.getUrl()
https: WebUI.closeBrowser()

