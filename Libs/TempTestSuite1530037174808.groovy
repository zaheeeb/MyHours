import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/MyHours_TestSuite')

suiteProperties.put('name', 'MyHours_TestSuite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Zahir\\Katalon Studio\\MyHours_Assignment\\Reports\\MyHours_TestSuite\\20180626_211934\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/MyHours_TestSuite', suiteProperties, [new TestCaseBinding('Test Cases/Login/Login_TestCase', 'Test Cases/Login/Login_TestCase',  [ 'varPassword' : 'test12345' , 'varUserName' : 'zaheeeb@gmail.com' ,  ]), new TestCaseBinding('Test Cases/TrackActivity/NewActivity_TestCase', 'Test Cases/TrackActivity/NewActivity_TestCase',  null)])
