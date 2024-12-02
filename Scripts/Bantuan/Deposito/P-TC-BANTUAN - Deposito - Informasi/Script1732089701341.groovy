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

Mobile.tap(findTestObject('Object Repository/Bantuan/Deposito/Fitur/01.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Deposito - Informasi\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Deposito/Fitur/02.RectView - Deposito'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Deposito - Informasi\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Deposito/Fitur/03.TextView - Question Fitur 1'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Deposito/Fitur/03.TextView - Answer Fitur 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Deposito - Informasi\\03.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Deposito/Fitur/05.TextView - Question Fitur 2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Deposito/Fitur/05.TextView - Answer Fitur 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Deposito - Informasi\\04.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Deposito/Fitur/07.TextView - Question Fitur 3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Deposito/Fitur/07.TextView - Answer Fitur 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Deposito - Informasi\\05.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Deposito - Informasi\\06.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Deposito/Fitur/09.ViewGroup'), 0)

Mobile.tap(findTestObject('Atur/08.PathView - Home'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Deposito - Informasi\\07.png')

Mobile.closeApplication()//