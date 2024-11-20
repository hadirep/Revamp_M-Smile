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
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Daftar Baru\\01.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/01.ViewGroup-Layanan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Daftar Baru\\01.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/02.GroupView-Transaksi Terjadwal'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Daftar Baru\\02.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/03.ViewGroup-Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Daftar Baru\\03.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/04.ViewGroup-Kategori Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/04.ViewGroup-Kategori-Telepon'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/05.ViewGroup-Daftar Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/05.ViewGroup-Daftar Produk-Indosat'), 
    0)

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/06.EditText-No Pelanggan'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/07.ViewGroup-Input No'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/08.EditText-Input Baru'), '085770056083', 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Daftar Baru\\04.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/09.ViewGroup-OK'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/10.EditText-Tgl Jatuh Tempo'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/10.EditText-Tgl Jatuh Tempo'), '25', 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Daftar Baru\\05.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/11.CheckBox-SnK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Daftar Baru\\06.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/12.ViewGroup-Lanjut'), 0)

String nomorhp = Mobile.getText(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/13.TextView-No'), 0)

String tgl = Mobile.getText(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/13.TextView-Tgl Jatuh Tempo'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/14.EditText-M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/14.EditText-M-PIN (1)'), '111111', 
    0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Daftar Baru\\07.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/15.ViewGroup-Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Daftar Baru\\08.png')

Mobile.waitForElementPresent(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/16.TextView-Pendaftaran Transaksi Terjadwal Berhasil'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/16.TextView-Pendaftaran Transaksi Terjadwal Berhasil'), 'Pendaftaran Transaksi Terjadwal Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/16.TextView-nohp'), nomorhp)

Mobile.verifyElementText(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/16.TextView-tgl'), tgl)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Daftar Baru\\09.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/18.GroupView-Close'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Daftar Baru\\10.png')

Mobile.closeApplication()

