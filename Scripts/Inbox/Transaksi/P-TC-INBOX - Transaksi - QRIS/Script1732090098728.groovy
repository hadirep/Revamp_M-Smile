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

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - QRIS\\01.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/QRIS/01. ViewGroup-Inbox'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - QRIS\\02.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/QRIS/02. ViewGroup-QRIS'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/QRIS/03. TextView-verif QR Payment MPM'),
	'QR Payment MPM' )

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/QRIS/04. TextView-verif MSP Carrefour Lebak Bulus'), 
    'MSP Carrefour Lebak Bulus')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/QRIS/05. TextView-verif Bank Mega'),
	'Bank Mega')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/QRIS/06. TextView-verif Rp. 20.000'),
	'Rp. 20.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - QRIS\\03.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/QRIS/07. ViewGroup-Tap Line 1'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/QRIS/08. TextView-verif Bayar Pakai QRIS Berhasil'), 
    'Bayar Pakai QRIS Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/QRIS/09. TextView-verif Rp. 20.000'),
	'Rp. 20.000')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/QRIS/10. TextView-verif Nominal Rp. 20.000'),
	'Rp. 20.000')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/QRIS/11. TextView-verif Adm Rp. 0'), 
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/QRIS/12. TextView-verif Total Bayar Rp. 20.000'), 
    'Rp. 20.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - QRIS\\04.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/QRIS/13. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - QRIS\\05.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/QRIS/14. Button - Cancel'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - QRIS\\06.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/QRIS/15. GroupView-Close Button'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - QRIS\\07.png')

Mobile.closeApplication()

