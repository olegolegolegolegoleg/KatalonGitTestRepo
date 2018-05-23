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

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Deposit_button_BTC'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Deposit_button_BTC'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/btn_copy_adress_btc'), 2)

WebUI.waitForElementClickable(findTestObject('Page_Bitsane_Balances/Wallets/btn_copy_adress_btc'), 2)

WebUI.verifyTextPresent('Transferring any other currency than BTC to this deposit address might result in loss of your deposit.', 
    false)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Deposit_adress_BTC'), 2)

depositAddressBtc = WebUI.getAttribute(findTestObject('Page_Bitsane_Balances/Wallets/Deposit_adress_BTC'), 'value')

WebUI.navigateToUrl('https://wallet.btc.com/?_ga=2.73534870.548114136.1526374655-30268635.1526374655#/setup/login')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_login'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_login'), 'alwx.mason@polaz.com')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_pass'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_pass'), '807a4F3f3')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_login_button'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_login_button'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_menu_send'), 2)

WebUI.verifyElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_menu_send'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_menu_send'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_modal_window'), 2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_modal_window_decline'), 2)

WebUI.verifyElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_modal_window'))

WebUI.click(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_modal_window_decline'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_recipient_address'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_recipient_address'), depositAddressBtc)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_amount'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_amount'), '0.001')

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_submit_button'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_submit_button'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/Submit_password'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/BTC_Wallet/Submit_password'))

WebUI.setText(findTestObject('Page_Bitsane_Balances/BTC_Wallet/Submit_password'), '807a4F3f3')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_K_button'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/BTC_Wallet/BTC_K_button'))

WebUI.delay(3)

WebUI.closeBrowser()

