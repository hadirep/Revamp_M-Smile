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

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\01.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top up Bayar - Pulsa/01. Top Up_Bayar - Pulsa'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\02.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top up Bayar - Pulsa/02. Pulsa'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\03.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top up Bayar - Pulsa/03. Input Nomor'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\04.png')

Mobile.setText(findTestObject('01.New Update Script Repo/Top up Bayar - Pulsa/03. Input Nomor'), '088809399553', 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\05.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/05.Close Tab'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\06.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top up Bayar - Pulsa/04. Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(900, 500, 100, 500)

Mobile.swipe(900, 500, 100, 500)

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/07.PathView 0 Pilih Nominal'), 0)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\07.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/08.Nominal 50000'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\08.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/09.Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\09.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/10.Set PIN'), 0)

Mobile.setText(findTestObject('Topup/Pulsa/Smartfren/11.Input PIN'), '111111', 0)

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/05.Close Tab'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\10.png')

Mobile.tap(findTestObject('Topup/Pulsa/Smartfren/13.Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\11.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel-Insuficcient Balance/018.TextView - OK'), 0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\12.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\13.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\14.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP - Pulsa - SmartfernL - Dormant\\15.png')

Mobile.closeApplication()

