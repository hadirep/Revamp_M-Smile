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

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/001.PathView - Bantuan'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Pendaftaran Asuransi\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/002.RectView - Kartu Kredit'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/003.PathView - Close Session'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Pendaftaran Asuransi\\02.png')


Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/004.TextView - Pendaftaran Asuransi'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Pendaftaran Asuransi\\03.png')


Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/005.TextView - Question Pendaftaran Asuransi 1'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/005.TextView - Answer Pendaftaran Asuransi 1'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Pendaftaran Asuransi\\04.png')


Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/006.ViewGroup - Kembali'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Pendaftaran Asuransi\\05.png')


Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/007.TextView - Question Pendaftaran Asuransi 2'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/007.TextView - Answer Pendaftaran Asuransi 2.1'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/007.TextView - Answer Pendaftaran Asuransi 2.2'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/007.TextView - Answer Pendaftaran Asuransi 2.3'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/007.TextView - Answer Pendaftaran Asuransi 2.4'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/007.TextView - Answer Pendaftaran Asuransi 2.5'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/007.TextView - Answer Pendaftaran Asuransi 2.6'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/007.TextView - Answer Pendaftaran Asuransi 2.7'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Pendaftaran Asuransi\\06.png')


Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/008.ViewGroup - Kembali'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Pendaftaran Asuransi\\07.png')


Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Pendaftaran Asuransi/009.ViewGroup - Kembali Ke Pusat Bantuan'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Pendaftaran Asuransi\\08.png')

Mobile.closeApplication()

