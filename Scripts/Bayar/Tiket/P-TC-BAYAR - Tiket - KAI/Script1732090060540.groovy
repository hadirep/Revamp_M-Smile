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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/01. ImageView-Bayar'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/02. SvgView-Tiket'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/03. SvgView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/04. EditText-Tap Field Daftar Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/05. TextView-KAI'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/06. TextView-Tap Field Nopel'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/07. EditText-Tap Field Input Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Tiket/KAI/08. EditText-Set Nopel'), '1999123459001', 0)

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/09. ViewGroup-Ok'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/10. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/11. TextView-verif KAI'), 
	'KAI')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/12. TextView-verif WARREN CUCCURULLO'), 
	'WARREN CUCCURULLO')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/13. TextView-verif 1999123459001'), 
	'1999123459001')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/14. TextView-verif Rp. 1.135.912'), 
	'Rp. 1.135.912')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/15. TextView-verif Rp. 0'), 
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/16. TextView-verif Rp. 1.135.912'), 
	'Rp. 1.135.912')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/17. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Tiket/KAI/18. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/19. ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/20. TextView-Pembayaran Berhasil'), 
	'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/21. TextView-Rp. 1.135.912'), 
	'Rp. 1.135.912')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/22. TextView-verif 1999123459001'), 
	'1999123459001')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/23. TextView-verif WARREN CUCCURULLO'), 
	'WARREN CUCCURULLO')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/24. TextView-verif Rp. 1.135.912'), 
	'Rp. 1.135.912')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/25. TextView-verif Rp. 0'), 
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Tiket/KAI/26. TextView-verif Rp. 1.135.912'), 
	'Rp. 1.135.912')

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/27. ViewGroup-Bagikan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\08.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\09.png')

Mobile.tapAtPosition(1147, 465)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\10.png')

Mobile.closeApplication()