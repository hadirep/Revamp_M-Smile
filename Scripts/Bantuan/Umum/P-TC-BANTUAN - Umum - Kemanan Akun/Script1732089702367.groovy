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

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/002.RectView - Umum'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/003.PathView - Close session'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/004.TextView - Keamanan akun'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\03.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/004.TextView - Question Kemanan Akun 1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/004.TextView - Answer Kemanan Akun 1.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/004.TextView - Answer Kemanan Akun 1.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/004.TextView - Answer Kemanan Akun 1.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/004.TextView - Answer Kemanan Akun 1.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/004.TextView - Answer Kemanan Akun 1.5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\04.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/006.TextView - Question Kemanan Akun 2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/006.TextView - Answer Kemanan Akun 2.1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\05.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/008.TextView - Question Kemanan Akun 3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/008.TextView - Answer Kemanan Akun 3.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/008.TextView - Answer Kemanan Akun 3.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/008.TextView - Answer Kemanan Akun 3.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/008.TextView - Answer Kemanan Akun 3.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/008.TextView - Answer Kemanan Akun 3.5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\06.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Question Kemanan Akun 4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.6'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.7'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.8'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.9'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.10'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.11'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/009.TextView - Answer Kemanan Akun 4.12'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\07.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/012.TextView - Question Kemanan Akun 5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/012.TextView - Answer Kemanan Akun 5.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/012.TextView - Answer Kemanan Akun 5.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/012.TextView - Answer Kemanan Akun 5.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/012.TextView - Answer Kemanan Akun 5.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/012.TextView - Answer Kemanan Akun 5.5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/012.TextView - Answer Kemanan Akun 5.6'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/012.TextView - Answer Kemanan Akun 5.7'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/012.TextView - Answer Kemanan Akun 5.8'), 0)

Mobile.tap(findTestObject('Bantuan/Umum/Kemanan Akun/012.TextView - Answer Kemanan Akun 5.9'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\08.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Umum/Kemanan Akun/013.TextView - Question Kemanan Akun 6'), 0)

Mobile.tap(findTestObject('Bantuan/Umum/Kemanan Akun/013.TextView - Answer Kemanan Akun 6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\09.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\11.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Kemanan Akun\\12.png')

Mobile.closeApplication()

