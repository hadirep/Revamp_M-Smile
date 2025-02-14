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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/01. ViewGroup-Bayar'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/02. RectView-TV Kabel dan Internet'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/03. PathView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/04. EditText-Tap Daftar Produk'), 
    0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/05. TextView-First Media'), 
    0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/06. TextView-Tap Nopel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/07. EditText-Tap Field Input'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\08.png')

Mobile.setText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/08. EditText-Set Nopel'),
	'401000080011', 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\09.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/09. ViewGroup-Ok'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\11.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/10. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/11. TextView-First Media'), 
	'First Media')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/12. TextView-WISHNU EKA SIDHARTA'), 
    'WISHNU EKA SIDHARTA')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/13. TextView-401000080011'), 
    '401000080011')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/14. TextView-Nominal Rp. 46.200'), 
    'Rp. 46.200')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/15. TextView-Adm Rp. 0'), 
    'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/16. TextView-Total Rp. 46.200'), 
    'Rp. 46.200')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/17. ViewGroup-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/18. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\12.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/19. ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/20. TextView-verif Pembayaran Berhasil'), 
    'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/21. TextView-Rp. 46.200'), 
    'Rp. 46.200')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/22. TextView-Nominal Rp. 46.200'), 
    'Rp. 46.200')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/23. TextView-Adm Rp. 0'), 
    'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/24. TextView-Total Rp. 46.200'), 
    'Rp. 46.200')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\13.png')

Mobile.tap(findTestObject('Object Repository/Bayar/TV Kabel dan Internet/First Media/25. ViewGroup-Bagikan'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\14.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\15.png')

Mobile.tapAtPosition(1144, 440)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - TV Kabel dan Internet - First Media\\16.png')

Mobile.closeApplication()