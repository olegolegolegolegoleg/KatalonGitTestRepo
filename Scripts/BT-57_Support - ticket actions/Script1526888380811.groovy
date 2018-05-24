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

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_link'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/Tickets/support_link'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_ticket_link'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/Tickets/support_ticket_link'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_new_ticket'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/Tickets/support_new_ticket'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_filter_option'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/Tickets/support_filter_option'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_filter_option_verification'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/Tickets/support_filter_option_verification'))

WebUI.setText(findTestObject('Page_Bitsane_Support/Tickets/support_subject'), 'some test subject')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_message_ticket'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Support/Tickets/support_message_ticket'), 'my test message')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_submit_ticket'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/Tickets/support_submit_ticket'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_1st_ticket_list'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/Tickets/support_1st_ticket_list'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_reply_message_area'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Support/Tickets/support_reply_message_area'), '123412xadasqeqe')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_reply_ticket_btn'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/Tickets/support_reply_ticket_btn'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_close_ticket_btn'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/Tickets/support_close_ticket_btn'))

WebUI.closeBrowser()

