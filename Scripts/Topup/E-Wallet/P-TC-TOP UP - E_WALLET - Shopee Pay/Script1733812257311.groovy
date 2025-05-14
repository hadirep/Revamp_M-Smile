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

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - Ewallet/01. Top Up_Bayar - E-wallet'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Shopee Pay\\01.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - Ewallet/02. E-wallet'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Shopee Pay\\02png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - Ewallet/03. ShopeePay'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Shopee Pay\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Shopee Pay/04.ViewGroup - Input Nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/E-Wallet/Shopee Pay/05.EditText - Nomor Spay'), '087785626440', 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Shopee Pay\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Shopee Pay/06.ViewGroup - Lanjut'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Shopee Pay\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Shopee Pay/07.ViewGroup - Nominal'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Shopee Pay\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Shopee Pay/08.ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Shopee Pay/09.ViewGroup - Set PIN'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Shopee Pay\\07.png')

Mobile.setText(findTestObject('Object Repository/Topup/E-Wallet/Shopee Pay/10.EditText - PIN'), '111111', 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Shopee Pay\\08.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Shopee Pay/11.ScrollView - Close Tab'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Shopee Pay/12.ViewGroup - Bayar'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Shopee Pay\\09.png')

Mobile.tap(findTestObject('Object Repository/Topup/E-Wallet/Shopee Pay/13.GroupView - Exit'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Shopee Pay\\10.png')

Mobile.pressBack()

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-TOP UP - E_WALLET - Shopee Pay\\11.png')

Mobile.closeApplication()

