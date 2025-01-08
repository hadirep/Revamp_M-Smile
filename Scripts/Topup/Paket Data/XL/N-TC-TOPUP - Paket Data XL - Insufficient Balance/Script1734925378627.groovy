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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\01.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/01. Button-Topup'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\02.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/02. Button-Paket Data'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\03.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/03. EditText-Input Nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/03. EditText-Input Nomor'), '087777190770', 0)

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\04.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/04. Button-Lanjut'), 0)

Mobile.delay(3)
Mobile.swipe(900, 500, 100, 500)

Mobile.delay(2)
Mobile.swipe(900, 500, 100, 500)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/05. SvgView-Jenis Paket'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/06. ViewGroup-32000'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/07. SvgView-Waktu Transaksi'), 0)

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/08. ViewGroup-Sekarang'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\05.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/09. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/10. TextView-verif Pembelian PAKET DATA XL'), 
	'Pembelian PAKET DATA XL')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/11. TextView-verif 087777190770'), 
	'087777190770')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/12. TextView-verif Nominal Rp. 32.000'), 
	'Rp. 32.000')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/13. TextView-verif Adm Rp. 1.500'), 
	'Rp. 1.500')

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/14. TextView-verif Rp.  33.500'), 
	'Rp.  33.500')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/15. EditText-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/16. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\06.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/17. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/18. TextView-verif Insufficient Balance'),
	'Dana Anda tidak cukup untuk melakukan transaksi. Pastikan sumber dana yang anda pilih cukup untuk melakukan transaksi [M51]')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\07.png')

Mobile.tap(findTestObject('Object Repository/Topup/Paket Data/XL-Axis - Insufficient Balance/19. ViewGroup-OK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\08.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\09.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\10.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\11.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TOPUP - Paket Data XL-Axis - Insufficient Balance\\12.png')

Mobile.closeApplication()

