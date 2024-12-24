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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/01. ViewGroup - Button Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/02. ViewGroup - Icon Listrik'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/03. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/04. EditText - Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/05. TextView - PLN Postpaid'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/06. EditText - IDPEL'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/07. EditText - Input Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/07. EditText - Input Baru'), 
	'544146107003', 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/08. ViewGroup - Button Ok'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\09.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/09. ViewGroup - Lanjut'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/10. TextView - Error'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/10. TextView - Error'), 'Error')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/11. TextView-verif Sudah Terbayar'), 
	'NOMOR REGISTRASI YANG ANDA MASUKKAN SALAH, MOHON TELITI KEMBALI. [S33]')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Negative/12. ViewGroup-OK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\11.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\12.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-BAYAR - Listrik - Postpaid - Sudah terbayar\\13.png')

Mobile.closeApplication()