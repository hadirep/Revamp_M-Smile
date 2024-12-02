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

Mobile.startExistingApplication('com.bankmega.msmiledev                                           ')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Blokir Kartu Kredit\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/002.RectView - Kartu Kredit'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Blokir Kartu Kredit\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/003.PathView - Close Session'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/004.TextView - Blokir Kartu Kredit'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/005.TextView - Question Blokir Kartu Kredit 1'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/005.TextView - Answer Blokir Kartu Kredit 1.1'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/005.TextView - Answer Blokir Kartu Kredit 1.2'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/005.TextView - Answer Blokir Kartu Kredit 1.3'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/005.TextView - Answer Blokir Kartu Kredit 1.4'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/005.TextView - Answer Blokir Kartu Kredit 1.5'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/005.TextView - Answer Blokir Kartu Kredit 1.6'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/005.TextView - Answer Blokir Kartu Kredit 1.7'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Blokir Kartu Kredit\\03.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/007.TextView - Question Blokir Kartu Kredit 2'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/007.TextView - Answer Blokir Kartu Kredit 2'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Blokir Kartu Kredit\\04.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/009.TextView - Question Blokir Kartu Kredit 3'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Blokir Kartu Kredit/009.TextView - Answer Blokir Kartu Kredit 2'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Blokir Kartu Kredit\\05.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Blokir Kartu Kredit\\06.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Blokir Kartu Kredit\\07.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Blokir Kartu Kredit\\08.png')

Mobile.closeApplication()//