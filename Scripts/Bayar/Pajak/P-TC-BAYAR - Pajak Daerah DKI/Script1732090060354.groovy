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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/01. ViewGroup-Bayar'), 0)

Mobile.delay(6)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/02. ViewGroup-Pajak'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/03. EditText-Daftar Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/04. TextView-PAJAK DAERAH (DKI Jakarta)'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/05. TextView-Field Nopel'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/06. EditText-Input Baru'), 
    '003456786100', 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/08. ViewGroup-OK'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/09. SvgView-Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/10. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/11. TextView-verif PELANGGAN PAJAK DKI'), 
	'PELANGGAN PAJAK DKI')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/12. TextView-verif 003456786100'), 
	'003456786100')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/13. TextView-verif Nominal Rp. 5.500.000'), 
	'Rp. 5.500.000')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/16. ViewGroup-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/17. EditText-Set M-PIN'), '111111', 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/18. ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/19. TextView-verif Pembayaran Berhasil'), 
	'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/20. TextView-verif Rp. 5.502.500'), 
	'Rp. 5.502.500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/21. TextView-verif Nominal Rp. 5.500.000'), 
	'Rp. 5.500.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/22. TextView-verif Adm Rp. 2500'), 
	'Rp. 2500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/23. TextView-verif Total Rp. 5.502.500'), 
	'Rp. 5.502.500')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/24. ViewGroup-Bagikan'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\08.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\09.png')

Mobile.tapAtPosition(1145, 442)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\10.png')

Mobile.closeApplication()

