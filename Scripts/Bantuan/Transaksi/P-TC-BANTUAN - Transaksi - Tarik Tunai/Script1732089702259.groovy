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

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Subscribe/01.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Tarik Tunai\\01.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Top Up/002.RectView - Transaksi'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/003.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Tarik Tunai\\02.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Tarik Tunai/002.TextView - Tarik Tunai'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Tarik Tunai/005.TextView - Question Tarik Tunai 1'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Tarik Tunai/005.TextView - Answer Tarik Tunai 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Tarik Tunai\\03.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Tarik Tunai/007.TextView - Question Tarik Tunai 2'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Tarik Tunai/007.TextView - Answer Tarik Tunai 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Tarik Tunai\\04.png')

Mobile.pressBack()

Mobile.checkElement(findTestObject('Bantuan/Transaksi/Tarik Tunai/009.TextView - Question Tarik Tunai 3'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Tarik Tunai/009.TextView - Answer Tarik Tunai 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Tarik Tunai\\05.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Tarik Tunai/011.TextView - Question Tarik Tunai 4'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Tarik Tunai/011.TextView - Answer Tarik Tunai 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Tarik Tunai\\06.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Tarik Tunai\\07.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Tarik Tunai\\08.png')

Mobile.closeApplication()

