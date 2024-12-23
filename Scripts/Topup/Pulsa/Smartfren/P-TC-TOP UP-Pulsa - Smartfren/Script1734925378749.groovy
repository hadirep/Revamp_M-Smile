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

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Smartfren/001.ViewGroup - Top Up'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-TOP UP-Pulsa - Smartfren\\01.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/002.View Telepon'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-TOP UP-Pulsa - Smartfren\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Smartfren/003.EditText - Input Nomor'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-TOP UP-Pulsa - Smartfren\\03.png')

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Smartfren/004.EditText - Masukkan Nomor'), '088230002000', 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-TOP UP-Pulsa - Smartfren\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Smartfren/005.ViewGroup - Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(900, 500, 100, 500)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-TOP UP-Pulsa - Smartfren\\05.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/007.PathView - Pilih Nominal'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-TOP UP-Pulsa - Smartfren\\06.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/07.TextView - 50000'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-TOP UP-Pulsa - Smartfren\\07.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/008.ViewGroup - Lanjut'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Smartfren/009.EditText - Set PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Smartfren/009.EditText - PIN'), '111111', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-TOP UP-Pulsa - Smartfren\\08.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/10.ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/011.ImageView - Pembayaran Berhasil'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-TOP UP-Pulsa - Smartfren\\09.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Smartfren/012.PathView - Close'), 0)

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/com.horcrux.svg.PathView'), 0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\P-TC-TOP UP-Pulsa - Smartfren\\10.png')

Mobile.closeApplication()