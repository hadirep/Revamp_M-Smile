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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Transaksi - Bayar\\01.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Bayar/01. ViewGroup-Inbox'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Transaksi - Bayar\\02.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Bayar/02. ViewGroup-Bayar'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Transaksi - Bayar\\03.png')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Bayar/03. TextView-verif Telkom'), 
    'Telkom')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Bayar/04. TextView-verif 081102125001'), '081102125001')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Bayar/05. TextView-verif Rp. 51.903'), 'Rp. 51.903')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Bayar/06. ViewGroup-Klik bill'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Bayar/07. TextView-verif Top Up Berhasil'), 'Top Up Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Bayar/08. TextView-verif Rp.  51.903'), 'Rp.  51.903')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Bayar/09. TextView-verif nominal Rp. 49.403'), 'Rp. 49.403')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Bayar/10. TextView-verif adm Rp. 2.500'), 'Rp. 2.500')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Bayar/11. TextView-verif Total Rp. 51.903'), 'Rp.  51.903')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Transaksi - Bayar\\04.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Bayar/12. ViewGroup-Bagikan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Transaksi - Bayar\\05.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Transaksi - Bayar\\06.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Bayar/13. GroupView-Close Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Transaksi - Bayar\\07.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-INBOX - Transaksi - Bayar\\07.png')

Mobile.closeApplication()