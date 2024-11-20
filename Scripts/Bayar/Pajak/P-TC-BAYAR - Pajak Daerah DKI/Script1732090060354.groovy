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
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\01.png')

//Mobile.callTestCase(findTestCase('Login/P-TC-LOGIN'), [:])

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/01.ViewGroup-Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/02.ViewGroup-Pajak'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\03.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/03.ViewGroup-Daftar Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/04.ViewGroup-Pajak Daerah DKI'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/05.EditText-InputNo'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/06.EditText-Input Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/07.EditText - Input Baru'), 
    '003456786100', 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/08.ViewGroup-OK'), 0)

String produk = Mobile.getText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/08.EditText-Daftar Produk'), 
    0)

println(produk)

String nomor = Mobile.getText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/09.EditText-Nomor Pelanggan'), 
    0)

println(nomor)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/10.ViewGroup-Lanjut'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/11.TextView-Produk'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/11.TextView-Produk'), 
    produk)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/11.TextView-NoPel'), 
    nomor)

String nominal = Mobile.getText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/11.TextView-Nominal'), 
    0)

println(nominal)

String admin = Mobile.getText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/11.TextView-admin'), 
    0)

String nominalangka = nominal.replaceAll('[^\\d]', '' //mereplace string selain angka (Rp.) agar dapat diubah tipe datanya
    )

String adm = admin.replaceAll('[^\\d]', '')

int nominalint = nominalangka.toInteger()

//merubah tipe data nominal dari string ke int
int admint = adm.toInteger()

int totaltopup = nominalint + admint //perhitungan nominal paket data ditambah biaya admin

String total = String.format('%,d', totaltopup).replace(',', '.')

println(total)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/11.TextView-Total'), 
    'Rp. ' + total)

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/12.ViewGroup-Input M-Pin'), 
    0)

Mobile.setText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/12.EditText-M-pin'), 
    '111111', 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/13.ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/14.TextView - Pembayaran PAJAK DAERAH (DKI Jakarta)'), 
    'Pembayaran ' + produk)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/14.TextView - 003456786100'), 
    nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/14.TextView - Rp. 55.000'), 
    nominal)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/14.TextView - Rp. 2500'), 
    admin)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Pajak-MPN/PAJAK DAERAH (DKI Jakarta)/14.TextView - Rp. 57.500'), 
    'Rp. ' + total)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Pajak Daerah DKI\\07.png')

Mobile.closeApplication()

