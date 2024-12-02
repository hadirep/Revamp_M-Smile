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

Mobile.startExistingApplication('com.bankmega.msmiledev', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/01.ViewGroup - Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/02.ViewGroup - Telepon'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(900, 500, 100, 500)

Mobile.swipe(900, 500, 100, 500)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/03.ViewGroup - Daftar Produk'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/04.TextView - INDOSAT OOREDOO'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\04.png')

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/006.TextView - Nomor Tagihan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\05.png')

Mobile.setText(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/005.EditText - Input nomor'), '085886894278', 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\06.png')

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/007.ViewGroup - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\07.png')

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/008.ViewGroup - Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/09.ViewGroup - Total Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/10.EditText - Input Pin'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\09.png')

Mobile.setText(findTestObject('Object Repository/Bayar/Telepon/Indosat/11.EditText - PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/12.ScrollView - Close Keyboard'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/13.ViewGroup - Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\11.png')

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/015.ViewGroup - Error Notice'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\12.png')

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/016.TextView - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\13.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\14.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\15.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - Indosat - Insufficient\\16.png')

Mobile.closeApplication()

