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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Ke Bank Lain-Online\\01.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Online/01.ViewGroup-Transfer'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Ke Bank Lain-Online\\02.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Online/02.ViewGroup-Transfer Online'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Ke Bank Lain-Online\\03.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Online/03.EditText-Input Norek'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Online/03.EditText-Input Norek (1)'), '12345678', 
    0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Ke Bank Lain-Online\\04.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Online/04.ViewGroup-OK'), 0)

String norek = Mobile.getText(findTestObject('Object Repository/Transfer/Transfer - Online/05.TextView-Norek'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Online/05.ViewGroup-Pilih Bank'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Online/06.RadioButton-Mandiri'), 0)

String bank = Mobile.getText(findTestObject('Object Repository/Transfer/Transfer - Online/05.TextView-Bank Tujuan'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Online/07.EditText - Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Online/07.EditText - Nominal'), '10000', 0)

String nominal = Mobile.getText(findTestObject('Object Repository/Transfer/Transfer - Online/05.EditText-Nominal'), 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Ke Bank Lain-Online\\05.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Online/08.ViewGroup-Lanjut'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Online/09.TextView-Transfer Ke MANDIRI'), 'Transfer Ke ' + bank)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Online/09.TextView-Norek Tujuan'), norek+' ')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Online/09.TextView-Nominal'), 'Rp. '+nominal+' ')

int byadm = 6500

String adm = String.format('%,d', byadm).replace(',', '.')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Online/09.TextView-Biaya admin'), 'Rp. ' + adm+' ')

String nominalangka = nominal.replaceAll('[^\\d]', '' )//mereplace string selain angka (Rp.) agar dapat diubah tipe datanya

int nominalint = nominalangka.toInteger() //merubah tipe data nominal dari string ke int

int totaltopup = nominalint + byadm //perhitungan nominal tf ditambah biaya admin

println(totaltopup)

String tot = String.format('%,d', totaltopup).replace(',', '.')

println(tot)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Online/09.TextView-Total'), 'Rp. ' + tot+' ')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Online/10.ViewGroup-Input M-Pin'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Online/10.EditText-Input M-Pin'), '111111', 
    0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Ke Bank Lain-Online\\06.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Online/11.ViewGroup-Lanjut'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transfer/Transfer - Online/12.TextView-Transfer Berhasil'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Online/12.TextView-Transfer Berhasil'), 'Transfer Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Online/12.TextView- Bank-Norek'), bank+' - '+norek)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Online/12.TextView-nominal'), 'Rp. '+nominal)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Online/12.TextView-Biaya adm'), 'Rp. ' + adm)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Online/12.TextView-TotalTF'), 'Rp. ' + tot)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Ke Bank Lain-Online\\07.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Online/13.GroupView-Close'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Ke Bank Lain-Online\\08.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-TRANSFER - Ke Bank Lain-Online\\09.png')

Mobile.closeApplication()

