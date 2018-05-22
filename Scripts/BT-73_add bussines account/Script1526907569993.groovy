import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.bitsane.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Bitsane (5)/a_Log in'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login (5)/input_login'), 'biakait9@polaz.com')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login (5)/input_password'), 'Biakait911')

WebUI.click(findTestObject('Page_Bitsane Exchange  Login (5)/input_send'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Bitsane Exchange  Bitcoin (BTC (2)/a_Profile'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/a_Accounts'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/a_Add business account'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/input_company_name'), '1111111111111')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/input_address'), '111111111111111111')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/input_address'), '11111111111111111')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/input_manager_name'), 'zzzzzzzzzzzzz')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/input_city'), 'zzzzzzzzzzzzzz')

WebUI.click(findTestObject('data'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/a_9'), '11-10-2011')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/input_state'), 'zzzzzzzzzzzzzzzzz')

WebUI.setText(findTestObject('registration number field'), RandomStringUtils.randomNumeric(7))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/span_select country'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/span_Afghanistan'))

WebUI.selectOptionByValue(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/select_select countryAfghanist'), 'AF', 
    true)

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/input_zipcode'), '1001')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/input_phone'), '+11111')

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (4)/input_save'))

WebUI.delay(1)

WebUI.closeBrowser()

