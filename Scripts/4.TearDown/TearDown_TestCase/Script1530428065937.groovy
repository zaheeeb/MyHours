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

WebUI.click(findTestObject('4.Teardown_Object_Repository/button_Delete this invoice'))

WebUI.click(findTestObject('4.Teardown_Object_Repository/button_Confirm'))

WebUI.waitForElementPresent(findTestObject('4.Teardown_Object_Repository/span_Track'), 1)

WebUI.click(findTestObject('4.Teardown_Object_Repository/span_Track'))

//while (WebUI.verifyElementPresent(findTestObject('4.Teardown_Object_Repository/td_col-md-2 text-right table-c'), 20) == 
//true) {
  //  if (WebUI.verifyElementPresent(findTestObject('4.Teardown_Object_Repository/td_col-md-2 text-right table-c'), 20) == 
    //false) {
      //  break
    //} else {
        WebUI.waitForElementPresent(findTestObject('4.Teardown_Object_Repository/button_deleteTodayLog'), 1)

        WebUI.click(findTestObject('4.Teardown_Object_Repository/button_deleteTodayLog'))

        WebUI.waitForElementPresent(findTestObject('4.Teardown_Object_Repository/button_OK'), 1)

        WebUI.click(findTestObject('4.Teardown_Object_Repository/button_OK'))
    //}
//}
