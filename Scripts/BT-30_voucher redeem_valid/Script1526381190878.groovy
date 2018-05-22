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

WebUI.click(findTestObject('Page_Bitsane_Balances/Vouchers/a_Vouchers'))

voucherRedeem = WebUI.getAttribute(findTestObject('Page_Bitsane_Balances/Vouchers/i_fa fa-files-o'), 'value')

WebUI.setText(findTestObject('Page_Bitsane_Balances/Vouchers/input_create-voucher-amount REDEEM'), voucherRedeem)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Vouchers/input_create-voucher-pin pin-f -REDEEM'), '1111')

WebUI.click(findTestObject('Page_Bitsane_Balances/Vouchers/button_Redeem voucher'))

WebUI.waitForElementPresent(findTestObject('Page_Bitsane_Balances/Vouchers/success notify'), 1)

WebUI.closeBrowser()

