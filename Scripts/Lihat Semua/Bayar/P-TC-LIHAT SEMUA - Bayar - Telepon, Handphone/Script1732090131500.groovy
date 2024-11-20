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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Telepon, Handphone\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/01. ViewGroup - Lihat Semua'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Telepon, Handphone\\02.png')

Mobile.scrollToText('Lainnya')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Telepon, Handphone\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/02. ViewGroup - Telpon Handphone'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Telepon, Handphone\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/03. SvgView - Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/04. EditText - Field Daftar Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/05. EditText - Cari Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/06. ScrollView - Tap Body'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/07. TextView - XL'), 'XL')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/08. TextView - TELKOM PAY'), 'TELKOM PAY')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/09. TextView - SMARTFREN'), 'SMARTFREN')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/10. TextView - KARTUHALO'), 'KARTUHALO')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/11. TextView - INDOSAT OOREDOO'), 'INDOSAT OOREDOO')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Telepon, Handphone\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/12. ViewGroup - Back Button Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Telepon, Handphone\\06.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/01. Bayar - Telepon, Handphone/13. PathView - Back Button'), 0)

Mobile.closeApplication()


