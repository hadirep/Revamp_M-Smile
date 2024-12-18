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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/01. ViewGroup-Bayar'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/02. ViewGroup-Telepon'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/03. SvgView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/04. TextView-Daftar Produk'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/05. TextView-TELKOM PAY'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/06. TextView-Tap Nopel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\07.png')

Mobile.setText(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/07. EditText-Set Nopel'), '081102125001', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/08. ViewGroup-Ok'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\09.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/09. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/10. TextView-verif TELKOM PAY'), 
	'TELKOM PAY')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/11. ViewGroup-Tap M-PIN'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\11.png')

Mobile.setText(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/12. EditText-Set M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\12.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/13. ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/14. TextView-verif Pembayaran Berhasil'), 
    'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/15. TextView-verif Rp. 51.903'), 
	'Rp. 51.903')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/16. TextView-verif 081102125001'), 
	'081102125001')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/17. TextView-verif WARREN CUCCURULLO'), 
    'WARREN CUCCURULLO')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/18. TextView-verif Rp. 49.403'), 
	'Rp. 49.403')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/19. TextView-verif Rp. 2500'), 
	'Rp. 2500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/20. TextView-verif Rp. 51.903'), 
	'Rp. 51.903')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\13.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Telepon/Telkom Pay/21. ViewGroup-Bagikan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\14.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\15.png')

Mobile.tapAtPosition(1140, 465)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Telepon - Telkom Pay\\16.png')

Mobile.closeApplication()

