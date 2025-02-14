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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Tampilkan CVV, Exp Date - Akun Existing\\01.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/01. ViewGroup-Akun Saya'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/02. TextView-Cek Saldo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Tampilkan CVV, Exp Date - Akun Existing\\02.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/03. ImageView-Tap Detail'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Tampilkan CVV, Exp Date - Akun Existing\\03.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/04. ViewGroup-Pengaturan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Tampilkan CVV, Exp Date - Akun Existing\\04.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/05. Switch-Aktifkan CVV'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Tampilkan CVV, Exp Date - Akun Existing\\05.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/06. ViewGroup-Lihat Info'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Tampilkan CVV, Exp Date - Akun Existing\\06.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/07. TextView-1'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/8. TextView-1'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/09. TextView-1'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/10. ViewGroup-1'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/11. TextView-1'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Tampilkan CVV - Exp Date/Akun Existing/12. TextView-1'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Tampilkan CVV, Exp Date - Akun Existing\\07.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Tampilkan CVV, Exp Date - Akun Existing\\08.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Tampilkan CVV, Exp Date - Akun Existing\\09.png')

Mobile.closeApplication()