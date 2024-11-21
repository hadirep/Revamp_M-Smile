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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\01.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/01. ViewGroup-Apply'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\02.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/02. ViewGroup-Deposito'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\03.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/03. ViewGroup-Buka Rekening'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\04.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/04. EditText-Tap Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTP/Deposito/05. EditText-Set Nominal'), 
    '10000000', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\05.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/06. SeekBar-6 Bulan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\06.png')

Mobile.scrollToText('Saya telah membaca')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/07. TextView-Jenis Perpanjangan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\07.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/08. ViewGroup-Tidak Perpanjang Otomatis'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\08.png')

Mobile.scrollToText('Saya telah membaca')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/09. CheckBox-Ceklis SNK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\09.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/10. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/11. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTP/Deposito/12. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\10.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/13. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Apply NTP/Deposito/14. TextView-verif Pembukaan Deposito Berhasil'), 
    'Pembukaan Deposito Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Apply NTP/Deposito/15. TextView-MEGA DEPO 6 BLN-MAXI-IDR'), 
    'MEGA DEPO 6 BLN-MAXI-IDR ')

Mobile.verifyElementText(findTestObject('Object Repository/Apply NTP/Deposito/16. TextView-Rp.10.000.000'), 
    'Rp.10.000.000')

Mobile.verifyElementText(findTestObject('Object Repository/Apply NTP/Deposito/17. TextView-6 bulan'), 
    '6 bulan')

Mobile.verifyElementText(findTestObject('Object Repository/Apply NTP/Deposito/18. TextView-3,25'), 
	'3,25%')

Mobile.verifyElementText(findTestObject('Object Repository/Apply NTP/Deposito/19. TextView-Saat Jatuh Tempo'), 
    'Saat Jatuh Tempo')

Mobile.verifyElementText(findTestObject('Object Repository/Apply NTP/Deposito/20. TextView-Tidak dipepanjang otomatis'), 
    'Tidak dipepanjang otomatis')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\11.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Deposito/21. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\12.png')

Mobile.delay(1)
Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\13.png')

Mobile.tapAtPosition(1145, 445)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Deposito - Mega Depo\\14.png')

Mobile.closeApplication()

