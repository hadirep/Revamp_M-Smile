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
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\01.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/01. ImageView - Akun Saya'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/02. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\02.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/03. ImageView - Klik Detail Tabungan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\03.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/04. TextView - Mutasi'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\04.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/05. ViewGroup - Back Button Mutasi'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/06. TextView - E-Statement'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\05.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/07. ViewGroup - Back Button E-Statement'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/08. ImageView - Transfer'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\06.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/09. ViewGroup - Transfer ke Bank Mega'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\07.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/10. EditText - Input Nomor Rekening Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/10. EditText - Input Nomor Rekening Baru'), '010740020456886', 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\08.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/11. ScrollView - Tap Body'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/12. ViewGroup - Button OK'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/13. SvgView - Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/14. EditText - Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/14. EditText - Nominal'), '10000', 0)

Mobile.scrollToText("Pesan (Opsional")

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/15. EditText - Pesan'), 0)

Mobile.setText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/15. EditText - Pesan'), 'Test', 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\09.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/16. ViewGroup - Lanjut'), 0)

Mobile.delay(10)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/17. TextView - 010740020456886'), 
	'010740020456886 ')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/18. TextView - UAT KATALON TMG'), 
	'UAT KATALON TMG')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/19. TextView - Rp. 10.000'), 
	'Rp. 10.000 ')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/20. TextView - Rp.0'), 
	'Rp.0 ')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/21. TextView - Rp. 10.000'), 
	'Rp. 10.000 ')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/22. EditText - Input M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/22. EditText - Input M-PIN'), '111111', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/23. SvgView - Cek M-PIN'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\10.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/24. ViewGroup - Lanjut'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/25. TextView - Transfer Berhasil'), 
	'Transfer Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/26. TextView - Rp.10.000'), 
	'Rp.10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/27. TextView - Bank Mega - 010740020456886'), 
	'Bank Mega - 010740020456886')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/28. TextView - UAT KATALON TMG'), 
	'UAT KATALON TMG')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/29. TextView - Rp. 10.000'), 
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/30. TextView - Rp.0'), 
	'Rp.0')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/31. TextView - Rp. 10.000'), 
	'Rp. 10.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\11.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/33. ViewGroup - Button Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\12.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\13.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Tabungan/Transfer/40. GroupView - Button Close'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Tabungan - Transfer\\14.png')

Mobile.closeApplication()

