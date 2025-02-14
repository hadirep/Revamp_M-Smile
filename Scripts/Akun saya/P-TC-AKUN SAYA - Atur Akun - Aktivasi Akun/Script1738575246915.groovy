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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Aktivasi Akun\\01.png')

Mobile.tap(findTestObject('Object Repository/Akun Saya/Atur Akun/Aktivasi Akun/01. ViewGroup-Akun Saya'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Aktivasi Akun\\02.png')

Mobile.tap(findTestObject('Object Repository/Akun Saya/Atur Akun/Aktivasi Akun/02. ViewGroup-Atur Akun'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Aktivasi Akun\\03.png')

Mobile.tap(findTestObject('Object Repository/Akun Saya/Atur Akun/Aktivasi Akun/03. Switch-Aktif Sumber Dana'), 0)

Mobile.delay(15)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Aktivasi Akun\\04.png')

Mobile.startExistingApplication('com.android.mms')

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Aktivasi Akun\\05.png')

Mobile.tap(findTestObject('Object Repository/Akun Saya/Atur Akun/Aktivasi Akun/04. ViewGroup-Cek SMS Bank Mega'), 0)

Mobile.tap(findTestObject('Object Repository/Akun Saya/Atur Akun/Aktivasi Akun/05. TextView-Copy OTP'), 0)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Aktivasi Akun\\06.png')

Mobile.startExistingApplication('com.bankmega.msmiledev')

Mobile.tap(findTestObject('Object Repository/Akun Saya/Atur Akun/Aktivasi Akun/06. EditText-Tap Field Kode OTP'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/Akun Saya/Atur Akun/Aktivasi Akun/07. EditText-Tap and Hold Field Kode OTP'), 0, 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Aktivasi Akun\\07.png')

Mobile.tapAtPosition(200, 500)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Aktivasi Akun\\08.png')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Akun Saya/Atur Akun/Aktivasi Akun/08. TextView-Lanjut'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Aktivasi Akun\\09.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Aktivasi Akun\\10.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Aktivasi Akun\\11.png')

Mobile.closeApplication()

