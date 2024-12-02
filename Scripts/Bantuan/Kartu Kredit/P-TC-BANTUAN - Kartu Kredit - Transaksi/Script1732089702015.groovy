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

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Transaksi\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/002.RectView - Kartu Kredit'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/003.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Transaksi\\02.png')

Mobile.scrollToText('Transaksi')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Transaksi/005.TextView - Transaksi'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Transaksi/007.TextView - Question Transaksi 1'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Transaksi/007.TextView - Answer Transaksi 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Transaksi\\03.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/006.ViewGroup - Kembali'), 0)

Mobile.scrollToText('Apakah Saya bisa bertransaksi menggunakan kartu kredit di luar negeri, dan bagaimana perhitungan kursnya?', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Transaksi/007.TextView - Question Transaksi 2'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Transaksi/007.TextView - Answer Transaksi 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Transaksi\\04.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Promo/006.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Transaksi/007.TextView - Question Transaksi 3'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Transaksi/007.TextView - Answer Transaksi 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Transaksi\\05.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Transaksi\\06.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Transaksi\\07.png')

Mobile.closeApplication()//