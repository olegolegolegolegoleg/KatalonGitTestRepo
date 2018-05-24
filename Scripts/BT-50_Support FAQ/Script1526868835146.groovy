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

WebUI.navigateToUrl('https://stage.bitsane.com/help/faq')

not_run: WebUI.maximizeWindow()

WebUI.setViewPortSize(1920, 1080)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/supp_verification_menu'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/FAQ/supp_verification_menu'))

WebUI.verifyTextPresent('We understand that verification process can be frustrating.', false)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_Where do I enable two fact'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_Where do I enable two fact'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_What can I use your api fo'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_What can I use your api fo'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_What is API'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_What is API'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_How do I redeem a voucher'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_How do I redeem a voucher'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_How do I create a voucher'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_How do I create a voucher'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_What is a voucher'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_What is a voucher'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_Is there a minimal amount'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_Is there a minimal amount'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_How do I cancel an order'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_How do I cancel an order'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_I have placed an order and'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_I have placed an order and'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_What is the makertaker fee'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_What is the makertaker fee'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_Who are maker and taker'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_Who are maker and taker'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_What is a limit order'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_What is a limit order'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_What is a market order'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_What is a market order'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_How do I place an order'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_How do I place an order'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_I have forgotten to enter'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_I have forgotten to enter'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_I accidentally sent my BTC'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_I accidentally sent my BTC'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_I deposited cryptocurrency'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_I deposited cryptocurrency'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_How do I withdraw fiat (EU'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_How do I withdraw fiat (EU'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_How do I deposit fiat'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_How do I deposit fiat'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_How do I withdraw cryptocu'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_How do I withdraw cryptocu'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_How do I deposit cryptocur'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_How do I deposit cryptocur'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_How can I credit my accoun'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_How can I credit my accoun'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_I live with my parentsrela'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_I live with my parentsrela'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_There is no expiry date on'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_There is no expiry date on'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_Business account verificat'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_Business account verificat'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_What are the documents req'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_What are the documents req'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_Where can I upload my docu'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_Where can I upload my docu'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_How long does it take to g'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_How long does it take to g'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_Do I need to verify my acc'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_Do I need to verify my acc'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_It says that my email is a'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_It says that my email is a'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_I havent received an activ'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_I havent received an activ'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/div_How to register with Bitsa'), 2)

WebUI.click(findTestObject('Page_Bitsane_Support/div_How to register with Bitsa'))

WebUI.closeBrowser()

