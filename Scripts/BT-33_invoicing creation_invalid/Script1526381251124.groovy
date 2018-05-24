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

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_login'), 'ax.kubitsky@gmail.com')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_password'), '807a4F3f3')

WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Bitcoin Cash/a_Balances'))

WebUI.click(findTestObject('Page_Bitsane_Balances/Invoicing/Invoices_menu_link'))

WebUI.verifyElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Sell_button'))

WebUI.verifyElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Buy_button'))

WebUI.verifyElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/USD_button'))

WebUI.verifyElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/EUR_button'))

WebUI.verifyElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Datepicker_from'))

WebUI.verifyElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Select_invoices'))

WebUI.verifyElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Create_invoice'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Sell_button'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Invoicing/Sell_button'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/EUR_button'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Invoicing/EUR_button'))

WebUI.setText(findTestObject('Page_Bitsane_Balances/Invoicing/Datepicker_from'), '09-05-18')

WebUI.setText(findTestObject('Page_Bitsane_Balances/Invoicing/Datepicker_to'), '15-05-14')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Select_invoices'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Invoicing/Select_invoices'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Invoices_error_button'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Invoicing/Invoices_error_button'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Create_invoice'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Invoicing/Create_invoice'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Invoices_error_button'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Invoicing/Invoices_error_button'))

Date today = new Date()

String todaysDate = today.format('dd-MM-yy')

WebUI.setText(findTestObject('Page_Bitsane_Balances/Invoicing/Datepicker_from'), todaysDate)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Invoicing/Datepicker_to'), todaysDate)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Select_invoices'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Invoicing/Select_invoices'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Checkbox_specifix_second'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Invoicing/Checkbox_specifix_second'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/Create_invoice'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Invoicing/Create_invoice'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Invoicing/pdf link'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Invoicing/pdf link'))

WebUI.closeBrowser()

