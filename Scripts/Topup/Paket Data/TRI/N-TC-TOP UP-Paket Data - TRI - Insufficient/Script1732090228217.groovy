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

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/01.ViewGroup - Top Up'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/02.View - Paket Data'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/03.EditText - Add Number'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/04.EditText - input number'), 
    '08951234567', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/05.ViewGroup - Lanjut'), 0)

Mobile.delay(2)

Mobile.swipe(900, 500, 100, 500)

Mobile.swipe(900, 500, 100, 500)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/06.SvgView - Pilih Paket'), 0)

Mobile.tap(findTestObject('Topup/Paket Data/TRI/TRI-Dormant/07.ViewGroup - Happy 10GB'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/08.PathView - Waktu Transaksi'), 
    0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/09.TextView - Sekarang'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/10.ViewGroup - Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Dormant\\07.png')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Topup/Paket Data/TRI/TRI-Dormant/11.EditText - M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/TRI/TRI-Dormant/12.EditText - Input PIN'), '111111', 
    0)

Mobile.tap(findTestObject('Topup/Paket Data/TRI/TRI-Dormant/13.ScrollView - Close Tab'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\08.png')

Mobile.tap(findTestObject('Topup/Paket Data/TRI/TRI-Dormant/14.TextView - LANJUT'), 0)

Mobile.tap(findTestObject('Topup/Paket Data/TRI/TRI-Dormant/15.ViewGroup - Notif Error Insufficient'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\09.png')

Mobile.tap(findTestObject('Topup/Paket Data/TRI/TRI-Dormant/16.TextView - OK (Insufficient)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\10.png')

Mobile.closeApplication()

