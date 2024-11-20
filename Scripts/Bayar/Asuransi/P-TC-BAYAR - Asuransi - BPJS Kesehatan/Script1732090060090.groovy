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
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/01. ViewGroup - Button Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/02. ViewGroup - Button Asuransi'), 0)

//Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/03. SvgView - Button Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/04. ViewGroup - Field Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/05. ViewGroup - Pilih BPJS Kesehatan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/06. ViewGroup - Field Nomor Pelanggan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/07. EditText - Tap Field Input Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/08. EditText - Set Text Field No Pel'), '8888800122115324', 
    0)

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/09. ScrollView - Tap Body'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/10. ViewGroup - Button Ok'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/11. ViewGroup - Tap Field Tenor'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/12. ViewGroup - Pilih Tenor 1 Bulan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\09.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/13. ViewGroup - Button Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/14. TextView - BPJS Kesehatan'),
	'BPJS Kesehatan')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/15. TextView - Dummy Name BPJS'),
	'Dummy Name BPJS')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/16. TextView - 8888800122115324'),
	'8888800122115324')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/17. TextView - 0001827166173'),
	'0001827166173')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/18. TextView - Rp. 80.000'),
	'Rp. 80.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/19. TextView - Rp. 80.000'),
	'Rp. 80.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/20. TextView - Rp. 160.000'),
	'Rp. 160.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/21. TextView - Rp. 2500'),
	'Rp. 2500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/22. TextView - Rp. 162.500'),
	'Rp. 162.500')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/23. TextView - M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/24. EditText - Input M-PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/25. ScrollView - Tap Body'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/26. ViewGroup - Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/28. TextView - Pembayaran Berhasil'),
	'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/29. TextView - Rp. 162.500'),
	'Rp. 162.500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/30. TextView - 8888800122115324'),
	'8888800122115324')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/31. TextView - Dummy Name BPJS'),
	'Dummy Name BPJS')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/32. TextView - Nomor KA 0001827166173'),
	'0001827166173')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/33. TextView - 80.000'),
	'80.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/34. TextView - 80.000'),
	'80.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/35. TextView - Rp. 160.000'),
	'Rp. 160.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/36. TextView - Rp. 2500'),
	'Rp. 2500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/37. TextView - Rp. 162.500'), 
	'Rp. 162.500')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\11.png')

Mobile.scrollToText('Bagikan')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\12.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Asuransi/BPJS Kesehatan/38. ViewGroup - Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\13.png')

Mobile.pressBack()

Mobile.scrollToText('Pembayaran Berhasil!')

Mobile.delay(2)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\14.png')

Mobile.tapAtPosition(1144, 457)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Asuransi - BPJS Kesehatan\\15.png')

Mobile.closeApplication()

