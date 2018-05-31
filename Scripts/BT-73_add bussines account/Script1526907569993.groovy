import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
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
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.bitsane.com/')

not_run: WebUI.maximizeWindow()

WebUI.setViewPortSize(1920, 1080)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane/a_Log in'), 2)

WebUI.click(findTestObject('Page_Bitsane/a_Log in'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_login'), 2)

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_login'), 'ax.kubitsky@gmail.com')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_password'), 2)

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_password'), '807a4F3f3')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_send'), 2)

WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/profile_admin'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/profile_admin'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/a_Accounts'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/a_Accounts'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/a_Add business account'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/a_Add business account'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_company_name'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_company_name'), '1111111111111')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_address'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_address'), '111111111111111111')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_manager_name'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_manager_name'), 'zzzzzzzzzzzzz')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_city'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_city'), '11111111111111111')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_date_of_incorp'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/input_date_of_incorp'))

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_date_of_incorp'), '11-10-2011')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_state'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_state'), 'zzzzzzzzzzzzzz')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/registration number field'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/registration number field'), RandomStringUtils.randomNumeric(7))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_country_select'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/input_country_select'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/span_Afghanistan'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/span_Afghanistan'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/select_select countryAfghanist'), 2)

WebUI.selectOptionByValue(findTestObject('Page_Bitsane_Profile/select_select countryAfghanist'), 'AF', true)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_VAT_code'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_VAT_code'), '111111')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_post_code'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_post_code'), '1001')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_phone'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_phone'), '+11111')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/add_account_btn'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/add_account_btn'))

WebUI.delay(2)

WebUI.closeBrowser()

