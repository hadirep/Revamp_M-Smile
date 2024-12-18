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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Layanan - Ubah PIN\\01.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/01. ViewGroup-Lihat Semua'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Layanan - Ubah PIN\\02.png')

Mobile.scrollToText('Delivery Tracking')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Layanan - Ubah PIN\\03.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/02. ImageView-Ubah PIN'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Layanan - Ubah PIN\\04.png')

Mobile.delay(1)
Mobile.tap(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/03. TextView-Tap 6 Digit M-PIN Lama'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/04. EditText-Set M-PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/05. ViewGroup-Tap 6 Digit M-PIN Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/06. EditText-Set M-PIN baru'), '222222', 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/07. ViewGroup-Tap Konfirm M-PIN baru'), 0)

Mobile.setText(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/08. EditText-Set M-PIN Baru'), '222222', 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/09. ImageView-Cek M-PIN Lama'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/10. ImageView-Cek M-PIN Baru'), 0)

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/11. ImageView-Cek Konfrim M-PIN Baru'), 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Layanan - Ubah PIN\\05.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/12. ViewGroup-Ubah'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/13. TextView-verif M-PIN Berhasil Diubah'), 'M-PIN Berhasil Diubah')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Layanan - Ubah PIN\\06.png')

Mobile.tap(findTestObject('Object Repository/Lihat Semua/Layanan/Ubah PIN/14. ViewGroup-Tutup'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-LIHAT SEMUA - Layanan - Ubah PIN\\07.png')

Mobile.closeApplication()