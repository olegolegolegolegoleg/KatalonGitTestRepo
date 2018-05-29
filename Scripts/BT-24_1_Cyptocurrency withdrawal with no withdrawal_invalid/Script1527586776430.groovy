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

WebUI.waitForPageLoad(1)

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

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_BTC'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_BTC'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'))

WebUI.delay(1)

WebUI.verifyTextPresent('Field is required', false)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_amount_BTC'), '0')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'))

WebUI.delay(1)

WebUI.verifyTextPresent('Amount is less than minimal', false)

WebUI.verifyTextPresent('amount should be more than fee', false)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_amount_BTC'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_amount_BTC'), '0.0001')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_address_BTC'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_address_BTC'), 'фыва4й4цукйукафыафыа')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'))

WebUI.delay(1)

WebUI.verifyTextPresent('Address format is not valid', false)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_amount_BTC'), 2)

WebUI.waitForElementClickable(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_amount_BTC'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_amount_BTC'), '0.001')

WebUI.waitForElementPresent(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_address_BTC'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_address_BTC'), '3KrczCtV2fr37BC8eQsC7mBh6JxoBuJHyS')

WebUI.waitForElementPresent(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'), 2)

WebUI.delay(2)

WebUI.closeBrowser()

