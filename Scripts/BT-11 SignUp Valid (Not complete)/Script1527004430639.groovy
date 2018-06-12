import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.bitsane.com/')

WebUI.setViewPortSize(1920, 1080)

WebUI.waitForPageLoad(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Signup/signup_btn'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Bitsane Signup/signup_btn'))

WebUI.click(findTestObject('Page_Bitsane Signup/signup_btn'))

WebUI.waitForPageLoad(4)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Page_Bitsane Signup/email_input'))

WebUI.click(findTestObject('Page_Bitsane Signup/email_input'))

WebUI.setText(findTestObject('Page_Bitsane Signup/email_input'), 'alwx.mason+1@gmail.com')

WebUI.verifyElementClickable(findTestObject('Page_Bitsane Signup/pass_input'))

WebUI.click(findTestObject('Page_Bitsane Signup/pass_input'))

WebUI.setText(findTestObject('Page_Bitsane Signup/pass_input'), '807a4F3f3')

WebUI.verifyElementClickable(findTestObject('Page_Bitsane Signup/pass_confirm'))

WebUI.click(findTestObject('Page_Bitsane Signup/pass_confirm'))

WebUI.setText(findTestObject('Page_Bitsane Signup/pass_confirm'), '807a4F3f3')

WebUI.verifyElementClickable(findTestObject('Page_Bitsane Signup/countries_span'))

WebUI.click(findTestObject('Page_Bitsane Signup/countries_span'))

WebUI.verifyElementClickable(findTestObject('Page_Bitsane Signup/albania'))

WebUI.click(findTestObject('Page_Bitsane Signup/albania'))

WS.sendRequest(findTestObject('Page_Bitsane Signup/keys_captcha'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_Bitsane Signup/captcha_checkbox'), 2)

WebUI.verifyElementVisible(findTestObject('Page_Bitsane Signup/captcha_checkbox'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Bitsane Signup/captcha_checkbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Bitsane Signup/captcha_window'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Page_Bitsane Signup/terms_checkbox'))

WebUI.click(findTestObject('Page_Bitsane Signup/terms_checkbox'))

WebUI.verifyElementClickable(findTestObject('Page_Bitsane Signup/subscription_checkbox'))

WebUI.click(findTestObject('Page_Bitsane Signup/subscription_checkbox'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Bitsane Signup/submit_button_reg'))

