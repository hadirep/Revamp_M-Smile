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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/01. Button-Topup'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/02. Button-Paket Data'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/03. EditText-Input Nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/03. EditText-Input Nomor'), 
	'0812666666001', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/04. Button-Lanjut'), 0)

Mobile.delay(3)
Mobile.swipe(900, 500, 100, 500)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/05. SvgView-Jenis Paket'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/06. ViewGroup-10000'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/07. SvgView-Waktu Transaksi'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/08. ViewGroup-Sekarang'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/09. Button-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/10. TextView-verif Pembelian PULSA INTERNET TELKOMSEL'), 
	'Pembelian PULSA INTERNET TELKOMSEL')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/11. TextView-verif 0812666666001'),
	'0812666666001')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/12. TextView-verif Nominal Rp. 10.000'),
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/13. TextView-verif Adm Rp. 1.500'),
	'Rp. 1.500')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/14. TextView-verif Total Rp. 11.500'),
	'Rp.  11.500')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/15. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/16. EditText-Set M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/17. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/18. TextView-Rekening Dormant'),
	'Nomor rekening tujuan tidak ditemukan/rekening sumber dana Anda tidak aktif. Untuk aktivasi rekening sumber dana, lakukan pada menu Pengaturan Atur Akun, dengan nonaktifkan dan aktifkan kembali sebagai sumber dana lalu lakukan transaksi atas rekening tersebut. [F77]')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant - Dormant\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel - Dormant/19. ViewGroup-OK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant - Dormant\\08.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant - Dormant\\09.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant - Dormant\\10.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant - Dormant\\11.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-TOPUP - Paket Data Telkomsel - Rekening Dormant - Dormant\\12.png')

Mobile.closeApplication()

