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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.bitsane.com/')

not_run: WebUI.maximizeWindow()

WebUI.setViewPortSize(1920, 1080)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane/a_Log in'), 2)

WebUI.click(findTestObject('Page_Bitsane/a_Log in'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_login'), 2)

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_login'), 'vahe@ethersportz.info')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_password'), 2)

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_password'), '807a4F3f3')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane Exchange  Login/input_send'), 2)

WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/profile'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/profile'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/Personal_information/personal_info_li'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/Personal_information/personal_info_li'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/Personal_information/profile_first_name'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/Personal_information/profile_first_name'), 'alwxtest')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/Personal_information/profile_last_name'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/Personal_information/profile_last_name'), 'testovich')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/Personal_information/profile_middle_name'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/Personal_information/profile_middle_name'), 'zzzzzzzzzzzzz')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/Personal_information/profile_date_of_birth'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/Personal_information/profile_date_of_birth'))

WebUI.setText(findTestObject('Page_Bitsane_Profile/Personal_information/profile_date_of_birth'), '03-95-1992')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/Personal_information/profile_street_name'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/Personal_information/profile_street_name'))

WebUI.setText(findTestObject('Page_Bitsane_Profile/Personal_information/profile_street_name'), 'wtf, 12')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_city'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_city'), '11111111111111111')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_state'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_state'), 'zzzzzzzzzzzzzz')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/Personal_information/profile_id_number'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/Personal_information/profile_id_number'), RandomStringUtils.randomNumeric(
        6))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_post_code'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_post_code'), '1001')

WebUI.click(findTestObject('Page_Bitsane_Profile/Personal_information/profile_document_span'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Bitsane_Profile/Personal_information/profile_document_passport'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/Personal_information/profile_date_of_expiry'), 2)

WebUI.setText(findTestObject('Page_Bitsane_Profile/Personal_information/profile_date_of_expiry'), '09-02-2023')

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Profile/input_phone'), 2)

WebUI.click(findTestObject('Page_Bitsane_Profile/input_phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Bitsane_Profile/input_phone'), '+11111')

WebUI.verifyElementVisible(findTestObject('Page_Bitsane_Profile/Personal_information/profile_save_btn'))

WebUI.click(findTestObject('Page_Bitsane_Profile/Personal_information/profile_save_btn'))

WebUI.delay(1)

WebUI.closeBrowser()

