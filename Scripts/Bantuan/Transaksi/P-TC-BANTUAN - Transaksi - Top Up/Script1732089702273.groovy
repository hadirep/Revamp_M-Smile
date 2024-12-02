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

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Top Up\\01.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Top Up/002.RectView - Transaksi'), 0)

for (int i = 0; i < 2; i++) {
    Mobile.tap(findTestObject('Bantuan/Transaksi/Top Up/003.TextView - Top Up'), 0)
}

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Top Up\\02.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Top Up/005.TextView - Question Top Up 1'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Top Up/005.TextView - Answer Top Up 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Top Up\\03.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Top Up/007.TextView - Question Top Up 2'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Top Up/007.TextView - Answer Top Up 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Top Up\\04.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Top Up/009.TextView - Question Top Up 3'), 0)

Mobile.checkElement(findTestObject('Bantuan/Transaksi/Top Up/009.TextView - Answer Top Up 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Top Up\\05.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Top Up/011.TextView - Question Top Up 4'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Top Up/011.TextView - Answer Top Up 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Top Up\\06.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Top Up\\07.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Top Up\\08.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Top Up\\09.png')

Mobile.closeApplication()

