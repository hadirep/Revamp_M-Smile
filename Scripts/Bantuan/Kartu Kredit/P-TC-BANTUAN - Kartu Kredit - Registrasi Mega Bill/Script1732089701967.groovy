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

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/002.RectView - Kartu Kredit'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/003.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.scrollToText('Registrasi Mega Bill')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Registrasi Mega Bill/005.TextView - Registrasi Mega Bill'), 0)

Mobile.scrollToText('Apa itu fitur Registrasi Mega Bill di aplikasi M-Smile?', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Registrasi Mega Bill/005.TextView - Answer RMB 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/006.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Registrasi Mega Bill/007.TextView - Question RMB 2'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Registrasi Mega Bill/007.TextView - Answer RMB 2.1'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Registrasi Mega Bill/007.TextView - Answer RMB 2.2'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Registrasi Mega Bill/007.TextView - Answer RMB 2.3'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Registrasi Mega Bill/007.TextView - Answer RMB 2.4'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Registrasi Mega Bill/007.TextView - Answer RMB 2.5'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Registrasi Mega Bill/007.TextView - Answer RMB 2.6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/006.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Registrasi Mega Bill/009.TextView - Question RMB 3'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Registrasi Mega Bill/007.TextView - Answer RMB 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/006.ViewGroup - Kembali'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/007.ViewGroup - Kembali ke pusat bantuan'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.closeApplication()

