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

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/Login_btn'), 2)

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/Login_btn'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/Login_field'), 2)

WebUI.setText(findTestObject('Page_Bitsane_exchange TradeOrders/Login_field'), 'ax.kubitsky@gmail.com')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/Login_pass'), 2)

WebUI.setText(findTestObject('Page_Bitsane_exchange TradeOrders/Login_pass'), '807a4F3f3')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/Login_submit'), 2)

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/Login_submit'))

WebUI.delay(6)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/Pair_button'), 2)

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/Pair_button'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/search_input'), 2)

WebUI.setText(findTestObject('Page_Bitsane_exchange TradeOrders/search_input'), ' !@#$%^&*; ')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/close_btn'), 2)

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/close_btn'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/Pair_button'), 2)

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/Pair_button'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/search_input'), 2)

WebUI.setText(findTestObject('Page_Bitsane_exchange TradeOrders/search_input'), 'XRP')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/XRP_butt'), 2)

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/XRP_butt'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/Change_arrow'), 2)

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/Change_arrow'))

WebUI.delay(4)

WebUI.verifyTextPresent('pair is for informational use only', false)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_exchange TradeOrders/Change_arrow'), 2)

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/Change_arrow'))

WebUI.closeBrowser()

