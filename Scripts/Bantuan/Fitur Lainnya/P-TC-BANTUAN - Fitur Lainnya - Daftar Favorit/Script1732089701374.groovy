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

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Daftar Favorit\\01.png')

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/02.RectView - Fitur Lainnya'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Daftar Favorit\\02.png')

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Voice Command/04.PathView - Close Session'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Daftar Favorit/03.TextView - Daftar Favorit'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Daftar Favorit\\03.png')

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Daftar Favorit/05.TextView - Question Daftar Favorit 1'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Daftar Favorit/05.TextView - Answer Daftar Favorit 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Daftar Favorit\\04.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Daftar Favorit/07.TextView - Question Daftar Favorit 2'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Daftar Favorit/07.TextView - Answer Daftar Favorit 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Daftar Favorit\\05.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Daftar Favorit/09.TextView - Question Daftar Favorit 3'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Daftar Favorit/09.TextView - Answer Daftar Favorit 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Daftar Favorit\\06.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Daftar Favorit/11.TextView - Question Daftar Favorit 4'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Daftar Favorit/11.TextView - Answer Daftar Favorit 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Daftar Favorit\\07.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Daftar Favorit\\08.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Atur/08.PathView - Home'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Daftar Favorit\\09.png')

Mobile.closeApplication()//