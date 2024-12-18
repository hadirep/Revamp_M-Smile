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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\01.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/01. ImageView - Akun Saya'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/02. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\02.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/03. ImageView - Klik Detail Tabungan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\03.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/04. TextView - Mutasi'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\04.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/05. ViewGroup - Back Button Mutasi'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/06. TextView - E-Statement'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\05.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\06.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/07. ViewGroup-Bayar'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\07.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/08. ViewGroup-Telepon'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\08.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/09. SvgView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\09.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/10. TextView-Daftar Produk'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\10.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/11. TextView-TELKOM PAY'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\11.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/12. TextView-Tap Nopel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\12.png')

Mobile.setText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/13. EditText-Set Nopel'), '081102125001', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\13.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/14. ViewGroup-Ok'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\14.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/15. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/16. TextView-verif TELKOM PAY'),
	'TELKOM PAY')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\15.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/17. ViewGroup-Tap M-PIN'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\16.png')

Mobile.setText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/18. EditText-Set M-PIN'),
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\17.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/19. ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/20. TextView-verif Pembayaran Berhasil'),
	'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/21. TextView-verif Rp. 51.903'),
	'Rp. 51.903')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/22. TextView-verif 081102125001'),
	'081102125001')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/23. TextView-verif WARREN CUCCURULLO'),
	'WARREN CUCCURULLO')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/24. TextView-verif Rp. 49.403'),
	'Rp. 49.403')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/25. TextView-verif Rp. 2500'),
	'Rp. 2500')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/26. TextView-verif Rp. 51.903'),
	'Rp. 51.903')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\18.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/27. ViewGroup-Bagikan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\19.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\20.png')

Mobile.tapAtPosition(1140, 465)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\21.png')

Mobile.closeApplication()

