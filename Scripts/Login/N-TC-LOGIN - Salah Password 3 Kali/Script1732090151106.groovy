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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\01.png')

Mobile.tap(findTestObject('Object Repository/Login/01. Button - LOGIN'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\02.png')

Mobile.tap(findTestObject('Object Repository/Login/02.EditText-input password'), 0)

Mobile.setText(findTestObject('Object Repository/Login/02.EditText-input password'), 'Bankmega2', 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\03.png')

Mobile.tap(findTestObject('Object Repository/Login/03. Button - Klik Login'), 0)

Mobile.verifyElementText(findTestObject('Login/04. TextView - Password Salah'), 'Password Yang Anda Masukkan Salah[37]')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\04.png')

Mobile.tap(findTestObject('Object Repository/Login/04. Button - OK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\05.png')

Mobile.tap(findTestObject('Object Repository/Login/02.EditText-input password'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Login/02.EditText-input password'), 'Bankmega2', 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\06.png')

Mobile.tap(findTestObject('Object Repository/Login/03. Button - Klik Login'), 0)

Mobile.delay(1)

Mobile.verifyElementText(findTestObject('Login/04. TextView - Password Salah'), 'Password Yang Anda Masukkan Salah[37]')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\07.png')

Mobile.tap(findTestObject('Object Repository/Login/04. Button - OK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\08.png')

Mobile.tap(findTestObject('Object Repository/Login/02.EditText-input password'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Login/02.EditText-input password'), 'Bankmega2', 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\09.png')

Mobile.tap(findTestObject('Object Repository/Login/03. Button - Klik Login'), 0)

Mobile.delay(1)

Mobile.verifyElementText(findTestObject('Login/04. TextView - Password Salah'), 'Password Yang Anda Masukkan Salah[37]')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\10.png')

Mobile.tap(findTestObject('Object Repository/Login/04. Button - OK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\11.png')

Mobile.tap(findTestObject('Object Repository/Login/02.EditText-input password'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Login/02.EditText-input password'), 'Bankmega2', 0)

Mobile.delay(1)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\12.png')

Mobile.tap(findTestObject('Object Repository/Login/03. Button - Klik Login'), 0)

Mobile.delay(1)

Mobile.verifyElementText(findTestObject('Login/05. TextView - Akun terblokir'), 'Akun terblokir karena Anda telah melebihi batas percobaan login. Silakan lakukan registrasi ulang melalui halaman Login.[22]')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\13.png')

Mobile.tap(findTestObject('Object Repository/Login/06. Button - OK'), 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-LOGIN - Salah Password 3 Kali\\14.png')

Mobile.pressBack()