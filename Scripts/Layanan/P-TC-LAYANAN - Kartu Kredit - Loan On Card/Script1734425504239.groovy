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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\01.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/01. ViewGroup-Layanan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\02.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/02. RectView-Loan On Card'), 0)

Mobile.delay(10)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\03.png')

Mobile.delay(1)
Mobile.swipe(600, 1500, 600, 200)

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/03. EditText-Tap Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/04. EditText-Set Nominal'), '1000000', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\04.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/05. ViewGroup-Ajukan Sekarang'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\05.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/06. ViewGroup-Lanjut'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\06.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/07. ViewGroup-Pilih Rekening Penerima'), 
    0)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\07.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/08. ViewGroup-Dropdown'), 0)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\08.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/09. ViewGroup-Lanjut'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\09.png')

Mobile.startExistingApplication('com.android.mms')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\10.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/10. ViewGroup-Klik detail SMS'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/11. TextView-Copy OTP'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\11.png')

Mobile.startExistingApplication('com.bankmega.msmiledev')

Mobile.delay(3)
Mobile.tapAndHold(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/12. ViewGroup-Tap and Hold'), 0, 0)

Mobile.delay(1)
Mobile.tapAtPosition(200, 1212)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\12.png')

Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/13. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/14. ImageView-Centang SNK'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/15. EditText-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/16. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\13.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/17. ViewGroup-Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\14.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Loan On Card/14. ViewGroup-Status Pengajuan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Loan On Card\\15.png')

Mobile.closeApplication()

