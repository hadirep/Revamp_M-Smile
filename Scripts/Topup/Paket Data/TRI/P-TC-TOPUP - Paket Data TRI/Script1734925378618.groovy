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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/01. Button-Topup'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/02. Button-Paket Data'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/03. EditText-Input Nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/TRI/03. EditText-Input Nomor'), 
	'0895703376666', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/04. Button-Lanjut'), 0)

//Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/05. SvgView-Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/07. Dropdown-Jenis Paket'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/08. ViewGroup-Paket Internet'), 0)

String nominal = Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/09. TextView-Nominal'), 
	'Rp. 41.000')

println(nominal)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/10. Dropdown-Waktu Transaksi'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/11. Dropdown-Sekarang'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/12. Button-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/13. TextView-Pembelian PAKET DATA TRI'), 
	'Pembelian PAKET DATA TRI')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/14. TextView-0895703376666'),
	'0895703376666')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/15. TextView-Nominal Rp. 41.000'),
	'Rp. 41.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/16. TextView-Adm Rp. 0'),
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/17. TextView-Total Rp.  41.000'),
	'Rp.  41.000')


Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/18. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/TRI/19. EditText-Set M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/20. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/21. TextView-Top Up Berhasil'),
	 'Top Up Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/22. TextView-Rp. 41.000'),
	'Rp.  41.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/23. TextView-0895703376666'),
	'0895703376666')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/24. TextView-Nominal Rp. 41.000'),
	'Rp. 41.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/25. TextView-Adm Rp. 0'),
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/TRI/26. TextView-Total Rp. 41.000'),
	'Rp.  41.000')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/27. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\08.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\09.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/TRI/28. GroupView-Button Close'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data TRI\\10.png')

Mobile.closeApplication()

