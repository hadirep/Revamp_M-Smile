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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Terima Transfer\\01.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Terima Transfer/01. ViewGroup-QRIS'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Terima Transfer\\02.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Terima Transfer/02. GroupView-Terima Transfer'), 0)

//Mobile.tap(findTestObject('Object Repository/QRIS/Terima Transfer/03. SvgView-Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/Terima Transfer/04. EditText-Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/QRIS/Terima Transfer/04. EditText-Nominal'), '100.000', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Terima Transfer\\03.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Terima Transfer/05. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Terima Transfer/06. TextView-HADI RAHMAH ESA PUTRA'),
	'HADI RAHMAH ESA PUTRA')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Terima Transfer/07. TextView-MEGA DANA ESTATEMENT'),
	'MEGA DANA ESTATEMENT')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Terima Transfer/08. TextView-010740021017780'),
	'010740021017780')

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Terima Transfer\\04.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Terima Transfer/09. ViewGroup-Bagikan QRIS'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Terima Transfer\\05.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Terima Transfer\\06.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Terima Transfer/10. ViewGroup-Cek Status'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Terima Transfer\\07.png')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Terima Transfer/11. TextView-Transaksi Berhasil'),
	'Transaksi Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Terima Transfer/12. TextView-Rp. 100.000'),
	'Rp. 100.000')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Terima Transfer/13. TextView-FINDI NUR WITRIANI'),
	'FINDI NUR WITRIANI')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Terima Transfer/14. TextView-Nominal Rp. 100.000'),
	'Rp. 100.000')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Terima Transfer/15. TextView-Total Transfer Rp. 100.000'),
	'Rp. 100.000')

Mobile.tap(findTestObject('Object Repository/QRIS/Terima Transfer/16. ViewGroup-Bagikan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Terima Transfer\\08.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Terima Transfer\\09.png')

Mobile.closeApplication()
