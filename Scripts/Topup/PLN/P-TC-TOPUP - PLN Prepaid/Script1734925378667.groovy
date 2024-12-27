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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - PLN - Prepaid\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/01. ViewGroup-Topup'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - PLN - Prepaid\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/02. View-PLN'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - PLN - Prepaid\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/03. EditText-Tap Nopel'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/04. EditText-Set Nopel'), '110026302395', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - PLN - Prepaid\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/05. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/06. SvgView-Daftar Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/07. TextView-PLN PRABAYAR'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - PLN - Prepaid\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/08. ViewGroup-Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/09. SvgView-Tap Nominal'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/10. TextView-NOMINAL BARU'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/11. SvgView-Tap Nominal Baru'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/12. TextView-Rp. 20.000'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/13. EditText-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/14. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - PLN - Prepaid\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/15. ViewGroup-Lanjut'), 0)

Mobile.delay(10)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - PLN - Prepaid\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/16. ViewGroup-Bagikan'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - PLN - Prepaid\\08.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - PLN - Prepaid\\09.png')

Mobile.delay(1)
Mobile.tap(findTestObject('Object Repository/Topup/PLN/Prepaid-Positive/17. GroupView-Close Button'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - PLN - Prepaid\\10.png')

Mobile.delay(1)
Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - PLN - Prepaid\\11.png')

Mobile.closeApplication()