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

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/002.RectView - Kartu Kredit'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/003.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/004.TextView - Perubahan Data'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/005.TextView - Question Delivery Tracking 1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/005.TextView - Answer Delivery Tracking 1.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/005.TextView - Answer Delivery Tracking 1.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/005.TextView - Answer Delivery Tracking 1.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/005.TextView - Answer Delivery Tracking 1.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/005.TextView - Answer Delivery Tracking 1.5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/005.TextView - Answer Delivery Tracking 1.6'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/005.TextView - Answer Delivery Tracking 1.6 (1)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/006.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/007.TextView - Question Delivery Tracking 2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/007.TextView - Answer Delivery Tracking 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/008.ViewGroup - Kembali'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Perubahan Data/006.ViewGroup - Kembali ke pusat bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.closeApplication()

