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

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/01.ViewGroup - Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/02ViewGroup - Pajak'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/03.EditText - Daftar Produk'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/04.TextView - Penerimaan NegaraMPN'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/05.EditText - Input Nopel'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\05.png')

Mobile.setText(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/06.EditText - Nopel'), '919100991421552', 
    0)

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/07.ViewGroup - Ok'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/08.ViewGroup - Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\07.png')

Mobile.setText(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/09.EditText - Input PIN'), '111111', 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/10.ViewGroup - Bayar'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/11.ViewGroup - Notice Error'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\09.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Pajak Negara/12.TextView - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\11.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\12.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\N-TC-BAYAR - PAJAK PENERIMAN NEGARA - DORMANT\\13.png')

Mobile.closeApplication()

