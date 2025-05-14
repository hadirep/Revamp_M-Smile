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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/01. SvgView-Topup dan Bayar'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/02. View-Pulsa'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat - Insuficcient Balance\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/03. EditText-Input No HP'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/03. EditText-Input No HP'),
	'085770056083', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat - Insuficcient Balance\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/04. ViewGroup-Lanjut'), 0)

Mobile.delay(2)

Mobile.swipe(900, 500, 100, 500)

Mobile.swipe(900, 500, 100, 500)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/05. PathView-Pilih Nominal'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/06. TextView-25000'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat - Insuficcient Balance\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/07. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/08. TextView-Pembelian INDOSAT OOREDOO'),
	'Pembelian INDOSAT OOREDOO')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/09. TextView-verif 085770056083'), 
	'085770056083')

String nomor = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/09. TextView-verif 085770056083'), 0)
println(nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/10. TextView-Rp. 25.000'), 
	'Rp. 25.000')

String nominal = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/10. TextView-Rp. 25.000'), 0)
println(nominal)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/11. TextView-Rp. 1.500'), 
	'Rp. 1.500')

String admin = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/11. TextView-Rp. 1.500'), 0)
println(admin)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/12. TextView-Rp. 26.500'), 
	'Rp.  26.500')

String total = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/12. TextView-Rp. 26.500'), 0)
println(total)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/13. EditText-M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/13. EditText-M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat - Insuficcient Balance\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/14. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/15. TextView-verif Insuficcient Balance'),
	'Dana Anda tidak cukup untuk melakukan transaksi. Pastikan sumber dana yang anda pilih cukup untuk melakukan transaksi [H51]')

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat - Insuficcient Balance\\07.png')

Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/Indosat - Insuficcient Balance/16. TextView-OK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat - Insuficcient Balance\\08.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat - Insuficcient Balance\\09.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat - Insuficcient Balance\\10.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat - Insuficcient Balance\\11.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-020 - P-TC-TOPUP - Pulsa Indosat - Insuficcient Balance\\12.png')

Mobile.closeApplication()