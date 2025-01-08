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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\01.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/01. ImageView-Akun Saya'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\02.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/02. SvgView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\03.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/03. ImageView-Klik Detail Tabungan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\04.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/04. TextView-Mutasi'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\05.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/05. ViewGroup-Back Button Mutasi'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\06.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/06. TextView-E-Statement'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\07.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\08.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/07. ImageView-Top Up'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\09.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/08. View-Icon Pulsa'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\10.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/09. EditText-Input nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/09. EditText-Input nomor'),
	'085770056083', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\11.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/10. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/11. SvgView-Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/12. SvgView-Pilih Nominal'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/13. TextView-25000'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\12.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/14. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/15. TextView-Pembelian INDOSAT OOREDOO'),
	'Pembelian INDOSAT OOREDOO')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/16. TextView-verif 085770056083'), 
	'085770056083')

String nomor = Mobile.getText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/16. TextView-verif 085770056083'), 0)
println(nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/17. TextView-Rp. 25.000'), 
	'Rp. 25.000')

String nominal = Mobile.getText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/17. TextView-Rp. 25.000'), 0)
println(nominal)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/18. TextView-verif Rp. 1.500'), 
	'Rp. 1.500')

String admin = Mobile.getText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/18. TextView-verif Rp. 1.500'), 0)
println(admin)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/19. TextView-verif total Rp. 26.500'), 
	'Rp.  26.500')

String total = Mobile.getText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/19. TextView-verif total Rp. 26.500'), 0)
println(total)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/20. EditText-M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/20. EditText-M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\13.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/21. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/22. TextView-Top Up Berhasil'), 
	'Top Up Berhasil!')

String status = Mobile.getText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/22. TextView-Top Up Berhasil'), 0)
println(status)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/23. TextView-verif Rp. 26.500'), 
	'Rp.  26.500')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/24. TextView-085770056083'), 
	'085770056083')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/25. TextView-verif nominal Rp. 25.000'), 
	'Rp. 25.000')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/26. TextView-verif adm Rp. 1.500'), 
	'Rp. 1.500')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Topup/27. TextView-verif total Rp. 26.500'), 
	'Rp.  26.500')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\13.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/28. ViewGroup-Bagikan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\14.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\15.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Topup/29. GroupView-Button Close'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\16.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\17.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\18.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Topup\\19.png')

Mobile.closeApplication()