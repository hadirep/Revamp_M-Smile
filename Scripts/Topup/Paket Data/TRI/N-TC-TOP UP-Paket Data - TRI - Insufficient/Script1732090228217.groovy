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

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\01.png')

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/01.Top Up dan Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficientt\\02.png')

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/02.Paket Data'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\03.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - Paket Data/03. Input Number'), 0)

Mobile.setText(findTestObject('01.New Update Script Repo/Top Up Bayar - Paket Data/03. Add Number'), '08951234567', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\04.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/04.Lanjut'), 0)

Mobile.delay(2)

Mobile.swipe(900, 500, 100, 500)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\05.png')

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/05.Jenis Paket'), 0)

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/06.Jenis Paket - Happy 13GB'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\06.png')

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/07.Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\07.png')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/08.Input PIN'), 0)

Mobile.setText(findTestObject('Topup/Paket Data/Paket Data New/08.Input PIN'), '111111', 0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\08.png')

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/09. Lanjut Pembayaran'), 0)

Mobile.tap(findTestObject('Topup/Paket Data/TRI-Dormant_Insufficient/10. Notif Error Insufficient'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\09.png')

Mobile.tap(findTestObject('Topup/Paket Data/TRI-Dormant_Insufficient/11. OK (Insufficient)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\11.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\12.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\13.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\N-TC-TOP UP-Paket Data - TRI - Insufficient\\14.png')

Mobile.closeApplication()

