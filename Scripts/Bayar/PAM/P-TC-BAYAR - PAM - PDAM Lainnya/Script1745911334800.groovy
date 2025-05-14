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

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BAYAR - PAM - PDAM Lainnya\\01.png')

Mobile.tap(findTestObject('Object Repository/01.New Update Script Repo/Top Up Bayar - PDAM/01. Top Up_Bayar - PDAM'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BAYAR - PAM - PDAM Lainnya\\02.png')

Mobile.tap(findTestObject('Object Repository/01.New Update Script Repo/Top Up Bayar - PDAM/02. PAM'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BAYAR - PAM - PDAM Lainnya\\03.png')

Mobile.tap(findTestObject('Object Repository/01.New Update Script Repo/Top Up Bayar - PDAM/03. Cek Saldo'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BAYAR - PAM - PDAM Lainnya\\04.png')

Mobile.tap(findTestObject('Object Repository/01.New Update Script Repo/Top Up Bayar - PDAM/04. Daftar Produk'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BAYAR - PAM - PDAM Lainnya\\05.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - PDAM/05. PDAM LAINNYA'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BAYAR - PAM - PDAM Lainnya\\06.png')

Mobile.tap(findTestObject('Object Repository/01.New Update Script Repo/Top Up Bayar - PDAM/06. Nomor Pelanggan'), 0)

Mobile.tap(findTestObject('Object Repository/01.New Update Script Repo/Top Up Bayar - PDAM/07. Input Nomor Pelanggan'), 
    0)

Mobile.setText(findTestObject('Object Repository/01.New Update Script Repo/Top Up Bayar - PDAM/08. Set Text Nomor Pelanggan'), 
    '10600600', 0)

Mobile.pressBack()

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BAYAR - PAM - PDAM Lainnya\\07.png')

Mobile.tap(findTestObject('Object Repository/01.New Update Script Repo/Top Up Bayar - PDAM/09. OK'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BAYAR - PAM - PDAM Lainnya\\08.png')

Mobile.tap(findTestObject('Object Repository/01.New Update Script Repo/Top Up Bayar - PDAM/10. Lanjut'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BAYAR - PAM - PDAM Lainnya\\09.png')

Mobile.closeApplication()

