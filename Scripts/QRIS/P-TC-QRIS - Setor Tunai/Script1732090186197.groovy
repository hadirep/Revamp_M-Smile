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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Setor Tunai\\01.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Setor Tunai/01. ViewGroup-QRIS'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Setor Tunai\\02.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Setor Tunai/02. RectView-Setor Tunai'), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/Setor Tunai/03. PathView-Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/Setor Tunai/04. EditText-Click Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/QRIS/Setor Tunai/05. EditText-Set Nominal'), '100.000', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Setor Tunai\\03.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Setor Tunai/06. ViewGroup-Lanjut'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Setor Tunai\\04.png')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Setor Tunai/07. TextView-HADI RAHMAH ESA PUTRA'),
	'HADI RAHMAH ESA PUTRA')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Setor Tunai/08. TextView-MEGA DANA ESTATEMENT'),
	'MEGA DANA ESTATEMENT')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Setor Tunai/09. TextView-010740021017780'),
	'010740021017780')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Setor Tunai/10. TextView-Rp. 100.000'),
	'Rp. 100.000')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Setor Tunai\\05.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Setor Tunai/11. TextView-Bagikan QRIS'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Setor Tunai\\06.png')

Mobile.pressBack()
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Setor Tunai\\07.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Setor Tunai/18. ViewGroup-Cek Status'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Setor Tunai\\08.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Setor Tunai/19. TextView-Pop Up OK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Setor Tunai\\09.png')

Mobile.closeApplication()
