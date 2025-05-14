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

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\01.png')

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/01.Top Up dan Bayar'), 0)

Mobile.delay(5)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\02.png')

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/02.Paket Data'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\03.png')

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/03.Add Number'), 0)

Mobile.setText(findTestObject('Topup/Paket Data/Paket Data New/03.Add Number'), '08951234567', 0)

Mobile.pressBack()

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\04.png')

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/04.Lanjut'), 0)

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/05.Jenis Paket'), 0)

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/06.Jenis Paket - Happy 13GB'), 0)

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/07.Waktu Transaksi'), 0)

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/08.Sekarang'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\05.png')

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/07.Lanjut'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/08.Input PIN'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Topup/Paket Data/Paket Data New/08.Input PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\06.png')

Mobile.tap(findTestObject('Topup/Paket Data/Paket Data New/09. Lanjut Pembayaran'), 0)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/24. ViewGroup-Bagikan'), 0)

Mobile.delay(4)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\08.png')

Mobile.pressBack()

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\09.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/25. GroupView-Button Close'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\10.png')

Mobile.pressBack()

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\11.png')

Mobile.closeApplication()

