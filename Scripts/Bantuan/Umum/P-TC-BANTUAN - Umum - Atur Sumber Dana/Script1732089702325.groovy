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

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/001.PathView- Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/002.RectView - Umum'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/003.PathView - Close session'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/003TextView - Atur sumber dana'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/004.TextView - Question Atur sumber dana 1'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/004.TextView - Answer Atur sumber dana 1.1'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/004.TextView - Answer Atur sumber dana 1.2'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/004.TextView - Answer Atur sumber dana 1.3'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/004.TextView - Answer Atur sumber dana 1.4'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/005.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/005.TextView - Question Atur sumber dana 2'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/006.TextView - Answer Atur sumber dana 2.1'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/006.TextView - Answer Atur sumber dana 2.2'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/006.TextView - Answer Atur sumber dana 2.3'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/006.TextView - Answer Atur sumber dana 2.4'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/006.TextView - Answer Atur sumber dana 2.5'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/007.ViewGroup - Kembali'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Atur Sumber Dana/008.ViewGroup - Kembali'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

