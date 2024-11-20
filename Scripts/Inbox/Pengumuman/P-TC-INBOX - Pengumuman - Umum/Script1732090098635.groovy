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
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Umum\\01.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Pengumuman/Umum/01. ViewGroup-Inbox'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Umum\\02.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Pengumuman/Umum/02. TextView-Pengumuman'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Umum/03. TextView-Heading 1, No 1'), 
	'Saatnya pergi liburan, bayar tagihan multifinance bisa sambil rebahan')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Umum/04. TextView-Body 1, No 1'), 
	'Pergi liburan naik kereta api bayar tiketnya tanpa antri. Klik menu bayar di M-Smile dan pilih tiket kereta api ya! Bayarnya gampang bikin liburan makin nyaman!')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Umum/05. TextView-Heading 2, No 2'), 
	'Mau belanja kebutuhan ramadhan tapi khawatir limit kartu kredit tidak cukup?')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Umum/06. TextView-Body 2, No 2'), 
	'Pergi liburan naik kereta api bayar tiketnya tanpa antri. Klik menu bayar di M-Smile dan pilih tiket kereta api ya! Bayarnya gampang bikin liburan makin nyaman!')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Umum\\03.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Pengumuman/Umum/07. ImageView-Pengumuman 1'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Umum/08. TextView - Detail'), 'Detail')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Umum/09. TextView-Heading 1, Detail 1'), 
	'Saatnya pergi liburan, bayar tiketnya bisa sambil rebahan')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Umum/10. TextView-Body 1, Detail 1'), 
	'Pergi liburan naik kereta api bayar tiketnya tanpa antri. Klik menu bayar di M-Smile dan pilih tiket kereta api ya! Bayarnya gampang bikin liburan makin nyaman!')


Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Umum\\04.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Umum\\05.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Pengumuman/Umum/11. ImageView-Pengumuman 2'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Umum/13. TextView-Detail 2'), 'Detail')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Umum/14. TextView-Heading 2, Detail 2'), 
	'Saatnya pergi liburan, bayar tiketnya bisa sambil rebahan')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Umum/15. TextView-Body 2, Detail 2'), 
	'Pergi liburan naik kereta api bayar tiketnya tanpa antri. Klik menu bayar di M-Smile dan pilih tiket kereta api ya! Bayarnya gampang bikin liburan makin nyaman!')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Umum\\06.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Umum\\07.png')

Mobile.closeApplication()

