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

WebUI.click(findTestObject('2.NewActivity_Object_Repository/i_caret pull-right'))

WebUI.click(findTestObject('2.NewActivity_Object_Repository/span_Project'))

WebUI.click(findTestObject('2.NewActivity_Object_Repository/i_caret pull-right_1'))

WebUI.click(findTestObject('2.NewActivity_Object_Repository/span_Meeting With Client'))

not_run: WebUI.waitForElementPresent(findTestObject('2.NewActivity_Object_Repository/input_form-control ng-pristine'), 2)

WebUI.click(findTestObject('2.NewActivity_Object_Repository/input_form-control ng-pristine'))

WebUI.setText(findTestObject('2.NewActivity_Object_Repository/input_form-control ng-pristine'), startTime)

WebUI.sendKeys(findTestObject('2.NewActivity_Object_Repository/input_form-control ng-pristine'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('2.NewActivity_Object_Repository/input_form-control ng-pristine'))

WebUI.setText(findTestObject('2.NewActivity_Object_Repository/input_form-control ng-pristine'), '02')

WebUI.setText(findTestObject('2.NewActivity_Object_Repository/input_addCost'), '10')

WebUI.doubleClick(findTestObject('2.NewActivity_Object_Repository/textarea_form-control ng-untou'))

WebUI.setText(findTestObject('2.NewActivity_Object_Repository/textarea_form-control ng-untou'), 'description')

WebUI.click(findTestObject('2.NewActivity_Object_Repository/button_Submit'))

