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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TOPUP - Paket Data XL - Insufficient Balance\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/01-button-topup'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TOPUP - Paket Data XL - Insufficient Balance\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/02-button-paket data'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TOPUP - Paket Data XL - Insufficient Balance\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/03-EditText-input nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/03-EditText-input nomor'), '087777190770', 
    0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TOPUP - Paket Data XL - Insufficient Balance\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/04-button-lanjut'), 0)

String nomor = Mobile.getText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/05-EditText-no'), 0)

println(nomor)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/06-dropdown-jenispkt'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Topup/XL-Axis/06-ViewGroup-paket internet'), 0)

String nominal = Mobile.getText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/07-TextView-Nominal'), 
    0)

println(nominal)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/08-dropdown-waktu-tx'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/08-dropdown-sekarang'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TOPUP - Paket Data XL - Insufficient Balance\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/09-button-lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/10-TextView-no'), nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/10-TextView-nominaltrx'), 
    nominal)

int byadm = 1500

String adm = String.format('%,d', byadm).replace(',', '.')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/10-TextView-biaya-admin'), 
    'Rp. ' + adm)

String byadmin = Mobile.getText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/10-TextView-biaya-admin'), 
    0)

String nominalangka = nominal.replaceAll('[^\\d]', '' //mereplace string selain angka (Rp.) agar dapat diubah tipe datanya
    )

int nominalint = nominalangka.toInteger()

//merubah tipe data nominal dari string ke int
int totaltopup = nominalint + byadm //perhitungan nominal paket data ditambah biaya admin

println(totaltopup)

String tot = String.format('%,d', totaltopup).replace(',', '.')

println(tot)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/10-TextView-totalpembelian'), 
    'Rp.  ' + tot)

String total = Mobile.getText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/10-TextView-totalpembelian'), 
    0)

println(total)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/11-EditText-m-pin'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/11-EditText-m-pin'), '111111', 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TOPUP - Paket Data XL - Insufficient Balance\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/12-button- lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/17-TextView - Error'), 'Error')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/17-TextView - Dana tidak cukup'), 'Dana Anda tidak cukup untuk melakukan transaksi. Pastikan sumber dana yang anda pilih cukup untuk melakukan transaksi [M51]')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TOPUP - Paket Data XL - Insufficient Balance\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/17-button-ok'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis/16-ViewGroup-button Batal'), 0)

Mobile.pressBack()

Mobile.closeApplication()