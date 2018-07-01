import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.eclipse.persistence.internal.oxm.record.json.JSONParser.value_return as value_return
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

'delete invoice'
WebUI.click(findTestObject('4.Teardown_Object_Repository/button_Delete this invoice'))

'confirm deletion'
WebUI.click(findTestObject('4.Teardown_Object_Repository/button_Confirm'))

WebUI.waitForElementVisible(findTestObject('4.Teardown_Object_Repository/span_Track'), 1)

'click track menu'
WebUI.click(findTestObject('4.Teardown_Object_Repository/span_Track'))

while (true) {
    'get button attribute'
    button = WebUI.getAttribute(findTestObject('4.Teardown_Object_Repository/button_deleteTodayLog'), 'id')

    'verify that button value is not null'
    if (button != null) {
        WebUI.waitForElementPresent(findTestObject('4.Teardown_Object_Repository/button_deleteTodayLog'), 1)

        'delete hour entry'
        WebUI.click(findTestObject('4.Teardown_Object_Repository/button_deleteTodayLog'))

        'confirm'
        WebUI.click(findTestObject('4.Teardown_Object_Repository/button_OK'))
    } else {
        break
    }
}

