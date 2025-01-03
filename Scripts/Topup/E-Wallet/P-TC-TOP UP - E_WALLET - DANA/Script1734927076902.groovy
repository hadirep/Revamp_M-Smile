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

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Dana/01.ViewGroup - Top Up'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - DANA\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Dana/02.ViewGroup - E-Wallet'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - DANA\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Dana/03.ViewGroup - DANA'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - DANA\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Dana/04.ViewGroup - Input Nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/E-Wallet/Dana/05.EditText - Nomor DANA'), '082113611992', 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - DANA\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Dana/06.ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Dana/07.ViewGroup - Nominal'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - DANA\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Dana/08.ViewGroup - Lanjut'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - DANA\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Dana/09.ViewGroup - Set PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/E-Wallet/Dana/10.EditText - PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Dana/11.ScrollView - Close Tab'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - DANA\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Dana/12.ViewGroup - Bayar'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - DANA\\08.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Dana/13.PathView -Exit'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - DANA\\09.png')

Mobile.pressBack()

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - DANA\\01.png')

Mobile.closeApplication()

