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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/01. ImageView-Bayar'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/02. SvgView-Tiket'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/03. SvgView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/04. EditText-Tap Field Daftar Produk'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/05. TextView-GARUDA INDONESIA'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/06. TextView-Tap Field Nopel'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/07. EditText-Tap Field Input Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/08. EditText-Set Nopel'), '1261232345002', 0)

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/09. ViewGroup-Ok'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/10. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/11. TextView-verif GARUDA INDONESIA'), 
	'GARUDA INDONESIA')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/12. TextView-WARREN CUCCURULLO'), 
	'WARREN CUCCURULLO             ')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/13. TextView-verif 1261232345002'), 
	'1261232345002')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/14. TextView-Rp. 1.035.912'), 
	'Rp. 1.035.912')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/15. TextView-Rp. 7500'), 
	'Rp. 7500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/16. TextView-Rp. 1.043.412'), 
	'Rp. 1.043.412')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/17. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/18. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/19. ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/20. TextView-Pembayaran Berhasil'), 
	'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/21. TextView-verif Rp. 1.043.412'), 
	'Rp. 1.043.412')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/22. TextView-verif 1261232345002'), 
	'1261232345002')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/23. TextView-verif WARREN CUCCURULLO'), 
	'WARREN CUCCURULLO             ')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/24. TextView-verif Nominal Rp. 1.035.912'), 
	'Rp. 1.035.912')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/25. TextView-verif Adm Rp. 7500'), 
	'Rp. 7500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/26. TextView-verif Total Rp. 1.043.412'), 
	'Rp. 1.043.412')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\09.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/Garuda Indonesia/27. ViewGroup-Bagikan'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\10.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\11.png')

Mobile.tapAtPosition(1147, 465)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - Garuda Indonesia\\12.png')

Mobile.closeApplication()