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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Personal Loan\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/04. Bayar - Personal Loan/01. ViewGroup - Lihat Semua'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Personal Loan\\02.png')

Mobile.scrollToText('Lainnya')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Personal Loan\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/04. Bayar - Personal Loan/02. ViewGroup - Personal Loan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Personal Loan\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/04. Bayar - Personal Loan/03. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Personal Loan\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/04. Bayar - Personal Loan/04. EditText - Field Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Personal Loan\\06.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/04. Bayar - Personal Loan/05. EditText - Cari Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Personal Loan\\07.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/04. Bayar - Personal Loan/06. ScrollView - Tap Body Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Personal Loan\\08.png')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/04. Bayar - Personal Loan/07. TextView - MEGA CASH LINE'), 
	'MEGA CASH LINE')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Personal Loan\\09.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/04. Bayar - Personal Loan/08. ViewGroup - Back Button Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Personal Loan\\10.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/04. Bayar - Personal Loan/09. PathView - Back Button'), 0)

Mobile.closeApplication()