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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Hapus Transaksi Terdaftar\\01.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/01.ViewGroup-Layanan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Hapus Transaksi Terdaftar\\02.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/02.GroupView-Transaksi Terjadwal'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Hapus Transaksi Terdaftar\\03.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/03.ViewGroup-Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Hapus Transaksi Terdaftar\\04.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/04.ViewGroup-Sudah Terdaftar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Hapus Transaksi Terdaftar\\05.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/05.GroupView-Delete'), 0)

//spy untuk pertanyaan dari button ya

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Hapus Transaksi Terdaftar\\06.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/06.Button-YA'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Hapus Transaksi Terdaftar\\07.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/07.EditText - M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/07.EditText - M-PIN (1)'), '111111', 
    0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Hapus Transaksi Terdaftar\\08.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/08.ViewGroup-Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Hapus Transaksi Terdaftar\\09.png')

Mobile.verifyElementText(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/09.TextView - Berhasil dihapus'), 'Transaksi terjadwal anda berhasil dihapus')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Hapus Transaksi Terdaftar\\10.png')

Mobile.tap(findTestObject('Object Repository/Layanan/Transaksi Terjadwal/Bayar/10.ViewGroup-Tutup'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-LAYANAN - Transaksi Terjadwal - Bayar - Hapus Transaksi Terdaftar\\11.png')

Mobile.closeApplication()

