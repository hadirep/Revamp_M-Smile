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

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/002.RectView - Transaksi'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/003.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/004.TextView - QRIS'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/005.TextView - Question QRIS 1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/005.TextView - Answer QRIS 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/006.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/007.TextView - Question QRIS 2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/007.TextView - Answer QRIS 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/008.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/009.TextView - Question QRIS 3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/009.TextView - Answer QRIS 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/010.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/011.TextView - Question QRIS 4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/011.TextView - Answer QRIS 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/012.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/013.TextView - Question QRIS 5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/013.TextView - Answer QRIS 5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/014.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/015.TextView - Question QRIS 6'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/015.TextView - Answer QRIS 6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/016.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/017.TextView - Question QRIS 7'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/017.TextView - Answer QRIS 7'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/018.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/019.TextView - Question QRIS 8'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/019.TextView - Answer QRIS 8'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/020.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/021.TextView - Question QRIS 9'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/021.TextView - Answer QRIS 9 (1)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/020.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Transaksi/QRIS/023.ViewGroup - Kembali ke psuat bantuna'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.closeApplication()
