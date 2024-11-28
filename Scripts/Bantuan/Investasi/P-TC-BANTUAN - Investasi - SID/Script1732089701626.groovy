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

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - SID\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Subscribe/02.RectView - Investasi'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - SID\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Subscribe/03.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - SID\\03.png')

Mobile.tap(findTestObject('Bantuan/Investasi/SID/04.TextView - SID'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - SID\\04.png')

Mobile.tap(findTestObject('Bantuan/Investasi/SID/05.TextView - Question SID 1'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/SID/05.TextView - Answer SID 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - SID\\05.png')

Mobile.tap(findTestObject('Bantuan/Investasi/SID/06.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/SID/07.TextView - Question SID 2'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/SID/07.TextView - Answer SID 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - SID\\06.png')

Mobile.tap(findTestObject('Bantuan/Investasi/SID/06.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/SID/09.TextView - Question SID 3'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/SID/09.TextView - Answer SID 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - SID\\07.png')

Mobile.tap(findTestObject('Bantuan/Investasi/SID/06.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/SID/11.TextView - Question SID 4'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/SID/11.TextView - Answer SID 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - SID\\08.png')

Mobile.tap(findTestObject('Bantuan/Investasi/SID/06.ViewGroup - Kembali'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - SID\\09.png')

Mobile.tap(findTestObject('Bantuan/Investasi/SID/06.ViewGroup - Kembali'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - SID\\10.png')

Mobile.closeApplication()

