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

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/Login_btn'))

WebUI.setText(findTestObject('Page_Bitsane_exchange TradeOrders/Login_field'), 'ax.kubitsky@gmail.com')

WebUI.setText(findTestObject('Page_Bitsane_exchange TradeOrders/Login_pass'), '807a4F3f3')

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/Login_submit'))

WebUI.delay(4)

WebUI.setText(findTestObject('Page_Bitsane_exchange TradeOrders/Order_size'), '0.01')

WebUI.setText(findTestObject('Page_Bitsane_exchange TradeOrders/order_sell_price'), '200')

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/sell_btn'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/close_btn_modal'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Bitsane_exchange TradeOrders/orders_accordion'))

WebUI.closeBrowser()

