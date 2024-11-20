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

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/001.ViewGroup - Bayar'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/002.ViewGroup - Telepon'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/003.ViewGroup - Daftar Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/004.TextView - INDOSAT OOREDOO'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/005.ViewGroup - Input Nomor'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/006.ViewGroup - Nomor'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/007.ViewGroup - Lanjut Konfirmasi'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/008.TextView - Konfirmasi Pembayaran'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/009.ViewGroup - Total Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/010.EditText - Input Pin'), 0)

Mobile.setText(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/011.EditText - PIN'), '111111', 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/012.ScrollView - Close Keyboard'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/Indosat/012.TextView - Nominal'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/Indosat/012.TextView - Rp. 100.000'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/Indosat/012.TextView - Biaya Admin'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/Indosat/012.TextView - Rp. 0'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/Indosat/012.TextView - Total Transfer'), 0)

Mobile.tap(findTestObject('Fitur Bayar_Telepon/Indosat/012.TextView - Rp. 100.000 (1)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/013.ViewGroup - Bayar'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/014.TextView - Pembayaran Berhasil'), 0)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/015.TextView - Rp. 100.000'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Fitur Bayar_Telepon/Indosat/016.ViewGroup - Bagikan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

