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

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Split Bill\\01.png')

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/02.RectView - Fitur Lainnya'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Split Bill\\02.png')

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/05.TextView - Question Split Bill 1'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/05.TextView - Answer Split Bill 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Split Bill\\03.png')

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/06.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/07.TextView - Question Split Bill 2'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/07.TextView - Answer Split Bill 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Split Bill\\04.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/006ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/09.TextView - Question Split Bill 3'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/09.TextView - Answer Split Bill 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Split Bill\\05.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/006ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/11.TextView - Question Split Bill 4'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/11.TextView - Answer Split Bill 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Split Bill\\06.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/006ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/13.TextView - Question Split Bill 5'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/13.TextView - Answer Split Bill 5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Split Bill\\07.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/006ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/13.TextView - Question Split Bill 6'), 0)

Mobile.tap(findTestObject('Bantuan/Fitur Lainnya/Split Bill/15.TextView - Answer Split Bill 6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Split Bill\\08.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/006ViewGroup - Kembali'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Split Bill\\09.png')

Mobile.tap(findTestObject('Bantuan/Transaksi/Transfer/018.ViewGroup - Kembali'), 0)

Mobile.tap(findTestObject('Atur/08.PathView - Home'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\H24090018\\Katalon Studio\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Fitur Lainnya - Split Bill\\10.png')

Mobile.closeApplication()

