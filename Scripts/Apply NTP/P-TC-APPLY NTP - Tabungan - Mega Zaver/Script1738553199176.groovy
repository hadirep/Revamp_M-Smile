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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\01.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/01. ViewGroup-Apply NTP'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\02.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/02. ViewGroup-Tabungan'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\03.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/03. ViewGroup-Mega Zaver'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\04.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/04. ViewGroup-Pilih Tabungan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\05.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/05. TextView-Teks Mega Zaver'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/06. ViewGroup-Teks Fitur dan Fasilitas'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\06.png')

Mobile.swipe(0, 500, 0, 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/07. ViewGroup-Tarif dan Biaya'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\07.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/08. TextView-Tarif dan Biaya Lagi'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/09. ViewGroup-Teks Fitur dan Fasilitas Lagi'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/10. TextView-Teks Mega Zaver Lagi'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\08.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/11. ViewGroup-Buka Rekening'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\09.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/12. EditText-Tap Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/13. EditText-Set Nominal'), '100000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/14. CheckBox-Centang SnK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\10.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/15. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/16. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/17. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\11.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/18. ViewGroup-Lanjut'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\12.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/19. ViewGroup-Bagikan'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\13.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\14.png')

Mobile.tapAtPosition(1150, 463)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\15.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Zaver/21. ViewGroup-Akun Saya'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\16.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Zaver\\17.png')

Mobile.closeApplication()
