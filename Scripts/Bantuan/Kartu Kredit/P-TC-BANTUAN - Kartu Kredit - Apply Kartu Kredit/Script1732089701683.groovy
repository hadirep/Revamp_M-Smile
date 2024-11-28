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

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Apply Kartu Kredit\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/002.TextView - KATEGORI BANTUAN'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/003.RectView - Kartu Kredit'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Apply Kartu Kredit\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/004.TextView - Question 1 Apply Kartu Kredit'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/004.ViewGroup - Answer 1 Apply kartu kredit'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Apply Kartu Kredit\\03.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/005.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/006.TextView - Question Apply Kartu Kredit 2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/006.TextView - Answer Apply Kartu Kredit 2'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Apply Kartu Kredit\\04.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/007.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Question Apply Kartu Kredit 3'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.1'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.2'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.3'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.4'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.5'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.6'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.7'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.8'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.9'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.10'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.11'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.12'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.13'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.TextView - Answer Apply Kartu Kredit 3.14'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Apply Kartu Kredit\\05.png')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/006.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/009.TextView - Question Apply Kartu Kredit 4'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/009.TextView - Answer Apply Kartu Kredit 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Apply Kartu Kredit\\06.png')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/006.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/010.TextView - Question Apply Kartu Kredit 5'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/010.TextView - Answer Apply Kartu Kredit 5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Apply Kartu Kredit\\07.png')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/006.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/011.TextView - Question Apply Kartu Kredit 6'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/011.TextView - Answer Apply Kartu Kredit 6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Apply Kartu Kredit\\08.png')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/005.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/012.TextView - Question Apply Kartu Kredit 7'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Apply Kartu Kredit\\09.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Kartu Kredit/Apply Kartu Kredit/008.ViewGroup - Kembali'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Apply Kartu Kredit\\10.png')

Mobile.tap(findTestObject('Bantuan/Kartu Kredit/Apply Kartu Kredit/013.ViewGroup - Kmebali ke pusat bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Kartu Kredit - Apply Kartu Kredit\\11.png')

Mobile.closeApplication()//

