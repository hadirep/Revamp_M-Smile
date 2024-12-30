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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah PIN\\01.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah PIN/01. ViewGroup-Layanan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah PIN\\02.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah PIN/02. SvgView-Ubah PIN'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah PIN\\03.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah PIN/03. ViewGroup-Tanggal Lahir'), 0)

Mobile.delay(15)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah PIN\\04.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah PIN/04. Button-Confirm'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah PIN/05. EditText-Tap PIN Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah PIN/06. EditText-Set PIN Baru'), '222222', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah PIN/07. EditText-Konfirm PIN Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah PIN/08. EditText-Konfirm Set PIN Baru'), '222222', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah PIN\\05.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah PIN/09. ViewGroup-Ubah'), 0)

Mobile.delay(10)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah PIN\\06.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah PIN/10. ViewGroup-OK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah PIN\\07.png')

Mobile.closeApplication()