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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa - XL-Axis\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/01. SvgView-Topup dan Bayar'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa - XL-Axis\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/02. View-Pulsa'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa - XL-Axis\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/03. EditText-Input No HP'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/03. EditText-Input No HP'),
	'087777190770', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa - XL-Axis\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/04. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/05. GroupView-Pilih Nominal'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/06. TextView-25000'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa - XL-Axis\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/07. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/08. TextView-verif Pembelian XL - AXIS'),
	'Pembelian XL / AXIS')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/09. TextView-verif 087777190770'),
	'087777190770')

String nomor = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/09. TextView-verif 087777190770'), 0)
println(nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/10. TextView-verif Nominal Rp. 25.000'),
	'Rp. 25.000')

String nominal = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/10. TextView-verif Nominal Rp. 25.000'), 0)
println(nominal)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/11. TextView-verif Adm Rp. 1.500'),
	'Rp. 1.500')

String admin = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/11. TextView-verif Adm Rp. 1.500'), 0)
println(admin)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/12. TextView-verif Total Rp. 26.500'),
	'Rp.  26.500')

String total = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/12. TextView-verif Total Rp. 26.500'), 0)
println(total)

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/13. EditText-M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/13. EditText-M-PIN'),
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa - XL-Axis\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/14. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/15. TextView-verif Top Up Berhasil'),
	'Top Up Berhasil!')

String status = Mobile.getText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/15. TextView-verif Top Up Berhasil'), 0)
println(status)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/16. TextView-verif Rp. 26.500'),
	'Rp.  26.500')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/17. TextView-verif 087777190770'),
	'087777190770')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/18. TextView-verif Nominal Rp. 25.000'),
	'Rp. 25.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/19. TextView-verif Adm Rp. 1.500'),
	'Rp. 1.500')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/20. TextView-verif Total Rp. 26.500'),
	'Rp.  26.500')

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa - XL-Axis\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/21. ViewGroup-Bagikan'), 0)

Mobile.delay(4)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa - XL-Axis\\08.png')

Mobile.delay(2)
Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa - XL-Axis\\09.png')

Mobile.tap(findTestObject('Object Repository/Topup/Pulsa/XL-Axis/22. GroupView-Close Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa - XL-Axis\\10.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Pulsa - XL-Axis\\11.png')

Mobile.closeApplication()