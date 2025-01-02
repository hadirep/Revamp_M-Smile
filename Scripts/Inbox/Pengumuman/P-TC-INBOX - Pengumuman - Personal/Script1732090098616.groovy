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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Personal\\01.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Pengumuman/Personal/01. ViewGroup-Inbox'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Personal\\02.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Pengumuman/Personal/02. ViewGroup-Pengumuman'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Personal\\03.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Pengumuman/Personal/03. ViewGroup-Personal'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Personal\\04.png')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/04. TextView-Anda Baru saja menerima dana dari Bank Mega 10740021008901 an Fadlilaili Whahda Sabila ke Mega Salary no 808 Anda sebesar Rp. 60.000'), 
    'Anda Baru saja menerima dana dari Bank Mega 10740021008901 an Fadlilaili Whahda Sabila ke Mega Salary no ***808 Anda sebesar Rp. 60.000')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/05. TextView-Tagihan Split Bill Makanan dari Kevin Surya Kusuma sebesar Rp. 100.000'), 
    'Tagihan Split Bill ‘Makanan’ dari Kevin Surya Kusuma sebesar Rp. 100.000')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/06. TextView-Almasita Ghassani Aginsha telah klaim kiriman uang Anda sebesar Rp. 10.000'), 
    'Almasita Ghassani Aginsha telah klaim kiriman uang Anda sebesar Rp. 10.000')

Mobile.tap(findTestObject('Object Repository/Inbox/Pengumuman/Personal/07. TextView-Tap list 1'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/08. TextView-verif app bar, detail 1'), 
    'Detail')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/09. TextView-verif heading, list 1'), 
    'Saatnya pergi liburan, bayar tiketnya bisa sambil rebahan')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/10. TextView-verif body, list 1'), 
	'Pergi liburan naik kereta api bayar tiketnya tanpa antri. Klik menu bayar di M-Smile dan pilih tiket kereta api ya! Bayarnya gampang bikin liburan makin nyaman!')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Personal\\05.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Personal\\06.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Pengumuman/Personal/11. ViewGroup-Tap list 2'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/12. TextView-verif app bar, detail 2'), 
    'Detail')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/13. TextView-verif heading, list 2'), 
    'Saatnya pergi liburan, bayar tiketnya bisa sambil rebahan')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/14. TextView-verif body, list 2'), 
	'Pergi liburan naik kereta api bayar tiketnya tanpa antri. Klik menu bayar di M-Smile dan pilih tiket kereta api ya! Bayarnya gampang bikin liburan makin nyaman!')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Personal\\07.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Inbox/Pengumuman/Personal/15. ViewGroup-Tap list 3'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/16. TextView-verif app bar, detail 3'), 
    'Detail')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/17. TextView-verif heading, detail 3'), 
    'Saatnya pergi liburan, bayar tiketnya bisa sambil rebahan')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Pengumuman/Personal/18. TextView-verif body, detail 3'), 
	'Pergi liburan naik kereta api bayar tiketnya tanpa antri. Klik menu bayar di M-Smile dan pilih tiket kereta api ya! Bayarnya gampang bikin liburan makin nyaman!')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Personal\\08.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Pengumuman - Personal\\09.png')

Mobile.closeApplication()