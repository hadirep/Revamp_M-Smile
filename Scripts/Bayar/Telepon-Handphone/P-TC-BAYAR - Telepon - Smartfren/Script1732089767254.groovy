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

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/01.ViewGroup - Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/02.ViewGroup - Telephone'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(900, 500, 100, 500)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/03.EditText - Daftar Produk'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/04.TextView - SMARTFREN'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/05.TextView - Nomor PelangganTagihan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/06.EditText - Input Baru'), 0)

Mobile.setText(findTestObject('Bayar/Telepon/Smartfren/06.EditText - Input Baru'), '088230002000', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/08.ScrollView - Close Tab'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/09.ViewGroup - Lanjut ke sumber dana'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/10.ViewGroup - Lanjut konfirmasi'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/11.EditText - Input PIN'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\09.png')

Mobile.setText(findTestObject('Bayar/Telepon/Smartfren/11.EditText - Input PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/13.ScrollView - Close Tab'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Smartfren/14.ViewGroup - Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\11.png')

Mobile.tap(findTestObject('Bayar/Telepon/Smartfren/16.ViewGroup - Pembayaran berhasil'), 0)

Mobile.tap(findTestObject('Bayar/Telepon/Smartfren/17.TextView - Pembayaran Berhasil'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\12.png')

Mobile.tap(findTestObject('Bayar/Telepon/Smartfren/18.ViewGroup - Bagikan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\13.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\14.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\15.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\16.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\17.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-BAYAR - Telepon - Smartfren\\18.png')

Mobile.closeApplication()

