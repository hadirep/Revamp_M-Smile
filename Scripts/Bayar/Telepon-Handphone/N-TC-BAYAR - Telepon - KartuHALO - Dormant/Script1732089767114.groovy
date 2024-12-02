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

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - KartuHALO - Dormant\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/KartuHALO/02.ViewGroup - Telepon'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/KartuHALO/03.EditText - Daftar produk'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/KartuHALO/04.TextView - KARTUHALO'), 0)

Mobile.tap(findTestObject('Bayar/Telepon/KartuHALO/05.ViewGroup - Input Nopel'), 0)

Mobile.setText(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/005.EditText - Input nomor'), '08113236564', 
    0)

Mobile.tap(findTestObject('Bayar/Telepon/KartuHALO/Insufficient - Dormant/009.ScrollView - close tab'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - KartuHALO - Dormant\\02.png')

Mobile.tap(findTestObject('Bayar/Telepon/KartuHALO/07.ViewGroup - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - KartuHALO - Dormant\\03.png')

Mobile.tap(findTestObject('Bayar/Telepon/KartuHALO/08.ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/09.ViewGroup - Total Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/10.EditText - Input Pin'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Telepon/Indosat/11.EditText - PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/12.ScrollView - Close Keyboard'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - KartuHALO - Dormant\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Indosat/13.ViewGroup - Bayar'), 0)

Mobile.tap(findTestObject('Bayar/Telepon/Indosat/Insufficient - Dormant/013.ViewGroup - Notic error'), 0)

Mobile.tap(findTestObject('Bayar/Pajak-MPN/Pajak Negara/12.TextView - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - KartuHALO - Dormant\\05.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - KartuHALO - Dormant\\06.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - KartuHALO - Dormant\\07.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - KartuHALO - Dormant\\08.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - KartuHALO - Dormant\\09.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - KartuHALO - Dormant\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - Telepon - KartuHALO - Dormant\\11.png')

Mobile.closeApplication()

