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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TOPUP - Pulsa TRI\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/01. ViewGroup - Button Top Up'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TOPUP - Pulsa TRI\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/02. View - Icon Pulsa'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TOPUP - Pulsa TRI\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/03. EditText - Input nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/TRI/03. EditText - Input nomor'),
	'089789000105', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TOPUP - Pulsa TRI\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/05. ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/06. SvgView - Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/07. SvgView - Pilih Nominal'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/08. TextView - 30000'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TOPUP - Pulsa TRI\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/09. ViewGroup - Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/TRI/10. TextView - Pembelian TRI'),
	'Pembelian TRI')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/TRI/11. TextView - verif 089789000105'), 
	'089789000105')

String nomor = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/TRI/11. TextView - verif 089789000105'), 0)
println(nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/TRI/12. TextView - Rp. 30.000'), 
	'Rp. 30.000')

String nominal = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/TRI/12. TextView - Rp. 30.000'), 0)
println(nominal)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/TRI/13. TextView - Rp. 0'), 
	'Rp. 0')

String admin = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/TRI/13. TextView - Rp. 0'), 0)
println(admin)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/TRI/14. TextView - Rp. 30.000'), 
	'Rp.  30.000')

String total = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/TRI/14. TextView - Rp. 30.000'), 0)
println(total)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/15. EditText - M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/TRI/15. EditText - M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TOPUP - Pulsa TRI\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/16. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/TRI/17. TextView-Top Up Berhasil'), 
	'Top Up Berhasil!')

String status = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/TRI/17. TextView-Top Up Berhasil'), 0)
println(status)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/TRI/18. TextView-Rp. 30.000'), 
	'Rp.  30.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/TRI/19. TextView-089789000105'), 
	'089789000105')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/TRI/20. TextView-Rp. 30.000'), 
	'Rp. 30.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/TRI/21. TextView-Rp. 0'), 
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/TRI/22. TextView-Rp. 30.000'), 
	'Rp.  30.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TOPUP - Pulsa TRI\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/23. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TOPUP - Pulsa TRI\\08.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TOPUP - Pulsa TRI\\09.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/TRI/24. GroupView-Button Close'), 0)

Mobile.pressBack()

Mobile.closeApplication()