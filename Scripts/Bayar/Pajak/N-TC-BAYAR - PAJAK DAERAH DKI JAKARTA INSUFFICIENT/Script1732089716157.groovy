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

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/01.ViewGroup - Bayar'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/02.SvgView - Pajak MPN'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(900, 500, 100, 500)

Mobile.swipe(900, 500, 100, 500)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/03.EditText - Daftra Produk'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/04.TextView - PAJAK DAERAH (DKI Jakarta)'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/05.ViewGroup - Nopel'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/06.EditText - Input Baru'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\06.png')

Mobile.setText(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/07.EditText - Input Baru Nopel'), 
    '003456786100', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/08.ScrollView - Close keyboard'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/09.ViewGroup - Ok'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\09.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/10.ViewGroup - Lanjut Konfirmasi Pembayaran'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/11.ViewGroup - Input PIN'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\10.png')

Mobile.setText(findTestObject('Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/12.EditText - PIN'), 
    '111111', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\11.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/13.ScrollView - Close Keyboard'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\12.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/15.ViewGroup - Bayar'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA INSUFFICIENT\\13.png')

Mobile.tap(findTestObject('Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/15.ViewGroup - Notice Error Insufficient'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA DORMANT\\14.png')

Mobile.tap(findTestObject('Bayar/Pajak-MPN/Pajak - Pajak DKI Jakarta Dormnant-Insufficient/16.TextView - OK'), 
    0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA DORMANT\\15.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA DORMANT\\16.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK DAERAH DKI JAKARTA DORMANT\\17.png')

Mobile.closeApplication()

