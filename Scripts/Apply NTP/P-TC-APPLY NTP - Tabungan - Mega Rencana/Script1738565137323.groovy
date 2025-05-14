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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\01.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/01. ViewGroup-Apply NTP'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\02.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/02. ViewGroup-Tabungan'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\03.png')

Mobile.swipe(0, 1400, 0, 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/03. ViewGroup-Mega Rencana'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\04.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/04. ViewGroup-Pilih Tabungan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\05.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/05. ViewGroup-Teks Mega Rencana'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/06. ViewGroup-Teks Fitur dan Fasilitas'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\06.png')

Mobile.swipe(0, 500, 0, 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/07. ViewGroup-Tarif dan Biaya'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\07.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/08. TextView-Tarif dan Biaya Lagi'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/09. ViewGroup-Teks Fitur dan Fasilitas Lagi'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/10. ViewGroup-Teks Mega Rencana Lagi'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\08.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/11. ViewGroup-Buka Rekening'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\09.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/12. EditText-Tap Setoran Awal'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/13. EditText-Set Setoran Awal'),
	'100000', 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/14. ImageView-Jangka Waktu'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/15. TextView-12 Bulan'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/16. EditText-Tap Tgl Debit'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/17. EditText-Set Tgl Debit'), '21', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/18. TextView-Tap Amount'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/19. EditText-100000'), '100000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/20. CheckBox-Centang SnK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\10.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/21. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/22. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/23. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\11.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/24. ViewGroup-Lanjut'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\12.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/25. ViewGroup-Bagikan'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\13.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\14.png')

Mobile.tapAtPosition(1150, 463)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\15.png')

Mobile.tap(findTestObject('Object Repository/Apply NTP/Tabungan/Mega Rencana/26. ViewGroup-Akun Saya'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\16.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTP - Tabungan - Mega Rencana\\17.png')

Mobile.closeApplication()
