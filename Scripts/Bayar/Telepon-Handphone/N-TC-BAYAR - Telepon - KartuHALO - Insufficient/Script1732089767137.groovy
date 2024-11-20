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

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/KartuHALO/01.ViewGroup - Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/KartuHALO/02.ViewGroup - Telepon'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\02.png')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(900, 500, 100, 500)

Mobile.swipe(900, 500, 100, 500)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/KartuHALO/03.EditText - Daftar produk'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/KartuHALO/04.TextView - KARTUHALO'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\04.png')

Mobile.tap(findTestObject('Bayar/Telepon/KartuHALO/05.ViewGroup - Input Nopel'), 0)

Mobile.setText(findTestObject('Bayar/Telepon/KartuHALO/05.EditText - Input Baru'), '08113236564', 0)

Mobile.tap(findTestObject('Bayar/Telepon/KartuHALO/Insufficient - Dormant/009.ScrollView - close tab'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\05.png')

Mobile.tap(findTestObject('Bayar/Telepon/KartuHALO/07.ViewGroup - OK'), 0)

Mobile.tap(findTestObject('Bayar/Telepon/KartuHALO/08.ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/KartuHALO/09.ViewGroup - Total Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/KartuHALO/10.ViewGroup - Input PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Telepon/KartuHALO/11.EditText - PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/KartuHALO/12.ScrollView - Close Keyboard'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\06.png')

Mobile.tap(findTestObject('Bayar/Telepon/KartuHALO/Insufficient - Dormant/011.ViewGroup - Bayar'), 0)

Mobile.tap(findTestObject('Bayar/Telepon/KartuHALO/Insufficient - Dormant/012.ViewGroup - Error insufficient'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\07.png')

Mobile.tap(findTestObject('Bayar/Telepon/KartuHALO/Insufficient - Dormant/013.TextView - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\08.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\09.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\11.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\12.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Kartu HALO - Insufficient\\13.png')

Mobile.closeApplication()

