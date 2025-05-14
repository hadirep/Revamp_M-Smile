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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Mega Zaver\\01.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Tabungan/Mega Zaver/01. ViewGroup-Register'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Mega Zaver\\02.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Tabungan/Mega Zaver/02. ViewGroup-Belum'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Mega Zaver\\03.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Tabungan/Mega Zaver/03. ViewGroup-Tabungan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Mega Zaver\\03.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Tabungan/Mega Zaver/04. ViewGroup-Pilih'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Mega Zaver\\04.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Tabungan/Mega Zaver/05. ViewGroup-Mega Zaver'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Mega Zaver\\04.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Tabungan/Mega Zaver/06. ViewGroup-Registrasi M-Smile'), 0)

Mobile.tap(findTestObject('Object Repository/Apply NTB/Tabungan/Mega Zaver/07. EditText-Tap no HP'), 0)

Mobile.setText(findTestObject('Object Repository/Apply NTB/Tabungan/Mega Zaver/08. EditText-Set no HP'), '085770056083', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Mega Zaver\\05.png')

Mobile.tap(findTestObject('Object Repository/Apply NTB/Tabungan/Mega Zaver/09. ViewGroup-Ambil Foto'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-APPLY NTB - Mega Zaver\\06.png')

Mobile.closeApplication()

