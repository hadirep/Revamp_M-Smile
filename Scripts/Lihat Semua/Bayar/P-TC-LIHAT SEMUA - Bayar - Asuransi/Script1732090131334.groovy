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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Asuransi\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/01. ViewGroup - Lihat Semua'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Asuransi\\02.png')

Mobile.scrollToText('Lainnya')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Asuransi\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/02. ViewGroup - Asuransi'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Asuransi\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/03. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Asuransi\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/04. EditText - Field Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Asuransi\\06.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/05. EditText - Cari Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Asuransi\\07.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/06. ScrollView - Tap Body Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Asuransi\\08.png')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/07. TextView - BPJS Kesehatan'), 
	'BPJS Kesehatan')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/08. TextView - PRUDENTIAL-BAYAR PREMI LANJUTANSPAJ'), 
	'PRUDENTIAL-BAYAR PREMI LANJUTAN/SPAJ')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/09. TextView - PRUDENTIAL-TOPUP PREMI'), 
	'PRUDENTIAL-TOPUP PREMI')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/10. TextView - PRUDENTIAL-BIAYA CETAK ULANG POLIS'), 
	'PRUDENTIAL-BIAYA CETAK ULANG POLIS')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/11. TextView - PRUDENTIAL-BIAYA PERUBAHAN POLIS'), 
	'PRUDENTIAL-BIAYA PERUBAHAN POLIS')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/12. TextView - PRUDENTIAL-BIAYA CETAK KARTU'), 
	'PRUDENTIAL-BIAYA CETAK KARTU')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/13. TextView - BPJS Ketenagakerjaan'), 
	'BPJS Ketenagakerjaan')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/14. TextView - INSURANCE'), 
	'INSURANCE')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Asuransi\\09.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/15. ViewGroup - Back Button Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Bayar - Asuransi\\10.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Bayar/07. Bayar - Asuransi/16. PathView - Back Button'), 0)

Mobile.closeApplication()