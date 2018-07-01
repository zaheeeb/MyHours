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

'Click on Manage menu'
WebUI.click(findTestObject('3.CreateInvoice_Object_Repository/a_Manage'))

'Click on Invoivce sub menu'
WebUI.click(findTestObject('3.CreateInvoice_Object_Repository/a_Invoices'))

'Click on Create invoice link'
WebUI.click(findTestObject('3.CreateInvoice_Object_Repository/a_Create New Invoice'))

WebUI.click(findTestObject('3.CreateInvoice_Object_Repository/input_ng-pristine ng-untouched'))

'check box is checked'
WebUI.click(findTestObject('3.CreateInvoice_Object_Repository/button_Invoice selected'))

'Tax name entry'
WebUI.setText(findTestObject('3.CreateInvoice_Object_Repository/input_tax-name'), 'GST')

'tax percentage'
WebUI.setText(findTestObject('3.CreateInvoice_Object_Repository/input_tax-value'), '14')

'text on invoice is entered'
WebUI.setText(findTestObject('3.CreateInvoice_Object_Repository/textarea_invoice-text'), 'invoice text')

'hidden note is added'
WebUI.setText(findTestObject('3.CreateInvoice_Object_Repository/textarea_invoice-note'), 'note not show on invoice.')

'create button is clicked'
WebUI.click(findTestObject('3.CreateInvoice_Object_Repository/button_Create'))


