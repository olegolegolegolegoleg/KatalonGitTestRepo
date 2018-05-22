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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.bitsane.com/')

not_run: WebUI.maximizeWindow()

WebUI.setViewPortSize(1920, 1080)

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Page_Bitsane/a_Log in'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_login'), 'ax.kubitskygmail.com')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_login'), 'ax.kubitsky@gmail.com')

WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_login'), 'ax.kubitsky@gmail.com')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_password'), '1111')

WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

WebUI.delay(2)

def text = WebUI.getText(findTestObject('Page_Bitsane Exchange  Login/Login_form'))

if (text.contains('Login or password invalid. Please try again.')) {
    WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_login'), 'ax.kubitsky@gmail.com')

    WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_password'), '807a4F3f3')

    WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

    WebUI.delay(1)

    WebUI.closeBrowser()
} else {
    WebUI.executeJavaScript('alert(\'Text is not present\')', null)

    WebUI.delay(1)

    WebUI.closeBrowser()
}

not_run: WebUI.verifyTextPresent('Login or password invalid. Please try again.', false)

not_run: WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_login'), 'ax.kubitsky@gmail.com')

not_run: WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_password'), '807a4F3f3')

not_run: WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

