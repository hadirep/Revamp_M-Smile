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

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/ShopeePay/01.ViewGroup - Lihat Semua'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - ShopeePay\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/ShopeePay/02.ViewGroup - ShopeeePay'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - ShopeePay\\02.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/ShopeePay/03.EditText - Input Nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Topup/ShopeePay/04.EditText - Nomor ShopeePay'), '087785626440', 
    0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/ShopeePay/05.TextView - ShopeePay'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - ShopeePay\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/ShopeePay/06.ViewGroup - Lanjut ke e-wallet'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/ShopeePay/07.PathView - Lihat Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/ShopeePay/09.TextView - E-Wallet'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - ShopeePay\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/ShopeePay/10.ViewGroup - Back to input nomor'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - ShopeePay\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/ShopeePay/11.ViewGroup - Back to Lihat semua'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - ShopeePay\\06.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/ShopeePay/ShopeePay/12.ViewGroup - Back to menu utama'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - ShopeePay\\07.png')
Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-LIHAT SEMUA - ShopeePay\\08.png')

Mobile.closeApplication()

