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

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Delivery Tracking\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/002.RectView - Kartu Kredit'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/003.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Delivery Tracking\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/004.TextView - Delivery Tracking'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/005.TextView - Question Delivery Tracking 1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/005.TextView - Answer Delivery Tracking 1.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/005.TextView - Answer Delivery Tracking 1.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/005.TextView - Answer Delivery Tracking 1.3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Delivery Tracking\\03.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/006.ViewGroup - Kembali (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/008.TextView - Question Delivery Tracking 2'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/007.TextView - Answer Delivery Tracking 2'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Delivery Tracking\\04.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/006.ViewGroup - Kembali'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Delivery Tracking\\05.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/009.Viewgroup - Kembali'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Delivery Tracking\\06.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Delivery Tracking/010.ViewGroup - Kembali kepusat bantuan'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Delivery Tracking\\07.png')

Mobile.closeApplication()//