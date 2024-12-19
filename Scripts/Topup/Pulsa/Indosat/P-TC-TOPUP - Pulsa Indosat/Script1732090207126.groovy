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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/01. ViewGroup - Button Top Up'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/02. View - Icon Pulsa'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/03. EditText - Input nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Indosat/03. EditText - Input nomor'),
	'085770056083', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/05. ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/06. SvgView - Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/07. SvgView - Pilih Nominal'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/08. TextView-25000'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/09. ViewGroup - Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat/10. TextView - Pembelian INDOSAT OOREDOO'),
	'Pembelian INDOSAT OOREDOO')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat/11. TextView - verif 085770056083'), 
	'085770056083')

String nomor = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat/11. TextView - verif 085770056083'), 0)
println(nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat/12. TextView - Rp. 25.000'), 
	'Rp. 25.000')

String nominal = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat/12. TextView - Rp. 25.000'), 0)
println(nominal)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat/13. TextView - Rp. 1.500'), 
	'Rp. 1.500')

String admin = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat/13. TextView - Rp. 1.500'), 0)
println(admin)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat/14. TextView - Rp. 26.500'), 
	'Rp.  26.500')

String total = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat/14. TextView - Rp. 26.500'), 0)
println(total)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/15. EditText - M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Indosat/15. EditText - M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/16. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat/17. TextView-Top Up Berhasil'), 
	'Top Up Berhasil!')

String status = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat/17. TextView-Top Up Berhasil'), 0)
println(status)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat/18. TextView-Rp. 26.500'), 
	'Rp.  26.500')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat/19. TextView-085770056083'), 
	'085770056083')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat/20. TextView-Rp. 25.000'), 
	'Rp. 25.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat/21. TextView-Rp. 1.500'), 
	'Rp. 1.500')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat/22. TextView-Rp. 26.500'), 
	'Rp.  26.500')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/23. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat\\08.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa Indosat\\09.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat/24. GroupView-Button Close'), 0)

Mobile.pressBack()

Mobile.closeApplication()