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
import org.openqa.selenium.Keys as Keys

'wait for elements to be visible'
WebUI.waitForElementVisible(findTestObject('1.Login_Object_Repository/input_email'), 2)

'Fill username'
WebUI.setText(findTestObject('1.Login_Object_Repository/input_email'), varUserName)

'Fill password'
WebUI.setText(findTestObject('1.Login_Object_Repository/input_password'), varPassword)

'Click Login'
WebUI.click(findTestObject('1.Login_Object_Repository/button_Sign in'), FailureHandling.STOP_ON_FAILURE)

'Get expected status for wrong password'

switch (varLoginMessage.toString()) 
{
    case 'wrong_password':
        def errorMsg = WebUI.getText(findTestObject('1.Login_Object_Repository/div_There was a problem with a'))
		WebUI.verifyEqual(errorMsg.contains('There was a problem with authenticating: Invalid username or password..'), true)
		break;
}

@com.kms.katalon.core.annotation.SetUp
def setup() {
    WebUI.openBrowser(varApplicationUrl)
}

