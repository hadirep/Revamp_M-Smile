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

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Akun Saya/001.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Akun Saya\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Akun Saya/002.RectView - Umum'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Akun Saya/003.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Akun Saya\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Akun Saya/004.TextView - Akun Saya'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Akun Saya/005.TextView - Question Akun Saya 1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Akun Saya/005.TextView - Answer Akun Saya 1.1a'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Akun Saya/005.TextView - Answer Akun Saya 1.1b'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Akun Saya/005.TextView - Answer Akun Saya 1.1c'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Akun Saya/005.TextView - Answer Akun Saya 1.1d'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Akun Saya\\03.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/008.TextView - Question Akun Saya 2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/008.TextView - Answer Akun Saya 2.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/008.TextView - Answer Akun Saya 2.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/008.TextView - Answer Akun Saya 2.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/008.TextView - Answer Akun Saya 2.4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Akun Saya\\04.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/010.TextView - Question Akun Saya 3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/010.TextView - Answer Akun Saya 3.1a'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/010.TextView - Answer Akun Saya 3.1ab'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/010.TextView - Answer Akun Saya 3.1c'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/010.TextView - Answer Akun Saya 3.1d'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Kemanan Akun/010.TextView - Answer Akun Saya 3.1e'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Akun Saya\\05.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Akun Saya\\06.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Akun Saya\\07.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Akun Saya\\08.png')

Mobile.closeApplication()

