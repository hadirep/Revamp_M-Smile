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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/01. ViewGroup-Bayar'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/02. RectView-Pajak MPN'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/03. SvgView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/04. TextView-Daftar Produk'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/05. TextView-Penerimaan Negara-MPN'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/06. TextView-Tap Kode Biling'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/07. EditText-Tap Field Input Baru'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\08.png')

Mobile.setText(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/08. EditText-Set Kode Billing'), '140388918646498', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/09. ViewGroup-Ok'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\09.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/09. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/10. TextView-Penerimaan NegaraMPN'), 
	'Penerimaan Negara/MPN')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/12. TextView-Rp. 50.000'), 
	'Rp. 50.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/13. TextView-Adm Rp. 0'), 
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/14. TextView-Total Rp. 50.000'), 
	'Rp. 50.000')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/15. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/16. EditText-Set M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/17. ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/18. TextView-Pembayaran Berhasil'), 
	'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/19. TextView-Rp. 50.000'), 
	'Rp. 50.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/20. TextView-Nominal Rp. 50.000'), 
	'Rp. 50.000')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/21. TextView-Adm Rp. 0'), 
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/22. TextView-verif Total Rp.  50.000'), 
	'Rp.  50.000')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\11.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/23. ViewGroup-Bagikan'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\12.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/Penerimaan Negara - MPN/24. Button-Cancel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\13.png')

Mobile.tapAtPosition(1130, 445)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak - Penerimaan Negara\\14.png')

Mobile.closeApplication()

