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

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Payment/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Payment\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Payment/002.RectView - Kartu Kredit'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Payment\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Payment/003.PathView - Close Session'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Payment/004.TextView - Payment'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Payment/005.TextView - Question Payment 1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Payment/006.TextView - Answer Payment 1.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Payment/006.TextView - Answer Payment 1.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Payment/006.TextView - Answer Payment 1.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Payment/006.TextView - Answer Payment 1.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Payment/006.TextView - Answer Payment 1.5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Payment/006.TextView - Answer Payment 1.6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Payment\\03.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Payment\\04.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Payment\\05.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Payment\\06.png')

Mobile.closeApplication()//