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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah Jadi Cicilan\\01.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah Jadi Cicilan/01. ViewGroup-Layanan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah Jadi Cicilan\\02.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah Jadi Cicilan/02. RectView-Ubah Jadi Cicilan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah Jadi Cicilan\\03.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah Jadi Cicilan/03. ViewGroup-1 Jt'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah Jadi Cicilan\\04.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah Jadi Cicilan/04. ViewGroup-Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah Jadi Cicilan\\05.png')

Mobile.scrollToText('Saya telah setuju')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah Jadi Cicilan/05. ImageView-Ceklis SNK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah Jadi Cicilan\\06.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah Jadi Cicilan/06. EditText-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah Jadi Cicilan/07. EditText-Set M-PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah Jadi Cicilan/08. ViewGroup-Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah Jadi Cicilan\\07.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Kartu Kredit/Ubah Jadi Cicilan/09. ViewGroup-Kembali ke Homepage'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Kartu Kredit - Ubah Jadi Cicilan\\08.png')

Mobile.closeApplication()

