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

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/001.ViewGroup - Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/002.ViewGroup - Telepon'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/003.EditText - Daftar Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/004.TextView - XL'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/005.EditText - Input nomor'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/006.TextView - 087788142422 nomor XL'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/007.TextView - Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/008.ViewGroup - Lanjut Konfirmasi'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/009.EditText - input pin'), 0)

Mobile.setText(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/010.EditText - PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/011.ScrollView - Close keyboard'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/012.TextView - Konfirmasi Pembayaran'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/XL/012.TextView - Nominal'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/XL/012.TextView - Rp. 70.000'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/XL/012.TextView - Biaya Admin'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/XL/012.TextView - Rp. 1500'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/XL/012.TextView - Total Transfer'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/XL/012.TextView - Rp. 71.500'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/014.ViewGroup - Bayar'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/016TextView - Pembayaran Berhasil'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/XL/016.TextView - Rp. 70.000'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/XL/015.ViewGroup - Bagikan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

