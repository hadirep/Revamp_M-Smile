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

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Gopay/01.ViewGroup - Top Up'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Gopay/02.View - E-wallet'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Gopay/03.ViewGroup - Go-pay'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Gopay/04.TextView - Input nomor'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\04.png')

Mobile.setText(findTestObject('Object Repository/Topup/E-Wallet/Gopay/05.EditText - Nomor Gopay'), '087785626440', 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Gopay/06.ViewGroup - Lanjut'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Gopay/07.EditText - Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/E-Wallet/Gopay/08.EditText - 100.000'), '100000', 0)

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Gopay/09.ScrollView - Close Tab'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Gopay/10.ViewGroup - Lanjut'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\08.png')

Mobile.delay(16, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Topup/E-Wallet/Gopay/11.ViewGroup - Set PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/E-Wallet/Gopay/12.EditText - PIN'), '111111', 0)

Mobile.tap(findTestObject('Topup/E-Wallet/android.view.ViewGroup'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\09.png')

Mobile.tap(findTestObject('Topup/E-Wallet/Gopay/13.ViewGroup - Bayar'), 0)

Mobile.tap(findTestObject('Topup/E-Wallet/Gopay/13.ViewGroup - Bayar'), 0)

Mobile.delay(20)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\10.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Gopay/14.PathView - Exit'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\11.png')

Mobile.pressBack()

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Gopay\\12.png')

Mobile.closeApplication()

