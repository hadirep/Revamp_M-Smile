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

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/002.RectView - Tabungan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/004.TextView - Question Apply Tabungan 1'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/004.TextView - Answer Apply Tabungan 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\03.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/006.TextView - Question Apply Tabungan 2'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/006.TextView - Answer Apply Tabungan 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\04.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/008.TextView - Question Apply Tabungan 3'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/008.TextView - Answer Apply Tabungan 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\05.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/010.TextView - Question Apply Tabungan 4'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/010.TextView - Answer Apply Tabungan 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\06.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/012.TextView - Question Apply Tabungan 5'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/012.TextView - Answer Apply Tabungan 5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\07.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/014.TextView - Question Apply Tabungan 6'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/014.TextView - Answer Apply Tabungan 6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\08.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/016.TextView - Question Apply Tabungan 7'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/016.TextView - Answer Apply Tabungan 7'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\09.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/018.TextView - Question Apply Tabungan 8'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/018.TextView - Answer Apply Tabungan 8'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\10.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/020.TextView - Question Apply Tabungan 9'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/020.TextView - Answer Apply Tabungan 9'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\11.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/022.TextView - Question Apply Tabungan 10'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/022.TextView - Answer Apply Tabungan 10'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\12.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/024.TextView - Question Apply Tabungan 11'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/024.TextView - Answer Apply Tabungan 11'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\13.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Tabungan/Apply Tabungan/026.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\14.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Tabungan - Apply Tabungan\\15.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.closeApplication()//

