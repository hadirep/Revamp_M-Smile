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

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/01.ViewGroup - Top Up'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/02.ViewGroup - E-Wallet'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/03.ViewGroup - Ovo'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/04.ViewGroup - Input Nomor'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\05.png')

Mobile.setText(findTestObject('Object Repository/Topup/E-Wallet/OVO/05.EditText - Nomor Ovo'), '0821136111992', 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/06.ViewGroup - Lanjut'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/07.ViewGroup - Input Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/E-Wallet/OVO/08.EditText - Nominal'), '100000', 0)

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/09.ScrollView - Close Tab'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\08.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/10.ViewGroup - Lanjut'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\09.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/11.ViewGroup - Set PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/E-Wallet/OVO/12.EditText - PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/13.ScrollView - Close Tab'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\10.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/14.ViewGroup - Bayar'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\11.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/15.ViewGroup - Bagikan'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\12.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/OVO/17.PathView - Exit'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\13.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - OVO\\14.png')

Mobile.closeApplication()

