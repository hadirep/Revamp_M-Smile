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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\01.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Kartu Kredit/01. ViewGroup-Akun Saya'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Kartu Kredit/02. TextView-verif NUR EKA RAHMAN'), 
	'NUR EKA RAHMAN')

Mobile.verifyElementText(findTestObject('Object Repository/Akun saya/Kartu Kredit/03. TextView-verif 4201920150791679'), 
	'4201920150791679')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\02.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Kartu Kredit/04. ViewGroup-Detail Akun CC'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\03.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Kartu Kredit/05. ImageView-Bayar Tagihan'), 0)

Mobile.delay(3)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\04.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\05.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Kartu Kredit/06. ImageView-Ubah Cicilan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\06.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\07.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Kartu Kredit/07. SvgView-Mega Bill'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\08.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\09.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Kartu Kredit/08. RectView-Mega Ultima Shiled'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\10.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\11.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Kartu Kredit/09. ViewGroup-Mutasi'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\12.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\13.png')

Mobile.tap(findTestObject('Object Repository/Akun saya/Kartu Kredit/10. ViewGroup-E-Billing'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\14.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\15.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\16.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-AKUN SAYA - Kartu Kredit\\17.png')

Mobile.closeApplication()

