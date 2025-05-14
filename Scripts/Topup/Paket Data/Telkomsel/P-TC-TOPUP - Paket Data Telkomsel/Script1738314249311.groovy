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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/01. SvgView-Topup dan Bayar'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/02. Button-Paket Data'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/03. EditText-Input No HP'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/03. EditText-Input No HP'), 
	'0821666666001', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/04. Button-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/05. SvgView-Jenis Paket'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/06. ViewGroup-10000'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/07. SvgView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/08. Button-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/09. TextView-verif Pembelian PULSA INTERNET TELKOMSEL'), 
	'Pembelian PULSA INTERNET TELKOMSEL')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/10. TextView-verif 0821666666001'),
	'0821666666001')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/11. TextView-verif Nominal Rp. 10.000'),
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/12. TextView-verif Adm Rp. 1.500'),
	'Rp. 1.500')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/13. TextView-verif Total Rp. 11.500'),
	'Rp.  11.500')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/14. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/15. EditText-Set M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/16. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/17. TextView-verif Top Up Berhasil'),
	 'Top Up Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/18. TextView-verif Total Rp. 11.500'),
	'Rp.  11.500')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/19. TextView-verif 0821666666001'),
	'0821666666001')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/20. TextView-verif Nominal Rp. 10.000'),
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/21. TextView-verif Adm Rp. 1.500'),
	'Rp. 1.500')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/22. TextView-verif Total Rp. 11.500'),
	'Rp.  11.500')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/23. ViewGroup-Bagikan'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\08.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\09.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/24. GroupView-Close Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\10.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\11.png')

Mobile.closeApplication()

