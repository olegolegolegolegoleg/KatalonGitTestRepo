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

not_run: WebUI.maximizeWindow()

WebUI.setViewPortSize(1920, 1080)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane/a_Log in'), 2)

'\r\n'
WebUI.click(findTestObject('Page_Bitsane/a_Log in'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_login'), 2)

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_login'), 'ax.kubitsky@gmail.com')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_password'), 2)

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_password'), '807a4F3f3')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_send'), 2)

WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/profile'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/profile'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/a_API'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/a_API'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/a_Generate new API key'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/a_Generate new API key'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_description'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_description'), 'Test key')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/button_Generate key'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/button_Generate key'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/img_mCS_img_loaded'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/img_mCS_img_loaded'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_new_ip'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_new_ip'), '192.168.0.1')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/button_Add IP'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/button_Add IP'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/button_Update key'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/button_Update key'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/button_Cancel'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/button_Cancel'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/i_icon-delete'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/i_icon-delete'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/button_Delete key'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/button_Delete key'))

WebUI.closeBrowser()

