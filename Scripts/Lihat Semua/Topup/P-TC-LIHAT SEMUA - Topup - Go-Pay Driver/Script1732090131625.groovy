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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Go-Pay Driver\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay Driver/01. ViewGroup-Lihat Semua'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Go-Pay Driver\\02.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay Driver/02. ImageView-Gopay Driver'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay Driver/03. TextView-verif Go-Pay Driver'), 
    'Go-Pay Driver')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay Driver/04. TextView-Tap Field Input nopel'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay Driver/05. EditText-Input nopel'), 
	'085711357924', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Go-Pay Driver\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay Driver/06. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay Driver/07. SvgView-Cek Saldo'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay Driver/08. EditText-085711357924'), 
	'085711357924')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay Driver/09. EditText-Go-Pay Driver'), 
	'Go-Pay Driver')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay Driver/10. TextView-E-Wallet'), 
	'E-Wallet')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Go-Pay Driver\\04.png')

Mobile.pressBack()
Mobile.pressBack()
Mobile.pressBack()

Mobile.closeApplication()

