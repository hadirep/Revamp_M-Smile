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

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\01.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/QRIS/002.RectView - Transaksi'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/QRIS/003.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\02.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/002.TextView - Transfer'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\03.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/005.TextView - Question Transfer 1'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/005.ViewGroup - Answer Transfer 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\04.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/007.TextView - Question Transfer 2'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/007.ViewGroup - Answer Transfer 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\05.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/009.TextView - Question Transfer 3'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/009.ViewGroup - Answer Transfer 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\06.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/011.TextView - Question Transfer 4'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/011.ViewGroup - Answer Transfer 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\07.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/013.TextView - Question Transfer 5'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/013.ViewGroup - Answer Transfer 5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\08.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/015.TextView - Question Transfer 6'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/015.ViewGroup - Answer Transfer 6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\09.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/017.TextView - Question Transfer 7'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/017.ViewGroup - Answer Transfer 7'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\11.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\12.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Transfer\\13.png')

Mobile.closeApplication()//