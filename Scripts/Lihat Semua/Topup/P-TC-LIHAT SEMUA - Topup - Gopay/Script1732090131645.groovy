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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Gopay\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/01. ViewGroup - Lihat Semua'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Gopay\\02.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/02. ImageView - Gopay'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Gopay\\03.png')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/03. TextView - Go-Pay'),
	'Go-Pay')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Gopay\\04.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/04. EditText - Tap Nopel'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/05. EditText - Input Nopel'), '085711357924', 
    0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Gopay\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/06. ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/07. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Gopay\\06.png')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/08. EditText - verif 085711357924'),
	'085711357924')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/09. EditText - verif Go-Pay'), 
	'Go-Pay')

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/11. TextView - verif E-Wallet'), 
	'E-Wallet')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Gopay\\07.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/12. ViewGroup - Back Btn (E-Wallet)'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Gopay\\08.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/13. ViewGroup - Back Btn (Go-Pay)'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Gopay\\09.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Topup/Go-Pay/14. ViewGroup - Back Btn (Lihat Semua)'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Topup - Gopay\\10.png')

Mobile.closeApplication()