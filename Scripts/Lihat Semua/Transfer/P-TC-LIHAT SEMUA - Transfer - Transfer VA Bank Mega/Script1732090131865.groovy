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
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer VA Bank Mega/01. ViewGroup-Lihat Semua'), 
    0)

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer VA Bank Mega/02. ImageView-Transfer VA Bank Mega'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer VA Bank Mega/03. TextView-verif Transfer VA'),
	'Transfer VA')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer VA Bank Mega/04. SvgView-Cek Saldo'),
	0)

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer VA Bank Mega/05. TextView-Tap Field Nomor VA'), 
    0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer VA Bank Mega/06. EditText-Tap Input Nomor Rekening'), 
    0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer VA Bank Mega/07. EditText-Set Input Nomor Rekening'), 
    '8111222000000009', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer VA Bank Mega/08. ViewGroup - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer VA Bank Mega/09. SvgView-Cek Saldo'),
	0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Transfer/Transfer VA Bank Mega/10. TextView-verif 8111222000000009'), '8111222000000009')

Mobile.delay(1)
Mobile.takeScreenshot()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

