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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/01. ViewGroup-Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/02. RectView-TV Kabel dan Internet'), 
    0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/03. PathView-Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/04. EditText-Tap Daftar Produk'), 
    0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/05. TextView-INTERNET TELKOM'), 
    0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/06. TextView-Tap Nopel'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/07. EditText-Tap Field Input'), 
    0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\08.png')

Mobile.setText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/08. EditText-Set Nopel'), '0123456789001', 
    0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\09.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/09. ViewGroup-Ok'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\11.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/10. ViewGroup-Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\12.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/11. TextView-verif INTERNET TELKOM (Konfirm Pembayaran)'), 
	'INTERNET TELKOM')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/12. TextView-verif WARREN CUCCURULLO (Konfirm Pembayaran)'), 
    'WARREN CUCCURULLO')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/13. TextView-verif 0123456789001 (Konfirm Pembayaran)'), 
    '0123456789001')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/14. TextView-verif Rp. 49.403 (Nominal)'), 
    'Rp. 49.403')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/15. TextView-verif Rp. 2500 (Admin)'), 
    'Rp. 2500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/16. TextView-verif Rp. 51.903 (Total)'), 
    'Rp. 51.903')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/17. ViewGroup-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/18. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\13.png')


Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/19. ViewGroup-Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\14.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/20. TextView-verif Pembayaran Berhasil'), 
    'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/21. TextView-verif Rp. 51.903'), 
    'Rp. 51.903')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/22. TextView-verif Nominal Rp. 49.403'), 
    'Rp. 49.403')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/23. TextView-verif Admin Rp. 2500'), 
    'Rp. 2500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/24. TextView-verif Total Rp. 51.903'), 
    'Rp. 51.903')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\15.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/25. ViewGroup-Bagikan'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\16.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/Internet Telkom/26. Button-Cancel'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\17.png')

Mobile.tapAtPosition(1144, 440)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - Internet Telkom\\18.png')

Mobile.closeApplication()