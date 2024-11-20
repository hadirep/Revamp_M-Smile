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

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Grab Driver/01.ViewGroup - Lihat semua'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - GrabDriver\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Grab Driver/02.ViewGroup - Grabdriver'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - GrabDriver\\02.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Grab Driver/03.EditText - Input nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Topup/Grab Driver/04.EditText - Nomor Grabdriver'), '087785626440', 
    0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Grab Driver/05.TextView - Grab Driver'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - GrabDriver\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Grab Driver/06.ViewGroup - Lanjut ke e-wallet'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Grab Driver/07.PathView - Lihat saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Grab Driver/09.TextView - E-Wallet'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - GrabDriver\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Grab Driver/10.ViewGroup - Back to input nomor'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - GrabDriver\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Grab Driver/11.ViewGroup - Back to lihat semua'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - GrabDriver\\06.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Grab Driver/12.ViewGroup - Backto menu utama'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - GrabDriver\\07.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - GrabDriver\\08.png')

Mobile.closeApplication()

