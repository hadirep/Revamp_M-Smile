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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/01-button-topup'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/02-button-paket data'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/03-EditText-input nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/03-EditText-input nomor'), '0821666666001', 0)

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/04-button-lanjut'), 0)

String nomor = Mobile.getText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/05-EditText-no'), 0)

println(nomor)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/06. SvgView-Jenis Paket'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/07. ViewGroup-10000'), 0)

String nominal = Mobile.getText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/07-TextView-nominal'), 0)

println(nominal)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/08-dropdown-waktu-tx'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/08-dropdown-sekarang'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/09-button-lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/10-TextView-notelkom'), nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/10-TextView-nominaltrx'), nominal)

int byadm = 1500

String adm = String.format('%,d', byadm).replace(',', '.')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/10-TextView-biaya-admin'), 'Rp. ' + adm)

String byadmin = Mobile.getText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/10-TextView-biaya-admin'), 0)

String nominalangka = nominal.replaceAll('[^\\d]', '') //mereplace string selain angka (Rp.) agar dapat diubah tipe datanya

int nominalint = nominalangka.toInteger()

//merubah tipe data nominal dari string ke int
int totaltopup = nominalint + byadm //perhitungan nominal paket data ditambah biaya admin

println(totaltopup)

String tot = String.format('%,d', totaltopup).replace(',', '.')

println(tot)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/10-TextView-totalpembelian'), 'Rp.  ' + tot)

String total = Mobile.getText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/10-TextView-totalpembelian'), 0)

println(total)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/11-EditText-mpin'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/11-EditText-mpin'), '111111', 0)

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/12-button- lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/13-TextView-Top Up Berhasil'), 'Top Up Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/13-TextView-nomor'), nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/13-TextView-nominal'), nominal)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/13-TextView-byadm'), byadmin)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/13-TextView-total'), total)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/Telkomsel/14-button-close'), 0)

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data Telkomsel\\08.png')

Mobile.closeApplication()

