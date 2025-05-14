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

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\01.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - Tiket/01. Top Up_Bayar - Tiket'), 0)

Mobile.delay(5)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\02.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - Tiket/02. Tiket'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/03. SvgView-Cek Saldo'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\04.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - Tiket/03. Daftar Produk'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\05.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - Tiket/04. KAI'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\06.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - Tiket/05. Nomor Pelanggan'), 0)

Mobile.setText(findTestObject('01.New Update Script Repo/Top Up Bayar - Tiket/06. Input Nopel'), '1999123459001', 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\07.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - Tiket/07. OK'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\08.png')

Mobile.tap(findTestObject('01.New Update Script Repo/Top Up Bayar - Tiket/08. Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/10. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/17. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Tiket/KAI/18. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\09.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/19. ViewGroup-Bayar'), 0)

Mobile.delay(10)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Tiket/KAI/27. ViewGroup-Bagikan'), 0)

Mobile.delay(4)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\11.png')

Mobile.pressBack()

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\12.png')

Mobile.tapAtPosition(1147, 465)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Tiket - KAI\\13.png')

Mobile.closeApplication()

