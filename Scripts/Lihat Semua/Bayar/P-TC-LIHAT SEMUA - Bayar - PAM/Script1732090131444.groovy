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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - PAM\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/01. ViewGroup - Lihat Semua'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - PAM\\02.png')

Mobile.scrollToText('Lainnya')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - PAM\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/02. ViewGroup - PAM'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - PAM\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/03. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - PAM\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/04. EditText - Field Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - PAM\\06.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/05. EditText - Cari Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - PAM\\07.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/06. ScrollView - Tap Body Daftar Produk'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/07. TextView - PALYJA'), 
	'PALYJA')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/08. TextView - AETRA'), 
	'AETRA')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/09. TextView - PDAM SURABAYA'),
	'PDAM SURABAYA')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/10. TextView - PDAM PONTIANAK'),
	'PDAM PONTIANAK')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/11. TextView - PDAM KOTA SEMARANG'),
	'PDAM KOTA SEMARANG')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/12. TextView - PDAM KOTA BOGOR'),
	'PDAM KOTA BOGOR')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/13. TextView - PDAM KOTA LAMPUNG'),
	'PDAM KOTA LAMPUNG')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/14. TextView - PDAM KOTA PALEMBANG'),
	'PDAM KOTA PALEMBANG')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/15. TextView - PDAM KAB BOGOR'),
	'PDAM KAB BOGOR')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/16. TextView - PDAM LAINNYA'),
	'PDAM LAINNYA')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - PAM\\08.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/17. ViewGroup - Back Button Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - PAM\\09.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/10. Bayar - PAM/18. PathView - Back Button'), 0)

Mobile.closeApplication()