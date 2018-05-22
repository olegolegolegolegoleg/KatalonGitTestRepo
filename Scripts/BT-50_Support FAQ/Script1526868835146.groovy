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

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Page_Bitsane_Support/FAQ/supp_verification_menu'))

WebUI.verifyTextPresent('We understand that verification process can be frustrating.', false)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_Where do I enable two fact'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_What can I use your api fo'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_What is API'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_How do I redeem a voucher'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_How do I create a voucher'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_What is a voucher'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_Is there a minimal amount'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_How do I cancel an order'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_I have placed an order and'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_What is the makertaker fee'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_Who are maker and taker'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_What is a limit order'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_What is a market order'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_How do I place an order'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_I have forgotten to enter'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_I accidentally sent my BTC'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_I deposited cryptocurrency'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_How do I withdraw fiat (EU'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_How do I deposit fiat'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_How do I withdraw cryptocu'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_How do I deposit cryptocur'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_How can I credit my accoun'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_I live with my parentsrela'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_There is no expiry date on'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_Business account verificat'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_What are the documents req'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_Where can I upload my docu'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_How long does it take to g'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_Do I need to verify my acc'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_It says that my email is a'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_I havent received an activ'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (15)/div_How to register with Bitsa'))

WebUI.delay(1)

WebUI.closeBrowser()

