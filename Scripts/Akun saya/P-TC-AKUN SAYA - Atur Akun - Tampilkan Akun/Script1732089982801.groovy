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

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Tampilkan Akun\\01.png')

Mobile.tap(findTestObject('Akun saya/Atur Akun/Tampilkan Akun/01. PathView-Akun Saya'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Tampilkan Akun\\02.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Atur Akun/Tampilkan Akun/02. ViewGroup-Atur Akun'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Tampilkan Akun\\03.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Atur Akun/Tampilkan Akun/03. ViewGroup-Tampilkan Akun (1))'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Tampilkan Akun\\04.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Atur Akun/Tampilkan Akun/04. ViewGroup-Pilih Tipe Akun (1))'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Tampilkan Akun\\05.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Atur Akun/Tampilkan Akun/05. ViewGroup-Pilih Tabungan (1))'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Tampilkan Akun\\06.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Atur Akun/Tampilkan Akun/06. ViewGroup-Ceklis Tabungan (1))'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Tampilkan Akun\\07.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Atur Akun/Tampilkan Akun/07. ViewGroup-Tambah (1))'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Tampilkan Akun\\08.png')

Mobile.pressBack()

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Tampilkan Akun\\09.png')

Mobile.pressBack()

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Atur Akun - Tampilkan Akun\\10.png')

Mobile.closeApplication()

