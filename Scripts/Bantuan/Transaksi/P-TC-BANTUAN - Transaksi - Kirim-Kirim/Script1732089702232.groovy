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

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\01.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Top Up/002.RectView - Transaksi'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/003.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot().Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\02.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/002.TextView - Kirim-Kirim'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/005.TextView - Question Kirim-Kirim 1'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/005.TextView - Answer Kirim-Kirim 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\03.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/007.TextView - Question Kirim-Kirim 2'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/007.TextView - Answer Kirim-Kirim 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\04.png')

Mobile.pressBack()

Mobile.checkElement(findTestObject('Bantuan/Transaksi/Kirim-Kirim/009.TextView - Question Kirim-Kirim 3'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/009.TextView - Answer Kirim-Kirim 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\05.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/011.TextView - Question Kirim-Kirim 4'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/011.TextView - Answer Kirim-Kirim 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\06.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\07.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/013.TextView - Question Kirim-Kirim 5'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/013.TextView - Answer Kirim-Kirim 5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\08.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/015.TextView - Question Kirim-Kirim 6'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/015.TextView - Answer Kirim-Kirim 6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\08.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/017.TextView - Question Kirim-Kirim 7'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/017.TextView - Answer Kirim-Kirim 7'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\09.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/019.TextView - Question Kirim-Kirim 8'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/019.TextView - Answer Kirim-Kirim 8'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\10.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/021.TextView - Question Kirim-Kirim 9'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/021.TextView - Answer Kirim-Kirim 9'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\11.png')

Mobile.pressBack()

Mobile.scrollToText('Bagaimana caranya melihat berapa jumlah orang yang menerima Kirim-Kirim?', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/023.TextView - Question Kirim-Kirim 10'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/023.TextView - Answer Kirim-Kirim 10'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\12.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/024.TextView - Question Kirim-Kirim 11'), 0)

Mobile.tap(findTestObject('Bantuan/Transaksi/Kirim-Kirim/025.TextView - Answer Kirim-Kirim 11'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\13.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\14.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Transaksi - Kirim-Kirim\\15.png')

Mobile.closeApplication( //
    )

