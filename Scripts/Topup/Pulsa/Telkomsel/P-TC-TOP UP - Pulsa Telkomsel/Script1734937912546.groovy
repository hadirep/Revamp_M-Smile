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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Telkomsel\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/01. SvgView-Topup dan Bayar'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Telkomsel\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/02. View-Pulsa'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Telkomsel\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/03. EditText-Input No HP'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/03. EditText-Input No HP'),
	'0812666666001', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Telkomsel\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/04. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/05. SvgView-Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/06. SvgView-Pilih Nominal'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/07. TextView-15000'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Telkomsel\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/08. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/09. TextView-Pembelian PULSA REGULER TELKOMSEL'),
	'Pembelian PULSA REGULER TELKOMSEL')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/10. TextView-verif 0812666666001'), 
	'0812666666001')

String nomor = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/10. TextView-verif 0812666666001'), 0)
println(nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/11. TextView-Rp. 15.000'), 
	'Rp. 15.000')

String nominal = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/11. TextView-Rp. 15.000'), 0)
println(nominal)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/12. TextView-Rp. 1.500'), 
	'Rp. 1.500')

String admin = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/12. TextView-Rp. 1.500'), 0)
println(admin)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/13. TextView-Rp. 16.500'), 
	'Rp.  16.500')

String total = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/13. TextView-Rp. 16.500'), 0)
println(total)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/14. EditText-M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/14. EditText-M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Telkomsel\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/15. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/16. TextView-Top Up Berhasil'), 
	'Top Up Berhasil!')

String status = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/16. TextView-Top Up Berhasil'), 0)
println(status)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/17. TextView-Rp. 16.500'), 
	'Rp.  16.500')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/18. TextView-0812666666001'), 
	'0812666666001')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/19. TextView-Rp. 15.000'), 
	'Rp. 15.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/20. TextView-Rp. 1.500'), 
	'Rp. 1.500')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/21. TextView-Rp. 16.500'), 
	'Rp.  16.500')

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Telkomsel\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/22. ViewGroup-Bagikan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Telkomsel\\08.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Telkomsel\\09.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Telkomsel/23. GroupView-Close Button'), 0)

Mobile.pressBack()

Mobile.closeApplication()