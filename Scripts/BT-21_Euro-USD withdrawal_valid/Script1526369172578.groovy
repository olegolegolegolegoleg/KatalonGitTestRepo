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

WebUI.waitForElementVisible(findTestObject('Page_Bitsane/a_Log in'), 2)

WebUI.click(findTestObject('Page_Bitsane/a_Log in'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_login'), 2)

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_login'), 'ax.kubitsky@gmail.com')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_password'), 2)

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_password'), '807a4F3f3')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_send'), 2)

WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Bitcoin Cash/a_Balances'), 2)

WebUI.click(findTestObject('Page_Bitsane Exchange  Bitcoin Cash/a_Balances'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_EURO'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_EURO'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Advcash_withdrawal_EURO'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Advcash_withdrawal_EURO'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Advcash_withdrawal_amount_EURO'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Advcash_withdrawal_amount_EURO'), '0.5')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Advcash_recipient_EURO'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Advcash_recipient_EURO'), 'alwx.mason@gmail.com')

WebUI.verifyElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Advcash_withdrawal_button_EURO'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.closeBrowser()

