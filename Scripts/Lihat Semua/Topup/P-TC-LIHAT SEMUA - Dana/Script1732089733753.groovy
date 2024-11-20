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

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Dana/01.ViewGroup - Lihat Semua'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - Dana\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Dana/02.ViewGroup - Dana'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - Dana\\02.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Dana/04.EditText - Input Nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Topup/Dana/05.EditText - Nomor Dana'), '082113611992', 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Dana/03.TextView - Dana'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - Dana\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Dana/06.ViewGroup - Lanjut ke e-wallet'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Dana/07.PathView - Lihat Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Dana/09.TextView - E-Wallet'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - Dana\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Dana/10.ViewGroup - Back to Input nomor'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - Dana\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Dana/11.ViewGroup - Back to lihat semua'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - Dana\\06.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Dana/12.ViewGroup - Back to Menu utama'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - Dana\\07.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - Dana\\08.png')

Mobile.closeApplication()

