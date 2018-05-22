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

WebUI.click(findTestObject('Page_Bitsane (9)/a_Log in'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login (8)/input_login'), 'ax.kubitsky@gmail.com')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login (8)/input_password'), '807a4F3f3')

WebUI.click(findTestObject('Page_Bitsane Exchange  Login (8)/input_send'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Bitcoin (BTC (5)/a_Profile'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/a_API'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/a_Generate new API key'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/input_description'), 'Test key')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/input_new_ip'), '1')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/input_new_ip'), '1234567890')

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/button_Add IP'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/div_IP        Address format i'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/input_new_ip'), '192.168.0.1')

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/button_Add IP'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/i_fa fa-times'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/button_Generate key'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/img_mCS_img_loaded'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/button_Cancel'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/i_icon-delete'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (8)/button_Delete key'))

WebUI.closeBrowser()

