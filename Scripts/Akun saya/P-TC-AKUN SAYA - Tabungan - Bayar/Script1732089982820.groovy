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
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\01.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/01. ImageView - Akun Saya'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/02. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\02.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/03. ImageView - Klik Detail Tabungan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\03.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/04. TextView - Mutasi'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\04.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/05. ViewGroup - Back Button Mutasi'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/06. TextView - E-Statement'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\05.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/08. ImageView - Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\06.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/09. ViewGroup - Kartu Kredit'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/10. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\07.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/11. EditText - Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\08.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/12. TextView - CREDIT CARD MEGA'),
	0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\09.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/13. EditText - Nomor Pelanggan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\10.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/14. EditText - Input Baru'),0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\11.png')

Mobile.setText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/14. EditText - Input Baru'),'4201940050189378', 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/15. ScrollView - Tap Body'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\12.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/16. ViewGroup - Ok'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\13.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/17. ViewGroup - Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\14.png')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/18. TextView - ANITA CHANDRA'), 'ANITA CHANDRA')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/19. TextView - 4201940050189378'), '4201940050189378')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/20. EditText - Amount'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/20. EditText - Amount'), '1000.000', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/21. EditText - Amount 1.000.000'), '1.000.000')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/22. ScrollView - Tap Body Amount'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/23. EditText - M-PIN'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/23. EditText - M-PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/24. ScrollView - Tap Body M-PIN'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\15.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/25. ViewGroup - Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/26. TextView - Pembayaran Berhasil'), 'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/27. TextView - Pembayaran Berhasil Rp. 1.000.000'), 'Rp. 1.000.000')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/28. TextView - ANITA CHANDRA'), 'ANITA CHANDRA')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/29. TextView - Nominal Rp. 1.000.000'), 'Rp. 1.000.000')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/30. TextView - Biaya Admin Rp. 0'), 'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/31. TextView - Total Bayar Rp. 1.000.000'), 'Rp. 1.000.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\16.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Bayar/32. ViewGroup - Bagikan'), 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\17.png')

Mobile.tapAtPosition(1140, 430)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Bayar\\18.png')

Mobile.closeApplication()

