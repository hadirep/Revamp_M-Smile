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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TRANSFER - Overbooking - Akun Penerima Closed\\01.png')

Mobile.tap(findTestObject('Transfer/Transfer - Overbooking/01.Button-Transfer'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TRANSFER - Overbooking - Akun Penerima Closed\\02.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Overbooking/02.Button-tf bank mega'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Overbooking/03.EditText-Input Norek'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/03.EditText-Input Norek'),'010740021019508', 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TRANSFER - Overbooking - Akun Penerima Closed\\03.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Overbooking/04.Button-OK'), 0)

String norek = Mobile.getText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/05.TextView-Norek'), 0)

println(norek)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Overbooking/06.EditText - Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/06.EditText - Nominal'), '100000', 0)

Mobile.pressBack()

String nominal = Mobile.getText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/07.TextView-Nominal'), 0)

println(nominal)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Overbooking/08.EditText-Pesan'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/08.EditText-Pesan-2'), 'UAT', 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TRANSFER - Overbooking - Akun Penerima Closed\\04.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Overbooking/09.button-lanjut'), 0)

Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transfer/Transfer - Overbooking/10.TextView-Transfer'),0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/10.TextView-norek'), norek+' ')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/10.TextView-nominal'), 'Rp. ' + nominal +' ')

int byadm = 0

String adm = String.format('%,d', byadm).replace(',', '.')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/10.TextView-byadm'), 'Rp.' + adm+' ')

String nominalangka = nominal.replaceAll('[^\\d]', '' )//mereplace string selain angka (Rp.) agar dapat diubah tipe datanya

int nominalint = nominalangka.toInteger() //merubah tipe data nominal dari string ke int

int totaltopup = nominalint + byadm //perhitungan nominal tf ditambah biaya admin

println(totaltopup)

String tot = String.format('%,d', totaltopup).replace(',', '.')

println(tot)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/10.TextView-total'), 'Rp. ' + tot+' ')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Overbooking/11.EditText-mpin'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/11.EditText-mpin'), '111111', 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TRANSFER - Overbooking - Akun Penerima Closed\\05.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Overbooking/12-button-lanjut'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/13.TextView-Error-clsd'), 'Error')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Overbooking/13.TextView-ClosedAccount'), 'Closed Account [H78]')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\N-TC-TRANSFER - Overbooking - Akun Penerima Closed\\06.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Overbooking/14-Button-OK'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Overbooking/15.Button-Batal'), 0)

Mobile.delay(2)

Mobile.pressBack()

Mobile.closeApplication()

