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
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Beli - Pulsa\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/01. ViewGroup - Lihat Semua'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Beli - Pulsa\\02.png')

Mobile.swipe(500, 1150, 500, 500)

Mobile.delay(3)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Beli - Pulsa\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/02. ImageView - Pulsa'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Beli - Pulsa\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/03. TextView - Tap Field Input Nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/04. EditText - Set Nomor'), '085711357924', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Beli - Pulsa\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/05. ViewGroup - Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Beli - Pulsa\\06.png')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/06. TextView - verif Pulsa'), 
	'Pulsa')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/07. SvgView - Cek Saldo'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/08. EditText - verif 085711357924'), 
	'085711357924')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/09. EditText - verif INDOSAT OOREDOO'), 
	'INDOSAT OOREDOO')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Beli - Pulsa\\06.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/10. ViewGroup - Back Btn (Pulsa-1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/11. TextView - verif Pulsa'), 
	'Pulsa')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/12. ViewGroup - Back Btn (Pulsa-2)'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Beli/Pulsa/13. ViewGroup - Back Btn (Lihat Semua)'), 0)

Mobile.closeApplication()

