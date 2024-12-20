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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat - Dormant\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/01. ViewGroup - Button Top Up'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat - Dormant\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/02. View - Icon Pulsa'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat - Dormant\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/03. EditText - Input nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/03. EditText - Input nomor'),
	'085770056083', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat - Dormant\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/05. ViewGroup - Lanjut'), 0)

Mobile.delay(1)

Mobile.swipe(900, 500, 100, 500)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/06. PathView-Pilih Nominal'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/07. TextView-25000'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat - Dormant\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/08. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/09. TextView-Pembelian INDOSAT OOREDOO'),
	'Pembelian INDOSAT OOREDOO')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/10. TextView-verif 085770056083'), 
	'085770056083')

String nomor = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/10. TextView-verif 085770056083'), 0)
println(nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/11. TextView-Rp. 25.000'), 
	'Rp. 25.000')

String nominal = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/11. TextView-Rp. 25.000'), 0)
println(nominal)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/12. TextView-Rp. 1.500'), 
	'Rp. 1.500')

String admin = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/12. TextView-Rp. 1.500'), 0)
println(admin)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/13. TextView-Rp. 26.500'), 
	'Rp.  26.500')

String total = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/13. TextView-Rp. 26.500'), 0)
println(total)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/14. EditText-M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/14. EditText-M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat - Dormant\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/15. ViewGroup-Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat - Dormant\\07.png')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/16. TextView-verif Dormant'),
	'Nomor rekening tujuan tidak ditemukan/rekening sumber dana Anda tidak aktif. Untuk aktivasi rekening sumber dana, lakukan pada menu Pengaturan Atur Akun, dengan nonaktifkan dan aktifkan kembali sebagai sumber dana lalu lakukan transaksi atas rekening tersebut [H77]')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat - Dormant\\08.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Dormant/17. TextView-OK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat - Dormant\\09.png')

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()