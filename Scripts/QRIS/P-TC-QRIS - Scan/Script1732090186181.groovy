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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Scan\\01.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Scan/01. GroupView-QRIS'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Scan\\02.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Scan/02. SvgView-Cek Saldo'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Scan/03. TextView-TEST MERCHANT QRIS'), 
	'TEST MERCHANT QRIS')

Mobile.tap(findTestObject('Object Repository/QRIS/Scan/04. EditText-Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/QRIS/Scan/04. EditText-Nominal'), '100000', 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Scan\\03.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Scan/05. ViewGroup-Lanjut'), 0)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Scan\\04.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Scan/08. Switch-Tap Use MPC Points'), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/Scan/11. EditText-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/QRIS/Scan/12. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Scan\\05.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Scan/13. ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Scan/14. TextView-verif Bayar Pakai QRIS Berhasil'), 'Bayar Pakai QRIS Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Scan/16. TextView-verif MSP Carrefour Lebak Bulus'), 'TEST MERCHANT QRIS')

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Scan\\07.png')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Scan\\08.png')

Mobile.pressBack()
Mobile.pressBack()

Mobile.closeApplication()

