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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\01.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/01. ViewGroup-Transfer'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\02.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/02. ViewGroup-Transfer ke Bank Lain-BI Fast'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\03.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/03. EditText-Tap Field Norek'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/04. EditText-Set Input Norek'), '081801060326530', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\04.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/05. ViewGroup-OK'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/06. SvgView-Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\05.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/07. ViewGroup-Tap Bank Tujuan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\06.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/08. EditText-Tap Cari Nama Bank'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/09. EditText-Set Cari Nama Bank'), 'BRI', 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\07.png')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/10. RadioButton-Tap BRI'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\08.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/11. EditText-Tap Nominal'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\09.png')

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/12. EditText-Set Nominal'), '10.000', 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\10.png')

Mobile.hideKeyboard()
Mobile.swipe(500, 1500, 500, 500)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/13. TextView-Tap Pesan'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/14. EditText-Set Pesan'), 'Transfer BI Fast', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\11.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/15. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/16. TextView-JOHN SMITH'), 
	'JOHN SMITH ')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/17. TextView-081801060326530'), 
	'081801060326530')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/18. TextView-Nominal Rp. 10.000'), 
	'Rp. 10.000 ')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/19. TextView-Adm Rp.0'), 
	'Rp.0 ')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/20. TextView-Total Rp. 10.000'), 
	'Rp. 10.000 ')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/21. EditText-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/22. EditText-Set M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/23. SvgView-Cek M-PIN'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\12.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/24. ViewGroup-Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\13.png')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/25. TextView-Transfer Berhasil'), 
	'Transfer Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/26. TextView-Rp.10.000'), 
	'Rp.10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/27. TextView-JOHN SMITH'), 
	'JOHN SMITH')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/28. TextView-Nominal Rp. 10.000'), 
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/29. TextView-Adm Rp.0'), 
	'Rp.0')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - BI Fast/30. TextView-Total Rp. 10.000'), 
	'Rp. 10.000')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\14.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/31. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\15.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\16.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - BI Fast/38. GroupView-Close Btn'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Transfer Ke Bank Lain-BI Fast\\17.png')

Mobile.closeApplication()

