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

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Biaya - Limit Transaksi/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Biaya Limit Transaksi\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Biaya - Limit Transaksi/002.RectView - Umum'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Biaya Limit Transaksi\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Biaya - Limit Transaksi/003.PathView - Close session'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Biaya - Limit Transaksi/004.TextView - Biaya  Limit Transaksi'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Biaya - Limit Transaksi/005.TextView - Question Biaya_Limit 1'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Biaya - Limit Transaksi/005.TextView - Answer Biaya_Limit 1'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Biaya Limit Transaksi\\03.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Biaya Limit Transaksi\\04.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Biaya Limit Transaksi\\05.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Biaya Limit Transaksi\\06.png')

Mobile.closeApplication()

