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

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Smartfren/002.View Telepon'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Smartfren/003.EditText - Input Nomor'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\03.png')

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Smartfren/004.EditText - Masukkan Nomor'), '088809399553', 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Smartfren/005.ViewGroup - Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\05.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/007.PathView - Pilih Nominal'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\06.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/07.TextView - 50000'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\07.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/008.ViewGroup - Lanjut'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Smartfren/009.EditText - Set PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Smartfren/009.EditText - PIN'), '111111', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\08.png')
Mobile.pressBack()

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/10.ViewGroup - Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\09.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/013.ViewGroup - Notice Error'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\10.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/014.TextView - OK'), 0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\11.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\12.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\13.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp M-Smile - TRFP\\Screenshoot\\N-TC-TOP UP-Pulsa - Smartfren - Dormant\\14.png')

Mobile.closeApplication()

