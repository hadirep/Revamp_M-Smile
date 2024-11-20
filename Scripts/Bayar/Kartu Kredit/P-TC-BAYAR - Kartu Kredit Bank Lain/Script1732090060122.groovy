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
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/01. ViewGroup - Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/02. ViewGroup - Kartu Kredit'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/03. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/03. SvgView - Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/04. ViewGroup - Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/05. TextView - KARTU KREDIT BANK LAIN'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/06. TextView - Nomor Pelanggan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/07. EditText - Input Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/07. EditText - Input Baru'), '5401844210627787', 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/08. ScrollView - Tap Body'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\09.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/09. ViewGroup - Ok'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/10. ViewGroup - Bank Tujuan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\11.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/11. EditText - Cari'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/11. EditText - Cari'), 'CITIBANK', 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\12.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/11. EditText - Cari'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/12. ScrollView - Tap Body'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/13. TextView - Tap CITIBANK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\13.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/14. ViewGroup - Lanjut'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\14.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/15. TextView - verif KARTU KREDIT BANK LAIN'), 
	'KARTU KREDIT BANK LAIN')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/16. TextView - verif 5401844210627787'),
	'5401844210627787')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/17. TextView - verif Rp. 0'),
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/18. TextView - verif Rp. 7500'),
	'Rp. 7500')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/19. EditText - Amount'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/19. EditText - Amount'), 
	'7500', 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/20. ScrollView - Tap Body'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/21. EditText - M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/21. EditText - M-PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/22. ViewGroup - Tap Body'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\15.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/23. ViewGroup - Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/24. TextView-verif Pembayaran Berhasil'), 
	'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/25. TextView-verif Rp. 15.000'), 
	'Rp. 15.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/26. TextView-verif Pembayaran KARTU KREDIT BANK LAIN'), 
	'Pembayaran KARTU KREDIT BANK LAIN')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/27. TextView-verif 5401844210627787'), 
	'5401844210627787')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/28. TextView-verif Nominal Rp. 7.500'), 
	'Rp. 7.500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/29. TextView-verif adm Rp. 7500'), 
	'Rp. 7500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/30. TextView-verif total Rp. 15.000'), 
	'Rp. 15.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\16.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Kartu Kredit/Kartu Kredit Bank Lain/32. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\17.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\18.png')

Mobile.tapAtPosition(1160, 440)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Kartu Kredit Bank Lain\\19.png')

Mobile.closeApplication()