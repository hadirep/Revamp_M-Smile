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

Mobile.tap(findTestObject('Object Repository/Topup/LinkAja/01.ViewGroup - Top Up'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/LinkAja/02.ViewGroup - E-Wallet'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/LinkAja/03.ViewGroup - Link Aja'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/LinkAja/04.EditText - Input Nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/LinkAja/05.EditText - Set Nomor'), '082113611992', 0)

Mobile.tap(findTestObject('Object Repository/Topup/LinkAja/06.ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/LinkAja/07.ViewGroup - Nominal 500.000 (1)'), 0)

Mobile.scrollToText('Lanjut')

Mobile.tap(findTestObject('Object Repository/Topup/LinkAja/08.ViewGroup - Lanjut'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Topup/LinkAja/09.EditText - Input PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/LinkAja/10.EditText - Set PIN'), '111111', 0)

Mobile.tap(findTestObject('Topup/LinkAja/11.ViewGroup - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/LinkAja/12.ViewGroup - Bagikan'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Topup/LinkAja/13.PathView - Exit'), 0)

Mobile.pressBack()

Mobile.closeApplication()

