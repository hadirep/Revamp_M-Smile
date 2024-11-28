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

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Penutupan Kartu Kredit/001.SvgView - Bantuan'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Penutupan Kartu Kredit\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Penutupan Kartu Kredit/002.RectView - Kartu Kredit'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Penutupan Kartu Kredit\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Penutupan Kartu Kredit/003.PathView - Close Session'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Penutupan Kartu Kredit/004.TextView - Penutupan Kartu Kredit'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Penutupan Kartu Kredit\\03.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Penutupan Kartu Kredit/005.TextView - Question Penutupan Kartu Kredit'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Penutupan Kartu Kredit/005.TextView - Answer Penutupan Kartu Kredit'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Penutupan Kartu Kredit\\04.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Penutupan Kartu Kredit/006.ViewGroup - Kembali'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Penutupan Kartu Kredit\\05.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Penutupan Kartu Kredit/007.ViewGroup - Kembali ke Pusat Bantuan'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Penutupan Kartu Kredit\\06.png')

Mobile.closeApplication()

