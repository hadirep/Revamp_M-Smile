import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.bankmega.msmiledev')

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.setText(findTestObject('null'), '088230002000', 
    0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.verifyElementText(findTestObject('null'), 
	'SMARTFREN')

Mobile.verifyElementText(findTestObject('null'), 
    'CUSTOMER DUMMY POSTPAID')

Mobile.verifyElementText(findTestObject('null'), 
	'088230002000')

Mobile.verifyElementText(findTestObject('null'), 'Rp. 50.000')

Mobile.verifyElementText(findTestObject('null'), 
	'Rp. 0')

Mobile.verifyElementText(findTestObject('null'), 
	'Rp. 50.000')

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.setText(findTestObject('null'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.verifyElementText(findTestObject('null'), 
    'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('null'), 'Rp. 50.000')

Mobile.verifyElementText(findTestObject('null'), '088230002000')

Mobile.verifyElementText(findTestObject('null'), 
    'CUSTOMER DUMMY POSTPAID')

Mobile.verifyElementText(findTestObject('null'), 'Rp. 50.000')

Mobile.verifyElementText(findTestObject('null'), 'Rp. 0')

Mobile.verifyElementText(findTestObject('null'), 
	'Rp. 50.000')

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('null'),
	'Data', 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('null'), 0)

Mobile.takeScreenshot()

Mobile.pressBack()

Mobile.pressBack()

Mobile.tapAtPosition(1140, 465)

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.closeApplication()

