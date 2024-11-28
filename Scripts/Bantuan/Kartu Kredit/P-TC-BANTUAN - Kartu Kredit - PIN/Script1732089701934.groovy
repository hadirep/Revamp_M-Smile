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

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - PIN\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/002.RectView - Kartu Kredit'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/003.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - PIN\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/004.TextView - PIN'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/005.TextView - Question PIN 1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/005.TextView - Answer PIN 1.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/005.TextView - Answer PIN 1.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/005.TextView - Answer PIN 1.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/005.TextView - Answer PIN 1.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/005.TextView - Answer PIN 1.5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/005.TextView - Answer PIN 1.6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - PIN\\03.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/006.ViewGroup - Kembali'), 0)

Mobile.scrollToText('Apakah Saya harus memasukkan PIN lama saat mengubah PIN kartu kredit di aplikasi M-Smile?', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/007.TextView - Question PIN 2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/005.TextView - Answer PIN 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - PIN\\04.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/006.ViewGroup - Kembali'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - PIN\\05.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/PIN/009.ViewGroup - Kembali ke pusat bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - PIN\\06.png')

Mobile.closeApplication()//

