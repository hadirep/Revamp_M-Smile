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

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/XL/01.ViewGroup - Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Insufficient\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/XL/02.ViewGroup - Telepon'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Insufficient\\02.png')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(900, 500, 100, 500)

Mobile.swipe(900, 500, 100, 500)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/XL/03.EditText - Daftar Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/XL/04.TextView - XL'), 0)

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/006.TextView - Nomor Tagihan'), 0)

Mobile.setText(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/005.EditText - Input nomor'), '087788142422', 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Insufficient\\03.png')

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/007.ViewGroup - OK'), 0)

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/008.ViewGroup - Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Insufficient\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/XL/09.EditText - input pin'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Telepon/XL/10.EditText - PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/XL/11.ScrollView - Close keyboard'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Insufficient\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/XL/07.TextView - Bayar'), 0)

Mobile.tap(findTestObject('Bayar/Telepon/XL/15.ViewGroup - insufficient notice'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Insufficient\\06.png')

Mobile.tap(findTestObject('Bayar/Telepon/XL/16.TextView - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Insufficient\\07.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Insufficient\\08.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Insufficient\\09.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Insufficient\\10.png')

Mobile.closeApplication()

