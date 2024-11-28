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

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Kenaikan Limit\\01.png')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/002.RectView - Kartu Kredit'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Kenaikan Limit\\02.png')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/003.PathView - Close Session'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/004.TextView - Kenaikan Limit'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/005.TextView - Question Kenaikan Limit 1'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/005.TextView - Answer Kenaikan Limit 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Kenaikan Limit\\03.png')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/006.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/007.TextView - Question Kenaikan Limit 2'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/007.TextView - Answer Kenaikan Limit 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Kenaikan Limit\\04.png')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/008.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/009.TextView - Question Kenaikan Limit 3'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/009.TextView - Answer Kenaikan Limit 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Kenaikan Limit\\05.png')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/010.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/011.TextView - Question Kenaikan Limit 4'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/011.TextView - Answer Kenaikan Limit 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Kenaikan Limit\\06.png')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/012.ViewGroup - Kembali'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Kenaikan Limit\\07.png')

Mobile.checkElement(findTestObject('Bantuan/Kartu Kredit/Kenaikan Limit/013.ViewGroup - Kembali kempusat bantuan'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Kenaikan Limit\\08.png')

Mobile.closeApplication()

