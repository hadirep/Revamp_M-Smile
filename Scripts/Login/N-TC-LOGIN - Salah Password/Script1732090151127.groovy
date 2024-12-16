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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-LOGIN - Salah Password\\01.png')

Mobile.tap(findTestObject('Object Repository/Login/Salah Password/01. Button-Login'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Login/Salah Password/02. EditText-Input password'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Login/Salah Password/02. EditText-input password'), 'Bankmega2', 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-LOGIN - Salah Password\\02.png')

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Login/Salah Password/03. Button-Klik Login'), 0)

Mobile.delay(1)

Mobile.verifyElementText(findTestObject('Object Repository/Login/Salah Password/04. TextView-Password Salah'), 'Password Yang Anda Masukkan Salah [37]')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\N-TC-LOGIN - Salah Password\\03.png')