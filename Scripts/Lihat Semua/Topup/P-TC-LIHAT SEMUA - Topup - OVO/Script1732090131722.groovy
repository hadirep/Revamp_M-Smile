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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - OVO\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/OVO/01. ViewGroup - Lihat Semua'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - OVO\\02.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/OVO/02. ImageView - OVO'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - OVO\\03.png')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/OVO/03. TextView - OVO'),
	'OVO')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - OVO\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/OVO/04. EditText - Tap Nopel'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Topup/OVO/05. EditText - Input Nopel'), '085711357924', 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - OVO\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/OVO/06. ViewGroup - Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - OVO\\06.png')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/OVO/07. TextView - verif E-Wallet'), 
	'E-Wallet')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/OVO/08. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - OVO\\07.png')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/OVO/09. EditText - verif 085711357924'), 
	'085711357924')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/OVO/10. EditText - verif OVO'), 
	'OVO')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/OVO/11. ViewGroup - Back Btn (E-Wallet)'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - OVO\\08.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/OVO/12. ViewGroup - Back Btn (Go-Pay)'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - OVO\\09.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/OVO/13. ViewGroup - Back Btn (Lihat Semua)'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - OVO\\10.png')

Mobile.closeApplication()