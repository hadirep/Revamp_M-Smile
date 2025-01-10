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

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/01.ViewGroup - Top Up'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/02.View - Paket Data'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/03.EditText - Set Nomor HP'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/04.EditText - Masukan Nomor'), '0895634311811', 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/05.ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/06.PathView - Pilih Paket'), 0)

Mobile.scrollToText('Happy 75GB')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/07.ViewGroup - Happy 75GB'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/08.PathView - Plih Waktu Transaksi'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/09.TextView - Sekarang'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/10.ViewGroup - Konfirmasi Pembayaran'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/11.EditText - Set PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/12.EditText - Input PIN'), '111111', 0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\07.png')

Mobile.tap(findTestObject('Topup/Paket Data/TRI/TRI-Dormant/13.ViewGroup - Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\08.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/14.ViewGroup - Notice Error'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\09.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/15.TextView - OK'), 0)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\07.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\08.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\09.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\11.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\12.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\13.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\12.png')

Mobile.pressBack()

Mobile.closeApplication()

