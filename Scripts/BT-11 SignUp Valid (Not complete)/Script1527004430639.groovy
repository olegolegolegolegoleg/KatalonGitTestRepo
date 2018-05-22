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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Bitsane (20)/a_Sign up'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Signup (1)/input_email'), 'biakait9+1@polaz.com')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Signup (1)/input_password'), 'Biakait911')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Signup (1)/input_confirm_password'), 'Biakait911')

WebUI.click(findTestObject('Page_Bitsane Exchange  Signup (1)/span_Please select your countr'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Signup (1)/span_Afghanistan'))

WebUI.selectOptionByValue(findTestObject('Page_Bitsane Exchange  Signup (1)/select_Please select your coun'), 'AF', true)

WebUI.click(findTestObject('Page_Bitsane Exchange  Signup (1)/div_recaptcha-checkbox-checkma'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Signup (1)/i_icon-checkbox'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Signup (1)/input_submitbutton'))

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&followup=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Page_ Google/input_identifier'), 'biakait9@polaz.com')

WebUI.click(findTestObject('Page_ Google/span_'))

WebUI.setText(findTestObject('Page_ Google/input_password'), 'biakait911')

WebUI.click(findTestObject('Page_ Google/span_'))

WebUI.click(findTestObject('Page_/path'))

WebUI.click(findTestObject('Page_/span_gb_2'))

WebUI.click(findTestObject('Page_stage Activation - biakait9pol/a_Verify my email address'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (18)/input_code'), 'ТУТ КОД')

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (18)/input_btn elastic'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (18)/input_code'), 'b698db08a84c34f7060b4082f7c641ee')

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (18)/input_btn elastic'))

WebUI.closeBrowser()

WebUI.acceptAlert()


