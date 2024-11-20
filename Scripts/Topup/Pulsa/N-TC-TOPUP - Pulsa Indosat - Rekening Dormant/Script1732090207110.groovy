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

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/01-button-topup'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Transfer/Topup/Topup Pulsa - Indosat/02-button-pulsa'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/03-EditText-Input Nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/03-EditText-Input Nomor'), '085770056083', 0)

Mobile.pressBack()

Mobile.takeScreenshot()
 
Mobile.tap(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/04-button-lanjut'), 0)

String nomor = Mobile.getText(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/05-TextView-No'), 0)

println(nomor)

Mobile.tap(findTestObject('Transfer/Topup/Topup Pulsa - Indosat/06-dropdown-nominal'), 0)

Mobile.tap(findTestObject('Transfer/Topup/Topup Pulsa - Indosat/06-dropdown-TextView-Rp. 100.000'), 0)

String nominal = Mobile.getText(findTestObject('Transfer/Topup/Topup Pulsa - Indosat/07-dropdown-nominal aftr'), 0)

println(nominal)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/08-button-lnjt'),0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/09-TextView-no'), nomor)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/09-TextView-Nominal'), nominal)

int byadm = 1500

String adm = String.format('%,d', byadm).replace(',', '.')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/09-TextView-byadm'), 'Rp. ' + adm)

String byadmin = Mobile.getText(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/09-TextView-byadm'), 0)

String nominalangka = nominal.replaceAll('[^\\d]', '') //mereplace string selain angka (Rp.) agar dapat diubah tipe datanya

int nominalint = nominalangka.toInteger()
//merubah tipe data nominal dari string ke int

int totaltopup = nominalint + byadm //perhitungan nominal paket data ditambah biaya admin

println(totaltopup)

String tot = String.format('%,d', totaltopup).replace(',', '.')

println(tot)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/09-TextView-Total'), 'Rp.  ' + tot)

String total = Mobile.getText(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/09-TextView-Total'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/10-EditText-M-pin'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/10-EditText-M-pin'), '111111', 0)

Mobile.pressBack()

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/11-button-lanjut'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/16-TextView-Error'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/16-TextView-Error'), 'Error')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/18-TextView-Rek Tidak Aktif'), 'Nomor rekening tujuan tidak ditemukan/rekening sumber dana Anda tidak aktif. Untuk aktivasi rekening sumber dana, lakukan pada menu Pengaturan Atur Akun, dengan nonaktifkan dan aktifkan kembali sebagai sumber dana lalu lakukan transaksi atas rekening tersebut [H77]')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/18-button-ok'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Transfer/Topup/Topup Pulsa - Indosat/11-button-batal'),0)

Mobile.delay(2)

Mobile.pressBack()

