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

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Dormant\\1.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/XL/02.ViewGroup - Telepon'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Dormant\\2.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/XL/03.EditText - Daftar Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/XL/04.TextView - XL'), 0)

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/006.TextView - Nomor Tagihan'), 0)

Mobile.setText(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/005.EditText - Input nomor'), '087788142422', 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Dormant\\3.png')

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/007.ViewGroup - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Dormant\\4.png')

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/008.ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/09.ViewGroup - Total Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/10.EditText - Input Pin'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Telepon/Indosat/11.EditText - PIN'), '111111', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Dormant\\5.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/12.ScrollView - Close Keyboard'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Dormant\\6.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/13.ViewGroup - Bayar'), 0)

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/013.ViewGroup - Notic error'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Dormant\\7.png')

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/015.ViewGroup - Error Notice'), 0)

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/016.TextView - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Dormant\\8.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Dormant\\9.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Dormant\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-BAYAR - Telepon - XL - Dormant\\11.png')

Mobile.closeApplication()

