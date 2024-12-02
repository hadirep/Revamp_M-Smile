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

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Umum_/001.PathView - Tombol Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Umum_/002.TextView - Pusat Bantuan'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Umum_/003.RectView - Umum'), 0)

Mobile.tap(findTestObject('Bantuan/Umum/Registrasi M-smile/003.PathView - Close session Umum'), 0)

Mobile.tap(findTestObject('Bantuan/Umum/Registrasi M-smile/003.PathView - Open Session Reg.M-smile'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/002.TextView - Question Reg_M-smile 1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/002.TextView - Answer Reg_M-smile 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\03.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\04.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/004.TextView - Question Reg_M-smile 2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/004.TextView - Answer Reg_M-smile 2.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/004.TextView - Answer Reg_M-smile 2.2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\05.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\06.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/006.TextView - Question Reg_M-smile 3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/006.TextView - Answer Reg_M-smile 3.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/006.TextView - Answer Reg_M-smile 3.2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\07.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\08.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/008.TextView - Question Reg_M-smile 4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/009.TextView - Answer Reg_M-smile 4.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/009.TextView - Answer Reg_M-smile 4.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/009.TextView - Answer Reg_M-smile 4.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/009.TextView - Answer Reg_M-smile 4.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/009.TextView - Answer Reg_M-smile 4.5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/009.TextView - Answer Reg_M-smile 4.6'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/009.TextView - Answer Reg_M-smile 4.7'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\09.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\10.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/011.TextView - Question Reg_M-smile 5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/011.TextView - Answer Reg_M-smile 5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\11.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\12.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/013.TextView - QuestionReg_M-smile 6'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/013.TextView - Answer Reg_M-smile 6.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/013.TextView - Answer Reg_M-smile 6.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/013.TextView - Answer Reg_M-smile 6.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/013.TextView - Answer Reg_M-smile 6.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/013.TextView - Answer Reg_M-smile 6.5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/013.TextView - Answer Reg_M-smile 6.6'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/013.TextView - Answer Reg_M-smile 6.7'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\12.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\13.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/015.TextView - Question Reg_M-smile 7'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/015.TextView - Answer Reg_M-smile 7'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\14.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\15.png')

Mobile.tap(findTestObject('Bantuan/Umum/Registrasi M-smile/017.TextView - Question Reg_M-smile 8'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.6'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.7'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.8'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.9'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.10'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.11'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/017.TextView - Answer Reg_M-smile 8.12'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\16.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/019.TextView - Question Reg_M-smile 9'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/019.TextView - Answer Reg_M-smile 9.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/019.TextView - Answer Reg_M-smile 9.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/019.TextView - Answer Reg_M-smile 9.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/019.TextView - Answer Reg_M-smile 9.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/019.TextView - Answer Reg_M-smile 9.5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/019.TextView - Answer Reg_M-smile 9.6'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/019.TextView - Answer Reg_M-smile 9.7'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\17.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/021.ViewGroup - Question Reg_M-smile 10'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/021.TextView - Answer Reg_M-smile 10'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\18.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/023.ViewGroup - Question Reg_M-smile 11'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/023.TextView - Answer Reg_M-smile 11.1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/023.TextView - Answer Reg_M-smile 11.2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/023.TextView - Answer Reg_M-smile 11.3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/023.TextView - Answer Reg_M-smile 11.4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/023.TextView - Answer Reg_M-smile 11.5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/023.TextView - Answer Reg_M-smile 11.6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\19.png')

Mobile.pressBack()

Mobile.scrollToText('Aplikasi M-smile bisa diunduh pada sistem operasi ponsel apa saja?', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/025.ViewGroup - Question Reg_M-smile 12'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Umum/Registrasi M-smile/025.TextView - Answer Reg_M-smile 12'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\20.png')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\21.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\22.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Umum - Registrasi M-Smile\\23.png')

Mobile.closeApplication()

